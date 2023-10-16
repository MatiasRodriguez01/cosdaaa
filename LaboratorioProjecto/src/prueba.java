import java.util.Random;
import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner real = new Scanner(System.in);
        Random aleatorio = new Random(System. currentTimeMillis());


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
}
