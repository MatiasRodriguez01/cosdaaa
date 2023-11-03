package Clases_tp10;

public class Ejer_12 {
    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.inicializacion(6, 4);
        rectangulo1.motrar();
        System.out.println("-----");
        System.out.println("El area del rectangulo = " + rectangulo1.area());
        System.out.println("El perimetro del rectangulo = " + rectangulo1.perimetro());
    }

}
