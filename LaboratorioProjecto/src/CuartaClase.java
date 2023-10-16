//import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class CuartaClase {
    public static void main(String[] args) {

        Scanner real = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        //Random aleatorio = new Random(System. currentTimeMillis());

        System.out.println("EJERCICIO 1:");
        System.out.println("Ingrese numeros positivos y negativos:");
        int [] n = new int[10];
        int i, positivos, negativos, contP, contN;
        positivos = 0; negativos = 0; contP = 0; contN = 0;
        
        for (i = 0; i < n.length; i++){
            System.out.print("Ingrese el numero "+ (i+1) + " del arreglo: ");
            n[i] = sc.nextInt();
            if (n[i] > 0){
                positivos += n[i];
                contP++;
            } else {
                negativos += n[i];
                contN++;
            }
        }
        System.out.println("ARREGLO DEL EJERCICIO 1: ");
        for (i = 0; i < n.length; i++){
            System.out.print("["+ n[i] + "]");
        }
        System.out.println(" ");
        System.out.println("La media de numeros positivos ingresados es = "+positivos/contP);
        System.out.println("La media de numeros negativos ingresados es = "+negativos/contN);

        System.out.println("------------");
        System.out.println("EJERCICIO 2:");
        n = new int[10];

        for (i = 0; i < n.length; i++){
            System.out.print("Ingrese el numero "+ (i+1)+ " del arreglo: ");
            n[i] = sc.nextInt();
        }
        System.out.println(" ");

        System.out.println("ARREGLO DEL EJERCICIO 2:");
        for (i = 0; i < n.length; i++){
            if (i % 2 == 0){
                System.out.print("["+n[i]+"]");
            }
        }
        System.out.println(" ");

        System.out.println("------------");
        System.out.println("EJERCICIO 3:");
        int cant, porc = 0;

        //definimos el tamaño del arreglo
        System.out.println("Ingrese la cantidad de alumnnos que desea evaluar: ");
        cant = sc.nextInt();
        double [] alumnos = new double[cant];
        double  total = 0, media = 0;
        for (i = 0; i < alumnos.length; i++){
            // asignamos las notas
            do{
                System.out.print("Ingrese la nota del alumno " + (i+1) + " (entre el 1 y 10): ");
                alumnos[i] = sc.nextDouble();
            } while (alumnos[i] > 10 || alumnos[i] < 0);
            // sumamos el total y el porcentaje para calcular la media
            total += alumnos[i];
            porc++;
        }
        // usamos DecimalFormat para redondedear la media
        DecimalFormat df = new DecimalFormat("#.0");
        media = total / porc;
        System.out.println(" ");
        System.out.println("La media de la nota de los alumnos fue de "+df.format(media)+".");
        for (i = 0; i < alumnos.length; i++){
            if (alumnos[i] > media){
                System.out.println("EL alumno "+(i+1)+" ha obtenido una nota de "+ alumnos[i]+" superior a la media.");
            }
        }

        System.out.println("------------");
        System.out.println("EJERCICIO 4:");
        int contador = 0;
        int [] pares = new int[20];
        for (i = 0; i < pares.length; i++){
            while (contador % 2 != 0){
                contador++;
            }
            pares[i] = contador;
            contador++;
        }
        for (i = 0; i < pares.length; i++){
            System.out.print("["+pares[i]+"]");
        }
        System.out.println(" ");

        System.out.println("------------");
        System.out.println("EJERCICIO 5:");
        System.out.println("Ingrese numeros positivos, negativos y ceros:");
        int [] x = new int[10];
        int posi = 0, nega = 0, cero = 0;
        for (i = 0; i < x.length; i++){
            System.out.print("Ingrese el numero "+(i+1)+" del arreglo: ");
            x[i] = sc.nextInt();
            if (x[i] > 0){
                posi++;
            } else if (x[i]<0){
                nega++;
            } else{
                cero++;
            }
        }
        System.out.println("ARREGLO DEL EJERCICIO 5:");
        for (i = 0; i < x.length; i++){
            System.out.print("["+x[i]+"]");
        }
        System.out.println(" ");
        System.out.println("Se ingresaron un total "+posi+" de numeros positivos.");
        System.out.println("Se ingresaron un total "+nega+" de numeros negativos.");
        System.out.println("Se ingresaron un total "+cero+" de ceros");

        System.out.println("------------");
        System.out.println("EJERCICIO 6:");
        System.out.println("Ingrese numeros positivos y negativos:");
        n = new int[10];
        positivos = 0; negativos = 0; contP = 0; contN = 0;

        for (i = 0; i < n.length; i++){
            System.out.print("Ingrese el numero "+ (i+1) + " del arreglo: ");
            n[i] = sc.nextInt();
            if (n[i] > 0){
                positivos += n[i];
                contP++;
            } else {
                negativos += n[i];
                contN++;
            }
        }
        System.out.println(" ");
        System.out.println("ARREGLO DEL EJERCICIO 6: ");
        for (i = 0; i < n.length; i++){
            System.out.print("["+ n[i] + "]");
        }
        System.out.println(" ");
        System.out.println("La media de numeros positivos ingresados es = "+positivos/contP);
        System.out.println("La media de numeros negativos ingresados es = "+negativos/contN);


        System.out.println("------------");
        System.out.println("EJERCICIO 7:");
        int N, media_mayor = 0, media_menor = 0;
        System.out.print("Ingrese la cantidad de personas: ");
        N = sc.nextInt();
        double [] alturas = new double[N];
        double suma = 0, media_altura = 0;
        for (i = 0; i < alturas.length; i++){
            System.out.print("Ingrese la altura de la persona N°"+ (i+1)+": ");
            alturas[i] = real.nextDouble();
            suma += alturas[i];
        }
        media_altura = suma / N;
        for (i = 0; i < alturas.length; i++){
            if (alturas[i] > media_altura){
                media_mayor++;
            } else {
                media_menor++;
            }
        }
        System.out.println("Huvo un total de "+media_mayor+" personas que superaron la media de altura.");
        System.out.println("Huvo un total de "+media_menor+" personas que no alcanzaron la media de altura.");


        System.out.println("------------");
        System.out.println("EJERCICIO 8:");
        String [] names = new String[20];
        int employee = 0;
        double [] salaries = new double[20];
        double high_salary = 0;
        for (i = 0; i < 20; i++){
            System.out.println("-------------------------------------------------------");
            System.out.print("Ingrese el nombre del empleado N°" + (i+1) + ": ");
            names[i] = leer.nextLine();
            System.out.print("Ingrese el sueldo del empleado N°" + (i+1) + ": ");
            salaries[i] = real.nextFloat();
            if (salaries[i] > high_salary){
                high_salary = salaries[i];
                employee = i;
            }
        }
        System.out.println(" ");
        System.out.println("El empleado N°"+ employee + ", "+ names[employee]+", tiene el salario mas alto.");


        System.out.println("------------");
        System.out.println("EJERCICIO 9:");
        int tamanio, desde, hasta;
        System.out.print("Ingrese el tamaño del arreglo: ");
        tamanio = sc.nextInt();
        int [] array = new int[tamanio];
        System.out.println("Vamos a asignarle numeros aleatorios al arreglo!");
        System.out.print("Ingrese el numero desde el cual empieza: ");
        desde = sc.nextInt();
        System.out.print("Ingrese el numero desde el cual termina: ");
        hasta = sc.nextInt();
        llenarArreglo(desde, hasta, array);
        System.out.print("MOSTRAMOS EL ARREGLO: ");
        mostrarArreglo(array);


        System.out.println("------------");
        System.out.println("EJERCICIO 10:");
        int[][] matrizA = new int[2][3];
        int[][] matrizB = new int[2][3];
        System.out.println("Ingrese los valores de la matriz A:");
        llenarMatriz(matrizA, 2, 3);
        System.out.println("Ingrese los valores de la matriz B:");
        llenarMatriz(matrizB, 2, 3);
        System.out.println("Matriz A:");
        mostrarMatriz(matrizA, 2, 3);
        System.out.println("Matriz B:");
        mostrarMatriz(matrizB, 2, 3);
        int[][] matrizC = matrizSuma(matrizA, matrizB, 2, 3);
        System.out.println("Matriz C:");
        mostrarMatriz(matrizC, 2, 3);


        System.out.println("------------");
        System.out.println("EJERCICIO 11:");
        int [][] matriz = new int[2][4];
        System.out.println("Ingrese los valores de la matriz: ");
        llenarMatriz(matriz, 2, 4);
        System.out.println("MATRIZ:");
        mostrarMatriz(matriz, 2,4);
        System.out.println("MATRIZ TRANSPUESTA:");
        matrizTranspuesta(matriz, 2, 4);
    }

    public static void matrizTranspuesta(int [][] a, int filas, int columnas){
        int i, j;
        for (i = 0; i < columnas; i++){
            for (j = 0; j < filas; j++){
                System.out.print("[" + a[j][i] + "]");
            }
            System.out.println(" ");
        }
    }
    public static int [][] matrizSuma(int [][] a, int [][] b, int filas, int columna){
        int i, j;
        int [][] x = new int[filas][columna];
        for (i = 0; i < filas; i++){
            for (j = 0; j < columna; j++){
                x[i][j] = a[i][j] + b[i][j];
            }
        }
        return x;
    }

    public static void llenarMatriz(int [][] a, int filas, int columnas) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        for (i = 0; i < filas; i++){
            System.out.println("----------------------------------");
            for (j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor de la posicion " + i + "," + j + ": ");
                a[i][j] = sc.nextInt();
            }
            System.out.println(" ");
        }
    }
    public static void mostrarMatriz(int [][] a, int filas, int columnas){
        int i, j;
        for (i = 0; i < filas; i++){
            for (j = 0; j < columnas; j++){
                System.out.print("[" + a[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
    public static void llenarArreglo(int i, int f, int[] a){
        Random aleatorio = new Random(System. currentTimeMillis());
        int x;
        for (x = 0; x < a.length; x++){
            a[x] = aleatorio.nextInt(i, f);
        }
    }

    public static void mostrarArreglo(int[] a) {
        int i;
        for (i = 0; i < a.length; i++){
            System.out.print("[" + a[i] + "]");
        }
        System.out.println(" ");
    }
}
