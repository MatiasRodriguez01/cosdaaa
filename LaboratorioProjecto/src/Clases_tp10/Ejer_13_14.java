package Clases_tp10;

public class Ejer_13_14 {
    public static void main(String[] args) {
        Coche miAuto = new Coche();
        miAuto.inicializacion("Chevrolet", "Cruze RS", 2021);
        miAuto.mostrar();
        System.out.println("----");
        miAuto.acelerar();
        miAuto.acelerar();
        System.out.println("----");
        miAuto.frenar();
        miAuto.frenar();
    }
}
