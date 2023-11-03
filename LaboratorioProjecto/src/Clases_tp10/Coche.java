package Clases_tp10;

public class Coche {
    private String marca;
    private String modelo;
    private int anio;
    public boolean estado = false;

    // inicializacion:
    public void inicializacion(String ma, String mo, int a){
        marca = ma;
        modelo = mo;
        anio = a;
    }

    // marca:
    public String geMarca(){ return marca; }
    public void setMarca(String marca){ this.marca = marca ;}

    // modelo:
    public String getModelo(){ return modelo ;}
    public void setModelo(String modelo){ this.modelo = modelo ;}

    // Año:
    public int getAnio(){ return anio ;}
    public void setAnio(int anio){ this.anio = anio ;}

    // metodos :
    public void mostrar(){
        System.out.println("La marca del auto es " + marca);
        System.out.println("Su modelo es " + modelo);
        System.out.println("El año de fabricacion fue en el año " + anio);
    }

    public void acelerar(){
        if (estado == false){
            this.estado = true;
            System.out.println("El coche esta acelerando.");
        } else {
            System.out.println("El coche esta en movimiento.");
        }
    }
     public void frenar(){
        if (estado == true){
            this.estado = false;
            System.out.println("El coche esta frenando.");
        } else {
            System.out.println("El coche esta quieto.");
        }
     }
}
