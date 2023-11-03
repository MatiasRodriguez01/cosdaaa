package Clases_tp10;

public class Ejer_15 {
    public static void main(String[] args) {
        Pelicula peli1 = new Pelicula();
        Pelicula peli2 = new Pelicula();
        Pelicula peli3 = new Pelicula();

        peli1.inicializacion("Lo imposible", "Juan Antonio Bayona", "1h 54m");
        peli2.inicializacion("Madagascar", "Tom McGrath", "1h 26m");
        peli3.inicializacion("300", "Zack Snyder", "1h 57m");
        System.out.println("Pelicula 1:");
        peli1.mostrar();
        System.out.println("Pelicula 2:");
        peli2.mostrar();
        System.out.println("Pelicula 3:");
        peli3.mostrar();
    }
}
