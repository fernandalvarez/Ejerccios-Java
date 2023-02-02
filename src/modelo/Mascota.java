package modelo;

public class Mascota {
    
    // declaración de atributos
    private int nu_ficha;
    private String nombre;
    private int edad;
    private boolean vacuna;
    private float peso;
    private float altura;
    private String tipo;
    private String clasificacion;
    private int fono;

    public Mascota(){
    }

    // se le asignan los metodos para modificar
    public Mascota (int nu_ficha,String nombre,int edad,boolean vacuna,Float peso,Float altura,String tipo,String clasificacion,int fono){
        setNu_ficha(nu_ficha);
        setNombre(nombre);
        setEdad(edad);
        setVacuna(vacuna);
        setPeso(peso);
        setAltura(altura);
        setTipo(tipo);
        setFono(fono);
    }

    // Metodos get para obtener cada uno de los atributos de Mascota.
    public int getNu_ficha(){
        return nu_ficha;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public boolean isVacuna(){
        return vacuna;
    }

    public float getPeso(){
        return peso;
    }

    public float getAltura(){
        return altura;
    }

    public String getTipo(){
        return tipo;
    }
    public String getClasificacion(){
        return clasificacion;
    }

    public int getFono(){
        return fono;
    }

    // metodos set para poder modificar los datos ingresados de alguna Mascota
    public void setNu_ficha(int nu_ficha){
        this.nu_ficha = nu_ficha;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad (int edad){
        this.edad = edad;
    }

    public void setVacuna (boolean vacuna){
        this.vacuna = vacuna;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public void setTipo (String tipo){
        this.tipo = tipo;
    }
    public void setClasificacion(String clasificacion){
        this.clasificacion = clasificacion;
    }

    public void setFono (int fono){
        this.fono = fono;
    }

    // metodo para listar registro de Mascota
    @Override
    public String toString(){
        return "Mascota" + 
                "\nnu_ficha: "+getNu_ficha()+
                "\nnombre: "+getNombre()+
                "\nedad: "+getEdad()+
                "\nvacuna: "+isVacuna()+
                "\npeso: "+getPeso()+
                "\naltura: "+getAltura()+
                "\ntipo: "+getTipo()+
                "\nclasificacion: "+getClasificacion()+
                "\nfono: "+getFono();
    }
}


