import java.util.*;

public class repasoDelParcial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Programa java para calcular si la ultima cifra
        de 2 numeros enteros es la misma
         */

        System.out.println("EJERCICIO 1:");
        int number1, number2;
        System.out.print("Ingrese el primer numero: ");
        number1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        number2 = sc.nextInt();
        if (number1 % 10 == number2 % 10){
            System.out.println("La ultima cifra del numero 1 y el numero 2 son iguales.");
        } else {
            System.out.println("La ultima cifra del numero 1 y el numero 2 no son iguales.");
        }

        /*
        Programa java para comprobar si un numero
        de 3 cifra es capucua
         */

        System.out.println("EJERCICIO 2:");
        int number;
        System.out.print("Ingrese un numero de 3 cifras, para saber si es capicua: ");
        number = sc.nextInt();
        while (number < 99 || number > 1000){
            System.out.println("----");
            System.out.println("El numero no es de 3 cifras!!!");
            System.out.print("Ingrese un numero de 3 cifras, para saber si es capicua: ");
            number = sc.nextInt();
        }
        if (number / 100 == number % 10){
            System.out.println("El numero es capicua");
        } else {
            System.out.println("EL numero no es capicua");
        }
    }
}
