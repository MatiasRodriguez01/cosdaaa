package Clases_tp10;

public class Libro {
    private String titulo;
    private String autor;
    private int anio;

    // titulo:
    public String getTitulo(){ return titulo ;}
    public void setTitulo(String titulo){ this.titulo = titulo ;}

    // autor:
    public String getAutor(){ return autor ;}
    public void setAutor(String autor){ this.autor = autor ;}


    // año:
    public int getAnio(){ return anio ;}
    public void setAnio(int anio){ this.anio = anio;}

    public void inicializador(String tit, String aut, int an){
        titulo = tit;
        autor = aut;
        anio = an;
    }

    public void mostrarinformacion(){
        System.out.println("Titulo = " + titulo + ", autor = " + autor + ", año de publicacion = " + anio + ".");
    }
}
