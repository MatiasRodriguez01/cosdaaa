package Clases_tp10;

public class Rectangulo {
    private int ancho;
    private int alto;

    // inicializacion:
    public void inicializacion(int an, int al){
        ancho = an;
        alto = al;
    }

    // mostrar datos:
    public void motrar(){
        System.out.print("El Alto = " + alto);
        System.out.println(", El Ancho = " + ancho);
    }

    // ancho:
    public int getAncho(){ return ancho ;}
    public void setAncho(int ancho){ this.ancho = ancho ;}
    // alto:
    public int getAlto(){ return alto ;}
    public void setAlto(int alto){ this.alto = alto ;}

    // metodo:
    public int area(){
        int a = (ancho * alto);
        return a;
    }

    public int perimetro(){
        int p = (2 * (ancho+alto));
        return p;
    }
}
