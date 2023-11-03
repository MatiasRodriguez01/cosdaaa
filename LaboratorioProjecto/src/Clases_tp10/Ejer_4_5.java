package Clases_tp10;
import java.util.Scanner;
public class Ejer_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ejercicio 4 y 5: ");
        //EJERCICIO 4:
        Circulo elCirculo = new Circulo(); //Creamos el objeto
        elCirculo.inicializar(3); //inicializamos los valores del objeto.
        //EJERCICIO 5:
        //Mostramos los 2 valores:
        // mostramos el metodo el cual calcula el area
        System.out.println("El area del circulo es de = " + elCirculo.area());
        // mostramos el metodo el cual calcula la circunferencia
        System.out.println("La circunferencia del circulo es de = " + elCirculo.circunferencia());

        /*
        elCirculo.setRadio(5);
        // mostramos el metodo el cual calcula el area
        System.out.println("El area del circulo es de = " + elCirculo.area());
        // mostramos el metodo el cual calcula la circunferencia
        System.out.println("La circunferencia del circulo es de = " + elCirculo.circunferencia());
        */
    }
}
