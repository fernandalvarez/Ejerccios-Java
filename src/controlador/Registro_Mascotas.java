package controlador;
// importaciones para optener información o metodos de otros package
import db.Conexion;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.*;


// creación de la Clase
public class Registro_Mascotas {

    //Metodo para adicionar una nueva mascota
    public int agregarMascota( Mascota masco) throws SQLException{
        // en esta sentencia SQL no le vamos a asigna el id dado que este es auto incremental
        String query = "insert into mascota (nombre,edad,vacunas,peso,altura,tipo,clasificación,fono)"+
                        "values (?,?,?,?,?,?,?,?)";
        PreparedStatement ps =  Conexion.conectar().prepareStatement(query);
        ps.setString(1,masco.getNombre());
        ps.setInt(2,masco.getEdad());
        ps.setBoolean(3,masco.isVacuna());
        ps.setFloat(4,masco.getPeso());
        ps.setFloat(5,masco.getAltura());
        ps.setString(6,masco.getTipo());
        ps.setString(7,masco.getClasificacion());
        ps.setInt(8,masco.getFono());

        return ps.executeUpdate();
    }

    //Metodo para eliminar una mascota del registro
    public int eliminarMascota(int no_ficha)throws SQLException{
        String query = "delete from mascota where idmascota = ?";
        PreparedStatement ps = Conexion.conectar().prepareStatement(query);
        ps.setInt(1,no_ficha);
        return ps.executeUpdate();
    }

    // Metodo para modificar datos de una mascota
    // metodod super parecido a agregar pero la query se modifica
    // para poder modificar algun dato se debe conocer el numero de ficha de la mascota, la cual se puede conocer al buscar una mascota
    public int modificarMascota(Mascota mas) throws SQLException{
        String query = "update mascota setnombre = ?,edad = ?,vacunas = ?,peso = ?,altura = ?,tipo = ?,clasificación = ?,fono = ?)"+
        "where idmascota = ?";
        PreparedStatement ps =  Conexion.conectar().prepareStatement(query);
        ps.setString(1,mas.getNombre());
        ps.setInt(2,mas.getEdad());
        ps.setBoolean(3,mas.isVacuna());
        ps.setFloat(4,mas.getPeso());
        ps.setFloat(5,mas.getAltura());
        ps.setString(6,mas.getTipo());
        ps.setString(7,mas.getClasificacion());
        ps.setInt(8,mas.getFono());
        // indica dato del where en la query
        ps.setInt(9,mas.getNu_ficha());

        return ps.executeUpdate();  
    }

    // metodo buscar Mascota
    /// con este metodo se puede saber los datos registrado de una mascota en especifico
    public Mascota buscar(String nombre, int edad, String tipo) throws SQLException{
        // intanciamos unas mascota sin indicarle valor 
        Mascota mas = null;

        String query = "select * from mascota where nombre = ? and edad = ? and tipo = ?";
        PreparedStatement ps = Conexion.conectar().prepareStatement(query);
        ps.setString(1,nombre);
        ps.setInt(2,edad);
        ps.setString(3,tipo);
        // de indicamos que el resultado de la query la guarde en la variable resultado
        ResultSet resultado = ps.executeQuery();
        
        // recorre variable resultado para obtener cada uno de los datos de la mascota buscada
        while (resultado.next()){
            int nu_ficha = resultado.getInt("idmascota");
            String nombre1 = resultado.getString("nombre");
            int edad1 = resultado.getInt("edad");
            boolean vacuna = resultado.getBoolean("vacunas");
            float peso = resultado.getFloat("peso");
            float altura = resultado.getFloat("altura");
            String tipo1 = resultado.getString("tipo");
            String clasificacion = resultado.getString("clasificacion");
            int fono = resultado.getInt("fono");
            // obtenidos los valores se asigna a una mascota
            mas = new Mascota (nu_ficha,nombre1,edad1,vacuna,peso,altura,tipo1,clasificacion,fono);
        }
        // se retorna los datos de la mascota buscada
        return mas;
    }

    // metodo para listar todas las mascotas registradas
    // similar a buscar pero cambia la query y retornando una lista
    public ArrayList<Mascota> listarMascota () throws SQLException {
        // se instacia una nueva array, indicandole que es un objeto Mascota
        ArrayList<Mascota> lista = new ArrayList<>();

        // se genera query para obtener los datos
        String query = "select * from mascota";
        PreparedStatement ps = Conexion.conectar().prepareStatement(query);
        // indicamos que el resultado de la query la guarde en la variable resul
        ResultSet resul = ps.executeQuery();

          // recorre variable resultado para obtener cada uno de los datos de las mascota 
        while (resul.next()){
            int nu_ficha = resul.getInt("idmascota");
            String nombre = resul.getString("nombre");
            int edad = resul.getInt("edad");
            boolean vacuna = resul.getBoolean("vacunas");
            float peso = resul.getFloat("peso");
            float altura = resul.getFloat("altura");
            String tipo = resul.getString("tipo");
            String clasificacion = resul.getString("clasificacion");
            int fono = resul.getInt("fono");
            // obtenidos los valores se asigna a una mascota
            Mascota masco = new Mascota (nu_ficha,nombre,edad,vacuna,peso,altura,tipo,clasificacion,fono);
            // obtenido todos los datos se adiciona a la array
            lista.add(masco);
        }
        // retornamos la lista
        return lista;
    }
}

