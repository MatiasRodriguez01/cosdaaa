package Clases_tp10;

public class Estudiante {
    private String nombre;
    private int edad;
    private String identificacion;

    // nombre:
    public String getNombre(){return nombre ;}
    public void setNombre(String nombre){this.nombre = nombre ;}

    // edad:
    public int getEdad(){return edad ;}
    public void setEdad(int edad){this.edad = edad ;}

    // identificacion:
    public String getIdentificacion(){return identificacion;}
    public void setIdentificacion(String identificacion){this.identificacion = identificacion ;}

    // metodos:
    public void inicializacion(String n, int e, String iden){
        nombre = n;
        edad = e;
        identificacion = iden;
    }

}
