package Clases_tp10;

public class Ejer_1_2_3{
    public static void main(String[] args) {
        System.out.println("Ejercicio 1, 2 Y 3:");
        //EJERCICIO 1:
        Perro miPerro = new Perro();
        //Ejercicio 2:
        miPerro.inicializar("Odin", "Obejero", 6);
        miPerro.mostrarValores();
        //Ejercicio 3:
        miPerro.ladrar();
        /*
        System.out.println("------------");
        miPerro.setNombre("Marcelo");
        miPerro.setRaza("Caniche");
        miPerro.setEdad(2);
        miPerro.mostrarValores();
         */
    }
}
