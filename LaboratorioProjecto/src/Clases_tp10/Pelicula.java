package Clases_tp10;

public class Pelicula {
    private String titulo;
    private String director;
    private String duracion;

    // inicializacion:
    public void inicializacion(String t, String d, String dura){
        titulo = t;
        director = d;
        duracion = dura;
    }

    //titulo:
    public String getTitulo(){ return titulo ;}
    public void setTitulo(String titulo){ this.titulo = titulo ;}

    // director:
    public String getDirector(){ return director ;}
    public void setDirector(String director){ this.director = director ;}

    // duracion:
    public String getDuracion(){ return duracion ;}
    public void setDuracion(String duracion){ this.duracion = duracion ;}

    // metodos:
    public void mostrar(){
        System.out.println("El titulo de la pelicula es " + titulo);
        System.out.println("El director de la cinta es " + director);
        System.out.println("Y tiene una duracion de " + duracion);
    }
}
