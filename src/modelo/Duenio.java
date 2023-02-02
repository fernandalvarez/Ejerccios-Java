package modelo;

public class Duenio {
    // declaración de atributos
    private int id_duenio;
    private String nombre;
    private int edad;
    private String direccion;
    private int fono;

    public Duenio(){
    }

    public Duenio(int id_duenio,String nombre,int edad,String direccion,int fono){

    }

    //metodo para obtener la informacion guardada en los atributos 
    public int getId_duenio(){
        return id_duenio;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getDireccion(){
        return direccion;
    }

    public int getFono(){
        return fono;
    }

    // metodo para modificar la informacionguardada en los atributos del duenio
    public void setId_duenio(int id_duenio){
        this.id_duenio = id_duenio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void setFono(int fono){
        this.fono = fono;
    }

    @Override
    public String toString(){
        return "Dueño: "+
                "\nid_duenio: "+getId_duenio()+
                "\nnombre: "+getNombre()+
                "\nedad: "+getEdad()+
                "\ndirección: "+getDireccion()+
                "\fono: "+getFono();
    }
}
