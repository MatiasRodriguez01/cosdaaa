import javax.swing.*;
import java.util.Scanner;

public class Calculadora_MatiasRodriguez {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        boolean exit = false;
        char option;
        int number1, number2;

        System.out.println("Bienvenido a la calculadora:");
        while (exit == false){
            System.out.println("Ingrese una de las siguientes opciones:");
            System.out.println("1) Para realizar una suma.");
            System.out.println("2) Para realizar una resta");
            System.out.println("3) Para realizar una multiplicacion");
            System.out.println("4) Para realizar una division");
            option = leer.nextLine().charAt(0);
            System.out.println("-------");


            if (option == '1') {
                int suma;
                System.out.print("Ingrese el numero 1: ");
                number1 = sc.nextInt();
                System.out.print("Ingrese el numero 2: ");
                number2 = sc.nextInt();
                suma = number1 + number2;
                System.out.println("La suma de los 2 numeros ingresados es = "+ suma);
            } else if (option == '2') {
                int resta;
                System.out.print("Ingrese el numero 1: ");
                number1 = sc.nextInt();
                System.out.print("Ingrese el numero 2: ");
                number2 = sc.nextInt();
                resta = number1 - number2;
                System.out.println("La resta de los 2 numeros ingresados es = "+ resta);
            } else if (option == '3') {
                int multiplicacion;
                System.out.print("Ingrese el numero 1: ");
                number1 = sc.nextInt();
                System.out.print("Ingrese el numero 2: ");
                number2 = sc.nextInt();
                multiplicacion = number1 * number2;
                System.out.println("La multiplicacion de los 2 numeros ingresados es = "+ multiplicacion);
            } else if (option == '4') {
                double division, n1, n2;
                do{
                    System.out.println("-----");
                    System.out.println("Los numeros ingresados no pueden ser 0");
                    System.out.print("Ingrese el numero 1: ");
                    n1 = sc.nextInt();
                    System.out.print("Ingrese el numero 2: ");
                    n2 = sc.nextInt();
                } while (n1 == 0 || n2 == 0);
                division = n1 / n2;
                System.out.println("La division de lo4s 2 numeros ingresados es = "+division);

            } else {
                System.out.println("La opcion ingresada no es correcta");
            }
            System.out.println("----------");
            System.out.println("Desea seguir haciendo calculos?");
            System.out.print("s o n: ");
            option = leer.nextLine().toLowerCase().charAt(0);
            if (option == 'n'){
                exit = true;
            } else {
                System.out.println("-------");
            }
        }
        System.out.println("Usted a salido de la calculadora!!");
    }
}
