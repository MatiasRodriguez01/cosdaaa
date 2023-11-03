import java.util.*;

public class sextaClase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------");
        System.out.println("Ejercicio 1:");
        int [][] matriz1 = fill_Matrix_int(3);
        int [][] matriz2 = fill_Matrix_int(3);
        ////////////////////////////////////////
        System.out.println("Matriz 1:");
        show_matrix_int(matriz1);
        System.out.println("Matriz 2:");
        show_matrix_int(matriz2);
        System.out.println("La suma de las 2 matrices: ");
        int [][] matriz3 = sum_matrix_int(matriz1, matriz2, 3);
        show_matrix_int(matriz3);


        System.out.println("--------------");
        System.out.println("Ejercicio 2:");
        matriz1 = fill_Matrix_int(4);
        matriz2 = fill_Matrix_int(4);
        ////////////////////////////////
        System.out.println("Matriz 1:");
        show_matrix_int(matriz1);
        System.out.println("Matriz 2:");
        show_matrix_int(matriz2);
        System.out.println("La multiplicacion de las 3 matrices: ");
        matriz3 = multiply_matrix_int(matriz1, matriz2, 4);


        System.out.println("--------------");
        System.out.println("Ejercicio 3:");
        int [][] origin_matriz = fill_Matrix_int(3);
        System.out.println("Matriz original:");
        show_matrix_int(origin_matriz);
        System.out.println("Matriz transpuesta:");
        int [][] matriz_transposed = transposed_matrix_int(origin_matriz, 3);
        show_matrix_int(matriz_transposed);


        System.out.println("--------------");
        System.out.println("Ejercicio 4:");
        //int [][] origin = fill_Matrix_int(3);
        int [][] origin = {{2, 0, 2}, {0, 5, 0}, {2, 0, 2}};
        System.out.println("Matriz original:");
        show_matrix_int(origin);
        System.out.println("Matriz transpuesta:");
        int [][] transposed = transposed_matrix_int(origin, 3);
        show_matrix_int(transposed);
        boolean val = matrices_comparison(origin, transposed, 3);
        System.out.println("Las matrices son simetricas? " + val);


        System.out.println("--------------");
        System.out.println("Ejercicio 5:");
        int [] vector = fill_vector_int(6);
        int number;
        System.out.println("Vector: " + Arrays.toString(vector));
        System.out.print("Ingrese el numero que desee multiplicar los valores del vector: ");
        number = sc.nextInt();
        int [] products_vector = scalar_product(vector, number);
        System.out.println("Vector multiplicado: " + Arrays.toString(products_vector));;


        System.out.println("--------------");
        System.out.println("Ejercicio 6:");
        int [][] matriz = fill_Matrix_int(3);
        System.out.println("Matriz: ");
        show_matrix_int(matriz);
        int suma = sum_matrix(matriz, 3);
        System.out.println("La suma de los elementos de la matriz es = " + suma);


        System.out.println("--------------");
        System.out.println("Ejercicio 7:");
        matriz = fill_Matrix_int(3);
        System.out.println("Dada la siguiente matriz: ");
        show_matrix_int(matriz);
        value_max(matriz, 3);


        System.out.println("--------------");
        System.out.println("Ejercicio 8:");
        matriz = fill_Matrix_int(4);
        int row;
        System.out.println("Dada la siguiente matriz: ");
        show_matrix_int(matriz);
        System.out.println("Ingrese una de las " + 4 + " filas de la matriz: ");
        do{
            System.out.print("Fila -> ");
            row = sc.nextInt();
        } while (row < 1 || row > 4);
        System.out.println("La suma de los elementos de la fila " + row + " es = " + row_sum_matriz(matriz, row, 4));


        System.out.println("--------------");
        System.out.println("Ejercicio 9:");
        //int [][] matriz_diagonal = fill_Matrix_1_and_10 (3);
        int [][] matriz_diagonal = {{2, 0, 0}, {0, 5, 0}, {0, 0, 9}};
        System.out.println("Dada la siguiente matriz:");
        show_matrix_int(matriz_diagonal);
        boolean diagonal =  matrix_diagonal(matriz_diagonal, 3);
        System.out.println("La matriz es diagonal? " + diagonal);


        System.out.println("--------------");
        System.out.println("Ejercicio 10:");
        //matriz = fill_matriz_1_and_10(3);
        matriz = new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        System.out.println("Dada la siguiente matriz:");
        show_matrix_int(matriz);
        boolean valor =  matrix_unitary(matriz, 3);
        System.out.println("La matriz es unitaria? " + valor);


        System.out.println("--------------");
        System.out.println("Ejercicio 11:");
        matriz = fill_Matrix_int(3);
        System.out.println("Dada esta matriz: ");
        show_matrix_int(matriz);
        odd_or_even(matriz, 3);


        System.out.println("--------------");
        System.out.println("Ejercicio 12:");
        matriz = fill_Matrix_int(3);
        System.out.println("Dada esta matriz:");
        show_matrix_int(matriz);
        System.out.println("Mostramos la misma matriz pero rotada a 90 grados en sentido horario:");
        int [][] matriz_invertida = degrees_90(matriz, 3);
        show_matrix_int(matriz_invertida);


        System.out.println("--------------");
        System.out.println("Ejercicio 13:");
        matriz = fill_matriz_1_and_10(3);
        number = 0;
        System.out.print("Ingrese un numero entre el 1 al 10, para encontrar ese numero en la matriz: ");
        number = sc.nextInt();
        show_matrix_int(matriz);
        System.out.println("-----");
        encontrar_numero(matriz, 3, number);


        System.out.println("--------------");
        System.out.println("Ejercicio 14:");
        matriz = fill_matriz_1_and_10(3);
        System.out.println("Dada esta matriz: ");
        show_matrix_int(matriz);
        System.out.println("Tenemos la misma matriz con las lineas intercambiadas: ");
        change_rows(matriz, 3);

        System.out.println("--------------");
        System.out.println("Ejercicio 15:");
        matriz = fill_Matrix_int(4);
        System.out.println("Dada esta matriz:");
        show_matrix_int(matriz);
        System.out.println("La suma de sus diagonales es = " + diagonals(matriz));
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
    public static void value_max(int [][] matriz, int x){
        int valor = 0, fila = 0, columna = 0;
        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++){
                if (matriz[i][j] > valor){
                    valor = matriz[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        System.out.println("El valor maximo de la matriz es " + valor + " y esta en la posicion " + fila + "," + columna + " .");

    }

    //EJERCICIO 8:
    static int row_sum_matriz(int [][] a, int fila, int tamanio){
        int suma = 0;
        for (int i = 0; i < tamanio; i++){
            suma += a[(fila-1)][i];
        }
        return suma;
    }

    // EJERCICIO 9:

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


}

