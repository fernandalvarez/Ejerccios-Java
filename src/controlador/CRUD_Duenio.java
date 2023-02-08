package controlador;
/**
 * @author Fernanda Alvarez
 * @since 1.0 
 * @see Modelo.Duenio
 */

import db.*;
import modelo1.*;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class CRUD_Duenio {
    
    // metodo agregar un nuevo duenio
    public int Agregar_duenio (Duenio dueno) throws SQLException{
        
        String query = "insert into duenio (nombre,edad,direccion,fono)"+
                        "values(?,?,?,?)";
        PreparedStatement ps = Conexion.conectar().prepareStatement(query);
        ps.setString(1, dueno.getNombre());
        ps.setInt(2, dueno.getEdad());
        ps.setString(3, dueno.getDireccion());
        ps.setInt(4, dueno.getFono());
        
        return ps.executeUpdate();
    }
}
