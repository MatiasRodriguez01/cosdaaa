import java.util.Scanner;
import java.lang.Math;

public class SegundaClase {
    public static void main(String[] args){

        Scanner leer1 = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        Scanner leer3 = new Scanner(System.in);

        System.out.println("Ejercicio 1");
        int number1, number2;
        System.out.print("Ingrese el numero 1: ");
        number1 = leer1.nextInt();
        System.out.print("Ingrese el numero 2: ");
        number2 = leer1.nextInt();
        System.out.println("numero 1 = "+number1);
        System.out.println("numero 2 = "+number2);


        System.out.println("Ejercicio 2");
        String nombre;
        System.out.print("Ingrese su nombre: ");
        nombre = leer2.nextLine();
        System.out.println("Nombre = "+nombre);


        System.out.println("Ejercicio 3");
        int number;
        System.out.print("Ingrese un numero: ");
        number = leer1.nextInt();
        System.out.println("Doble = "+number*2);
        System.out.println("Triple = "+number*3);


        System.out.println("Ejercicio 4");
        int C;
        System.out.print("Ingrese a cantidad de grados C°, para pasar a grados F°: ");
        C = leer1.nextInt();
        System.out.println("Grados F° "+ (32 + ( 9 * C / 5)));

        System.out.println("Ejercicio 5");
        int radio;
        System.out.print("Ingrese el valor del radio: ");
        radio = leer1.nextInt();
        System.out.println("La longitud de una circunferencia es " + Math.PI * Math.pow(radio, 2));
        System.out.println("El area de una circunferencia es " + Math.PI * 2 * radio);


        System.out.println("Ejercicio 6");
        double km, cm;
        System.out.print("Ingrese la cantidad de km/h recorridos: ");
        km = leer3.nextDouble();
        cm = km / 3.6;
        System.out.println("La cantida de km/h a m/s es de "+cm);


        System.out.println("Ejercicio 7");
        int A, B;
        double c;
        System.out.print("Ingrese el cateto A: ");
        A = leer1.nextInt();
        System.out.print("Ingrese el cateto B: ");
        B = leer1.nextInt();
        c = Math.pow(A, 2) + Math.pow(B, 2);
        System.out.println("La longitud del triangulo rectangulo es "+ c);


        System.out.println("Ejercicio 8");
        double r;
        System.out.print("Ingrese el radio, para saber el volumen de una esfera: ");
        r = leer3.nextDouble();
        System.out.println((4.0/3)* Math.PI * Math.pow(r, 3));


        System.out.println("Ejercicio 9");
        double lado1, lado2, lado3, p, area;
        System.out.print("Ingrese el lado 1: ");
        lado1 = leer3.nextDouble();
        System.out.print("Ingrese el lado 2: ");
        lado2 = leer3.nextDouble();
        System.out.print("Ingrese el lado 3: ");
        lado3 = leer3.nextDouble();
        p = (lado1+ lado2+ lado3)/2;
        area = Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
        System.out.println("El area del triangulo es "+area);


        System.out.println("Ejercicio 10");
        int n;
        System.out.print("Ingrese el numero, de 3 cifras: ");
        n = leer1.nextInt();
        System.out.println("Cifra 1 = "+n/100);
        System.out.println("cifra 2 = "+(n/10)%10);
        System.out.println("cifra 3 = "+n%10);


        System.out.println("Ejercicio 11");
        int numero;
        System.out.print("Ingrese el numero, de 5 cifras: ");
        numero = leer1.nextInt();
        System.out.println(numero/10000);
        System.out.println(numero/10000+""+(numero/1000)%10);
        System.out.println(numero/10000+""+(numero/1000)%10+""+(numero/100)%10);
        System.out.println(numero/10000+""+(numero/1000)%10+""+(numero/100)%10+""+(numero/10)%10);
        System.out.println(numero/10000+""+(numero/1000)%10+""+(numero/100)%10+""+(numero/10)%10+""+number%10);


        System.out.println("Ejercicio 12");
        int num;
        System.out.print("Ingrese el numero, de 5 cifras: ");
        num = leer1.nextInt();
        System.out.println(num%10);
        System.out.println((num/10)%10+""+num%10);
        System.out.println((num/100)%10+""+(num/10)%10+""+num%10);
        System.out.println((num/1000)%10+""+(num/100)%10+""+(num/10)%10+""+num%10);
        System.out.println(num/10000+""+(num/1000)%10+""+(num/100)%10+""+(num/10)%10+""+num%10);


        System.out.println("Ejercicio 13");
        int dia, mes, anio, suma, magico;
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Ingrese el dia: ");
        dia = leer1.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = leer1.nextInt();
        System.out.print("Ingrese el año: ");
        anio = leer1.nextInt();
        suma = dia+mes+anio;
        magico = (suma/1000)+((suma/100)%10)+((suma/10)%10)+(suma%10);
        System.out.println("Su fecha de nacimiento es el "+dia+"/"+mes+"/"+anio);
        System.out.println("Suma = "+suma);
        System.out.println("Su numero magico es "+magico);


        System.out.println("Ejercicio 14");
        double iva, iva_prod;
        int cant, producto;
        System.out.print("Ingrese a cantidad de producto vendidos: ");
        cant = leer1.nextInt();
        System.out.print("Ingrese el precio del producto: ");
        producto = leer1.nextInt();
        System.out.print("Ingrese el procentaje de iva: ");
        iva = leer3.nextInt();
        iva = iva / 100.0;
        iva_prod = producto*iva+producto;
        System.out.println("La cantidad de productos vendidos fue de "+cant+" productos.");
        System.out.println("EL precio del producto es de $"+ iva_prod);
        System.out.println("Se aplico un procentaje de "+iva+"% de iva");
        System.out.println("SE VENDIO UN TOTAL DE $"+cant*iva_prod);


        System.out.println("Ejercicio 15");
        int N;
        double M;
        System.out.print("Ingrese un numero: ");
        N = leer1.nextInt();
        System.out.print("Ingrese la cantidad de cifras que quiere quitar: ");
        M = leer1.nextInt();
        M = Math.pow(10, M);
        int M_2 = (int)M;
        System.out.println("EL numero quedo en " + N / M_2);


        System.out.println("Ejercicio 16");
        double grados_C;
        System.out.print("Ingrese la cantidad de grados C° que desea: ");
        grados_C = leer3.nextInt();
        System.out.println("Los grados C° a grados F° son "+grados_C*0.8);
        System.out.println("Los grados C° a grados Kelvin son "+grados_C+273.15);

    }
}
