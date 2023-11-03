package Clases_tp10;

public class Perro {

    //datos
    private String nombre;
    private String raza;
    private int edad;

    // inicializacion:
    public void inicializar(String n, String r, int e) {
        nombre = n;
        raza = r;
        edad = e;
    }

    // nombre:
    public String getNombre(){ return nombre ;}
    public void setNombre(String nombre){ this.nombre = nombre ;}

    // raza:
    public String getRaza(){ return raza ;}
    public void setRaza(String raza){ this.raza = raza ;}

    // edad:
    public int getEdad(){ return edad ;}
    public void setEdad(int edad){ this.edad = edad ;}

    // Metodos:
    public void mostrarValores() {
        System.out.println("Mi perro de llama: " + nombre);
        System.out.println("Es de razar: " + raza);
        System.out.println("Su edad es de: " + edad);
    }

    public void ladrar(){
        System.out.println("Guau, guau");
    }
}
