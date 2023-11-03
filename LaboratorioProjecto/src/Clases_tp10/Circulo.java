package Clases_tp10;
import java.lang.Math;
public class Circulo {

    private float radio;

    public void inicializar(float r){
        radio = r;
    }

    // Radio
    public float getRadio(){return radio ;}
    public void setRadio(float radio){ this.radio = radio ;}

    // Metodos
    public float area(){
        float a = (float)(Math.PI * Math.pow(radio, 2));
        return a;
    }

    public float circunferencia(){
        //(float)(Math.PI * 2 * radio)
        float c = (float)(2 * Math.PI * radio);
        return c;
    }
}
