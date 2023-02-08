package modelo1;

public class Medico {
     // creacion de atributos
    private String nombre;
    private int edad;
    private int telefono;

     // contructor
    public Medico(){
    }
     // encapsulamiento de atributos
     // metodos get's
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public int getTelefono(){
        return telefono;
    }
     // metodos set's
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad =  edad;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    public static void main(String[] args){
         // instacia una persona
        Medico perso = new Medico();
        perso.setNombre("Fernanda");   
        perso.setEdad(23);
        perso.setTelefono(12345678);
 
        System.out.println(perso.getNombre());
        System.out.println(perso.getEdad());
        System.out.println(perso.getTelefono());
 
    }
}
