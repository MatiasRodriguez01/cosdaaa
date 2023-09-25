import java.text.DecimalFormat;
import java.util.*;

public class terceraClase {
    /*
    psvm La tecla tap
    sout LA tecla tap
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 1:");
        int num;
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("EL numero " + num + " es par.");
        } else {
            System.out.println("EL numero " + num + " es impar.");
        }


        System.out.println("EJERCICIO 2:");
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        if (num % 10 == 0) {
            System.out.println("El numero es multiplo de 10");
        } else {
            System.out.println("El numero no es multiplo de 10");
        }


        System.out.println("EJERCICIO 3:");
        char letra;
        System.out.print("Ingrese una letra: ");
        letra = sc.next().charAt(0);
        if (letra >= 'A' || letra <= 'Z') {
            System.out.println("La letra es mayuscula");
        } else {
            System.out.println("La letra no es mayuscula");
        }


        System.out.println("EJERCICIO 4:");
        int n1, n2;
        System.out.print("Ingrese el numero 1: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el numero 2: ");
        n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.println("Los numero son iguales");
        } else {
            System.out.println("Los numero no son iguales");
        }


        System.out.println("EJERCICIO 5:");
        System.out.print("Ingrese el numero 1: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el numero 2: ");
        n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.println("Los numero son iguales");
        } else if (n1 > n2) {
            System.out.println("El numero " + n1 + " es el mayor");
        } else {
            System.out.println("El numero " + n2 + " es el mayor");
        }


        System.out.println("EJERCICIO 6:");
        System.out.print("Ingrese el numero 1: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el numero 2: ");
        n2 = sc.nextInt();
        if ((n1 % 10) == (n2 % 10)) {
            System.out.println("La ultima cifra de los 2 numeros nos iguales");
        } else {
            System.out.println("La ultima cifra de los 2 numeros no nos iguales");
        }


        System.out.println("EJERCICIO 7:");
        System.out.print("Ingrese un numero:");
        num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("El numero " + num + " es multiplo de 3 y de 5");
        } else {
            System.out.println("El numero " + num + " no es multiplo de 3 y de 5");
        }


        System.out.println("EJERCICIO 8:");
        System.out.print("Ingrese un numero:");
        num = sc.nextInt();
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("El numero " + num + " es multiplo de 2 y de 3");
        } else {
            System.out.println("El numero " + num + " no es multiplo de 2 y de 3");
        }


        System.out.println("EJERCICIO 9:");
        char a, b;
        System.out.print("Ingrese un caracter A: ");
        a = sc.next().charAt(0);
        System.out.print("Ingrese un caracter B: ");
        b = sc.next().charAt(0);
        if (a == b) {
            System.out.println("Los caracteres son iguales");
        } else {
            System.out.println("Los caracteres no son iguales");
        }


        System.out.println("EJERCICIO 10:");
        String caracter1, caracter2;
        System.out.print("Ingrese un caracter A: ");
        caracter1 = sc.next();
        System.out.print("Ingrese un caracter B: ");
        caracter2 = sc.next();
        if ((caracter1 == caracter1.toLowerCase()) && (caracter2 == caracter2.toLowerCase())) {
            System.out.println("Los 2 caracteres son minusculas.");
        } else {
            System.out.println("Los 2 caracteres no son minusculas");
        }


        System.out.println("EJERCICIO 11:");
        System.out.print("Ingrese una letra: ");
        letra = sc.next().charAt(0);
        if (letra >= 0 && letra <= 9) {
            System.out.println("La letra se encuentra entre el 0 y el 9");
        } else {
            System.out.println("La letra no se encuentra entre el 0 y el 9");
        }


        System.out.println("EJERCICIO 12:");
        int number1, number2;
        System.out.print("Ingrese el numero 1: ");
        number1 = sc.nextInt();
        System.out.print("Ingrese el numero 2: ");
        number2 = sc.nextInt();
        if (number2 == 0) {
            System.out.println("EL divisor no puede ser 0!");
        } else {
            System.out.println("El resultado de la division es = " + number1 / number2);
        }


        System.out.println("EJERCICIO 13: ");
        int year;
        System.out.print("Ingrese un año para saber si es biciesto: ");
        year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("El año " + year + " es biciesto.");
        } else {
            System.out.println("El año " + year + " no es biciesto.");
        }


        System.out.println("EJERCICIO 14:");
        System.out.print("Ingrese un numero de tres cifra: ");
        num = sc.nextInt();
        if (num > 99 && num < 999) {
            if (num / 100 == num % 10) {
                System.out.println("El numero " + num + " es capicua");
            } else {
                System.out.println("El numero ingresado no es capicua");
            }
        } else {
            System.out.println("El numero ingresado no es de 3 cifras!!");
        }


        System.out.println("EJERCICIO 15:");
        int H, M, S;
        System.out.println("Ingrese la hora correspodiente");
        System.out.print("Ingrese la hora: ");
        H = sc.nextInt();
        System.out.print("Ingrese los minutos: ");
        M = sc.nextInt();
        System.out.print("Ingrese los segundos: ");
        S = sc.nextInt();
        if ((H >= 0 && H < 24) && (M >= 0 && M < 60) && (S >= 0 && S < 60)) {
            System.out.println("La hora es " + H + "/" + M + "/" + S);
        } else {
            System.out.println("Uno de los valores es incorrecto!!");
        }


        System.out.println("EJERCICIO 16:");
        int month;
        System.out.print("Ingrese el numero del mes correspodiente(1 al 12): ");
        month = sc.nextInt();
        if (month >= 1 && month < 13) {
            if (month == 1 || month == 3 || month == 5 || month == 6 || month == 8 || month == 10 || month == 12) {
                if (month == 1) {
                    System.out.println("Enero");
                } else if (month == 3) {
                    System.out.println("Marzo");
                } else if (month == 5) {
                    System.out.println("Mayo");
                } else if (month == 6) {
                    System.out.println("Junio");
                } else if (month == 8) {
                    System.out.println("Agosto");
                } else if (month == 10) {
                    System.out.println("Octubre");
                } else {
                    System.out.println("Diciembre");
                }
            } else if (month == 4 || month == 7 || month == 9 || month == 11) {
                if (month == 4) {
                    System.out.println("Abril");
                } else if (month == 7) {
                    System.out.println("Julio");
                } else if (month == 9) {
                    System.out.println("Septiembre");
                } else {
                    System.out.println("Noviembre");
                }
            } else {
                System.out.println("Febrero");
            }
        } else {
            System.out.println("EL valor ingresado no es valido!!");
        }


        System.out.println("EJERCICIO 17:");
        int note;
        System.out.print("Ingrese una nota: ");
        note = sc.nextInt();
        if (note >= 0 && note < 11) {
            if (note >= 0 && note < 5) {
                System.out.println("Insuficiente");
            } else if (note >= 5 && note < 6) {
                System.out.println("Suficiente");
            } else if (note >= 6 && note < 7) {
                System.out.println("Bien");
            } else if (note >= 7 && note < 9) {
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente");
            }
        } else {
            System.out.println("EL VALOR INGRESADO ES INVALIDO!!");
        }


        System.out.println("EJERCICIO 18:");
        System.out.println("Iniciando contador(bucle while) del 1 al 100: ");
        while (num < 101) {
            System.out.println(num);
            num++;
        }


        System.out.println("EJERCICIO 19:");
        System.out.println("Iniciando contador(bucle do while) del 1 al 100:");
        num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num < 101);


        System.out.println("EJERCICIO 20:");
        System.out.println("Iniciando contador(bucle for) del 1 al 100:");
        int i;
        for (i = 1; i <= 100; i++) {
            System.out.println(i);
        }


        System.out.println("EJERCICIO 21:");
        System.out.println("Iniciando contador(bucle while) del 100 al 1:");
        int number = 100;
        while (number > 0) {
            System.out.println(number);
            number--;
        }


        System.out.println("EJERCICIO 22:");
        System.out.println("Iniciando contador(bucle do while) del 100 al 1:");
        number = 100;
        do {
            System.out.println(number);
            number--;
        } while (number > 0 );


        System.out.println("EJERCICIO 23:");
        System.out.println("Iniciando contador(bucle for) del 100 a 1:");
        int x;
        for (x = 100; x > 0; x--){
            System.out.println(x);
        }

        System.out.println("EJERCICIO 24:");
        int N, counter1 = 1, counter2 = 1, counter3;
        System.out.print("Ingrese un numero, para iniciar un contador desde ese numero: ");
        N = sc.nextInt();
        System.out.println("1)Bucle while:");
        while (counter1 <= N){
            System.out.println(counter1);
            counter1++;
        }
        System.out.println("2)Bucle do while:");
        do{
            System.out.println(counter2);
            counter2++;
        }while (counter2 <= N);
        System.out.println("3)Bucle for:");
        for(counter3=1; counter3 <= N; counter3++){
            System.out.println(counter3);
        }


        System.out.println("EJERCICIO 25:");
        int inicio;
        System.out.print("Ingrese un numero, para iniciar un contador desde ese numero: ");
        inicio = sc.nextInt();
        int c1 = inicio, c2 = inicio, c3;
        System.out.println("1)Bucle while:");
        while (c1 >= 1){
            System.out.println(c1);
            c1--;
        }
        System.out.println("2)Bucle do while:");
        do{
            System.out.println(counter2);
            c2--;
        }while (c2 >= 1);
        System.out.println("3)Bucle for:");
        for(c3=N; c3 >= 1; c3--){
            System.out.println(c3);
        }


        System.out.println("EJERCICIO 26:");
        System.out.print("Ingrese el numero 1: ");
        number1 = sc.nextInt();
        System.out.print("Ingrese el numero 2: ");
        number2 = sc.nextInt();
        while (number1 == number2){
            System.out.println("LOS NUMEROS NO PUEDEN SER IGUALES!!!!");
            System.out.println("Ingrese los numeros nuevamente");
            System.out.print("Ingrese el numero 1: ");
            number1 = sc.nextInt();
            System.out.print("Ingrese el numero 2: ");
            number2 = sc.nextInt();
        }
        System.out.println("Iniciemos el contador: ");
        int iterador;
        if (number1 < number2){
            for (iterador = number1; iterador <= number2; iterador++){
                System.out.println(i);
            }
        } else{
            for (iterador = number2; iterador <= number1; iterador++){
                System.out.println(i);
            }
        }


        System.out.println("EJERCICIO 27:");
        int A, B;
        System.out.print("Ingrese el primer numero: ");
        A = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        B = sc.nextInt();
        if (A < B){

            for (iterador = A; iterador <= B; iterador++){
                if (iterador % 2 == 0){
                    System.out.println(iterador + " es un numero PAR");
                }
            }
        } else {
            System.out.println("EL primer numero no puede ser mayor al segundo!!");
        }


        System.out.println("EJERCICIO 28:");
        int N1, M1;
        System.out.print("Ingrese el numero, que desea saber sus multiplos: ");
        N1 = sc.nextInt();
        System.out.print("Ingrese un numero grande par saber el limite de numero a imprimir: ");
        M1 = sc.nextInt();
        while (N1 > M1){
            System.out.println("--");
            System.out.println("LOS VALORES FUERON INCORRECTOS!!, el primer numero no debe ser mayor al segundo");
            System.out.print("Ingrese el numero, que desea saber sus multiplos: ");
            N1 = sc.nextInt();
            System.out.print("Ingrese un numero grande par saber el limite de numero a imprimir: ");
            M1 = sc.nextInt();
        }
        for (i = 1; i <= M1; i++){
            if (i % N1 == 0){
                System.out.println(i + " es multiplo de " + N1);
            }
        }

        System.out.println("EJERCICIO 29:");
        double millas;
        do{
            System.out.println("----");
            System.out.print("Ingrese la cantidad de millas <<Ingrese 0 para salir>>: ");
            millas = sc.nextDouble();
            DecimalFormat df = new DecimalFormat("#.00");
            System.out.println("EL equivalente de millas a Kilometros es = "+ df.format(millas * 1.6093) + "Km");
        } while(millas != 0);
        System.out.println("Ha salido del bucle!");
    }

}
