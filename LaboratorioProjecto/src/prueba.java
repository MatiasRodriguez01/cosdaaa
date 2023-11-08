import java.text.DecimalFormat;
import java.util.*;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class prueba {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner real = new Scanner(System.in);
        Random aleatorio = new Random(System. currentTimeMillis());
        DecimalFormat df = new DecimalFormat("#.00");


        System.out.println((int)1e-9);
    }

    // EJERCICIO 1:
    public static int [][] fill_Matrix_int(int x){
        Random aleatorio = new Random();
        int [][] matrix = new int[x][x];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++){
                matrix[i][j] = aleatorio.nextInt(1, 50);
            }
        }
        return matrix;
    }

    public static int [][] sum_matrix_int(int [][] a, int [][] b, int x){
        int [][] sum = new int[x][x];
        for (int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    public static void show_matrix_int(int [][] x){
        for(int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                System.out.print("[" + x[i][j] + "]");
            }
            System.out.println(" ");
        }

    }

    // EJERCICIO 2:
    public static int [][] multiply_matrix_int(int [][] a, int [][] b, int x){
        int [][] multiply = new int[x][x];
        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++){
                multiply[i][j] = a[i][j] * b[i][j];
            }
        }
        return multiply;
    }

    //EJERCICIO 3:
    public static int [][] transposed_matrix_int(int [][] x, int tamanio){
        int [][] matriz = new int[tamanio][tamanio];
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++) {
                matriz[i][j] = x[j][i];
            }
        }
        return matriz;
    }

    // EJERCICIO 4:
    public static boolean matrices_comparison(int [][] a, int [][] b, int x){
        boolean val = true;
        for(int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                if (a[i][j] != b[i][j]){
                    val = false;
                    return val;
                }
            }
        }
        return val;
    }

    // EJERCICIO 5:

    public static int [] fill_vector_int(int tamanio){
        Random aleatorio = new Random();
        int [] vector = new int[tamanio];
        for (int i = 0; i < vector.length; i++){
            vector[i] = aleatorio.nextInt(1, 20);
        }
        return vector;
    }
    public static int [] scalar_product(int [] a, int numero){
        int [] productos = new int[a.length];
        for (int i = 0; i < a.length; i++){
            productos[i] = numero * a[i];
        }
        return productos;
    }

    // EJERCICIO 6:
    static int sum_matrix(int [][] a, int x){
        int sum = 0;
        for(int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                sum += a[i][j];
            }
        }
        return sum;
    }

    // EJERCICIO 7:
    public static int value_max(int [][] matriz, int x){
        int valor = 0;
        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++){
                if (matriz[i][j] > valor){
                    valor = matriz[i][j];
                }
            }
        }
        return valor;
    }

    //EJERCICIO 8:
    static int row_sum_matriz(int [][] a, int fila, int tamanio){
        int suma = 0;
        for (int i = 0; i < tamanio; i++){
            suma += a[(fila-1)][i];
        }
        return suma;
    }

    //EJERCICIO 9:

    public static int [][] fill_matriz_1_and_10(int tamanio){
        Random sc = new Random();
        int [][] matrix = new int[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++){
            for (int j = 0; j < tamanio; j++){
                matrix[i][j] = sc.nextInt(0, 9);
            }
        }
        return matrix;
    }
    static boolean matrix_diagonal(int [][] matriz, int tamanio){
        boolean val = true;
        for (int i = 0; i < tamanio; i++){
            for (int j = 0; j < tamanio; j++){
                if (i != j){
                    if (matriz[i][j] != 0){
                        val = false;
                        return val;
                    }
                }
            }
        }
        return val;
    }

    // EJERCICIO 10:
    static boolean matrix_unitary(int [][] matriz, int tamanio){
        boolean val = true;
        for (int i = 0; i < tamanio; i++){
            for (int j = 0; j < tamanio; j++){
                if (i == j){
                    if (matriz[i][j] != 1){
                        val = false;
                        return val;
                    }
                }
            }
        }
        return val;
    }

    // EJERCICIO 11:
    public static void odd_or_even(int [][] a, int tamanio){
        int pares = 0, impares = 0;
        for (int i = 0; i < tamanio; i++){
            for (int j = 0; j < tamanio; j++){
                if (a[i][j] % 2 == 0){
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        System.out.println("En la matriz hay:");
        System.out.println(pares + " elementos pares.");
        System.out.println(impares + " elementos impares.");
    }

    // EJERCICIO 12:
    public static int [][] degrees_90(int [][] a, int tamanio){
        int aux1 = 0, aux2 = 0;
        int [][] x = new int[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++){
            for (int j = (tamanio-1); j > -1; j--){
                x[aux1][aux2] = a[j][i];
                aux2++;
            }
            aux1++;
            aux2 = 0;
        }
        return x;
    }

    // EJERCICIO 13::
    public static void encontrar_numero(int [][] a, int tamanio, int numero){
        int contador = 0;
        for (int i = 0; i < tamanio; i++){
            for (int j = 0; j < tamanio; j++){
                if (a[i][j] == numero){
                    contador++;
                }
            }
        }
        if (contador == 0){
            System.out.println("EL numero no se encontro en la matriz.");
        } else {
            System.out.println("EL numero " + numero + " se encontro " + contador + " en la matriz.");
        }

    }

    //EJERCICIO 14:

    public static void change_rows(int [][] a, int tamanio){
        int[][] matriz = new int[tamanio][tamanio];
        int filas = 0;
        for (int i = (tamanio-1); i > -1; i--){
            for (int j = 0; j < tamanio; j++){
                matriz[filas][j] = a[i][j];
            }
            filas++;
        }
        show_matrix_int(matriz);
    }


    //EJERCICIO 15:

    public static int diagonals(int [][] a){
        int diagonal1 = 0, diagonal2 = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if(i == j){
                    diagonal1 += a[i][j];
                } else if((i+j) == a.length-1){
                    diagonal2 += a[i][j];
                }
            }
        }
        return diagonal1 + diagonal2;
    }

    //EJERCICIO 16:

    

    //EJERCICIO 17:

    //EJERCICIO 18:
}

