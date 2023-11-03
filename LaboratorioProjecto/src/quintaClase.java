import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.*;

public class quintaClase {

    public static void main(String[] args) {
        
        
        System.out.println("EJERCICIO 1:");
        int [] arreglo1 = llenarArreglo_numeros(6);
        ////////////////////////////
        System.out.println("Arreglo: " + Arrays.toString(arreglo1));
        ////////////////////////////
        System.out.println("Numeros enteros ordenador ascendente mente: ");
        Arrays.sort(arreglo1);
        for (int n : arreglo1){
            System.out.println(n);
        }


        System.out.println("------------");
        System.out.println("EJERCICIO 2:");
        Integer [] arreglo2 = llenarArray_integer(6);
        ////////////////////////////
        System.out.println("Arreglo: " + Arrays.toString(arreglo2));
        ////////////////////////////
        System.out.println("Numeros enteros ordenador decendente mente: ");
        Arrays.sort(arreglo2, Collections.reverseOrder());
        for (int n : arreglo2){
            System.out.println(n);
        }



        System.out.println("------------");
        System.out.println("EJERCICIO 3:");
        float[] arreglo3 = llenarArreglo_float(6);
        ////////////////////////////
        System.out.println("Arreglo: " + Arrays.toString(arreglo3));
        ////////////////////////////
        System.out.println("Numeros flotantes ordenador ascendente mente: ");
        Arrays.sort(arreglo3);
        for (float i : arreglo3){
            System.out.println(i);
        }


        System.out.println("------------");
        System.out.println("EJERCICIO 4:");
        float[] arreglo4 = llenarArreglo_float(6);
        ////////////////////////////
        System.out.println("Arreglo: " + Arrays.toString(arreglo4));
        ////////////////////////////
        System.out.println("Numeros flotantes ordenador decendente mente: ");
        descendente_float(arreglo4);
        System.out.println(Arrays.toString(arreglo4));


        System.out.println("------------");
        System.out.println("EJERCICIO 5:");
        System.out.println("LLENE EL ARREGLO: ");
        String [] arreglo5 = llenarArreglo_String(6);
        ////////////////////////////////////
        System.out.println("Arreglo: " + Arrays.toString(arreglo5));
        ////////////////////////////////////
        System.out.println("------------");
        System.out.println("Palabras ordenadas acsendenteente: ");
        Arrays.sort(arreglo5);
        for(String s : arreglo5){
            System.out.println(s);
        }


        System.out.println("------------");
        System.out.println("EJERCICIO 6:");
        System.out.println("LLENE EL ARREGLO: ");
        String [] arreglo6 = llenarArreglo_String(6);
        ////////////////////////////////////
        System.out.println("Arreglo: " + Arrays.toString(arreglo6));
        ////////////////////////////////////
        System.out.println("------------");
        System.out.println("Palabras ordenadas descendentemente: ");
        Arrays.sort(arreglo6, Collections.reverseOrder());
        for(String s : arreglo6){
            System.out.println(s);
        }

        System.out.println("------------");
        System.out.println("EJERCICIO 7:");

        System.out.println("------------");
        System.out.println("EJERCICIO 8:");


        System.out.println("------------");
        System.out.println("EJERCICIO 9:");
        int [] arreglo9 = llenarArreglo_numeros(6);
        ////////////////////////////////////
        System.out.println("Arreglo: " + Arrays.toString(arreglo9));
        ////////////////////////////////////
        System.out.println("Arreglo ordenado usando el metodo ordenamineto por burbuja: ");
        burbuja(arreglo9);
        for (int x : arreglo9){
            System.out.println(x);
        }


        System.out.println("------------");
        System.out.println("EJERCICIO 10:");
        int [] arreglo10 = {3, 98, 31, 17, 81, 23, 77};
        ////////////////////////////////////
        System.out.println("Arreglo: " + Arrays.toString(arreglo10));
        ////////////////////////////////////
        System.out.println("Arreglo ordenado usando el metodo ordenamiento por seleccion: ");
        seleccion(arreglo10);
        for (int x : arreglo10){
            System.out.println(x);
        }


        System.out.println("-----------");
        System.out.println("EJERCICIO 11:");
        int [] arreglo11 = {4, 56, 799, 233, -12, -43, 97};
        ////////////////////////////////////
        System.out.println("Arreglo : " + Arrays.toString(arreglo11));
        ////////////////////////////////////
        System.out.println("Arreglo ordenado usando el metodo ordenamiento por insercion: ");
        insercionDirecta(arreglo11);
        for (int z : arreglo11){
            System.out.println(z);
        }


        System.out.println("-----------");
        System.out.println("EJERCICIO 12:");
        int [] arreglo12 = {-1, 65, 34, 2, 78, 129};
        ////////////////////////////////////
        System.out.println("Arreglo : " + Arrays.toString(arreglo12));
        ////////////////////////////////////
        System.out.println("Arreglo ordenado usando el metodo ordenamiento por insercion: ");
        quicksort(arreglo12, 0, (arreglo12.length-1));
        for (int z : arreglo12){
            System.out.println(z);
        }


        System.out.println("-----------");
        System.out.println("EJERCICIO 13:");
        int [] arreglo13 = llenarArreglo_numeros(8);
        ////////////////////////////////////
        System.out.println("Arreglo : " + Arrays.toString(arreglo13));
        mergesort(arreglo13, 0, (arreglo13.length-1));
        System.out.println("Arreglo ordenado usando el metodo ordenamiento por insercion: ");
        // metodo
        for (int z : arreglo13){
            System.out.println(z);
        }


        System.out.println("-----------");
        System.out.println("EJERCICIO 14:");
        int [] arreglo14 = llenarArreglo_numeros(20);
        ////////////////////////////////////
        System.out.println("Dado el siguiente arreglo: " + Arrays.toString(arreglo14));
        descendiente_ascendiente(arreglo14);

    }

    public static void descendiente_int(int [] a){
        int aux;
        for (int i = 0; i < a.length; i++){
            for (int j = 1; j < a.length; j++){
                if (a[j] > a[j-1]){
                    aux = a[j];
                    a[j] = a[j-1];
                    a[j-1] = aux;
                }
            }
        }
    }
    public static void descendiente_ascendiente(int [] a){
        Scanner sc = new Scanner(System.in);
        char option;
        do {
            System.out.println("---------------------------------------------");
            System.out.println("Ingrese una de las siguientes opciones:");
            System.out.println("a) Para ordenar el arreglo ASCENDENTEMENTE: ");
            System.out.println("b) Para ordenar el arreglo DESCENDENTEMENTE: ");
            System.out.print("--> ");
            option = sc.nextLine().charAt(0);
            if (option == 'a'){
                burbuja(a);
                for (int i : a){
                    System.out.println(i);
                }
            } else if ( option == 'b') {
                descendiente_int(a);
                for (int i : a){
                    System.out.println(i);
                }
            }
        } while(option != 'a' && option != 'b');
    }

    public static void mergesort(int [] A,int izq, int der){
        if (izq < der){
            int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1, der);
            merge(A,izq, m, der);
        }
    }
    public static void merge(int [] A,int izq, int m, int der){
        int i, j, k;
        int [] B = new int[A.length]; //array auxiliar
        for (i=izq; i<=der; i++)      //copia ambas mitades en el array auxiliar
            B[i]=A[i];

        i=izq; j=m+1; k=izq;

        while (i<=m && j<=der) //copia el siguiente elemento más grande
            if (B[i]<=B[j])
                A[k++]=B[i++];
            else
                A[k++]=B[j++];

        while (i<=m)         //copia los elementos que quedan de la
            A[k++]=B[i++]; //primera mitad (si los hay)
    }


    public static void quicksort(int [] A, int izq, int der) {

        int pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while(i < j){                          // mientras no se crucen las búsquedas
            while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
            while(A[j] > pivote) j--;           // busca elemento menor que pivote
            if (i < j) {                        // si no se han cruzado
                aux= A[i];                      // los intercambia
                A[i]=A[j];
                A[j]=aux;
            }
        }

        A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos
        A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha

        if(izq < j-1)
            quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
        if(j+1 < der)
            quicksort(A,j+1,der);          // ordenamos subarray derecho

    }

    public static void insercionDirecta(int [] A){
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++){ // desde el segundo elemento hasta
            aux = A[p];           // el final, guardamos el elemento y
            j = p - 1;            // empezamos a comprobar con el anterior
            while ((j >= 0) && (aux < A[j])){ // mientras queden posiciones y el
                // valor de aux sea menor que los
                A[j + 1] = A[j];   // de la izquierda, se desplaza a
                j--;               // la derecha
            }
            A[j + 1] = aux;       // colocamos aux en su sitio
        }
    }

    public static void seleccion(int [] A) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {
            menor = A[i];
            pos = i;
            for (j = i + 1; j < A.length; j++){
                if (A[j] < menor) {
                    menor = A[j];
                    pos = j;
                }
            }
            if (pos != i){
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }

    public static void burbuja(int [] A){
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }
    public static void descendente_float(float [] a){
        float aux;
        for (int i = 0; i < a.length; i++){
            for (int j = 1; j < a.length; j++){
                if (a[j] > a[j-1]){
                    aux = a[j];
                    a[j] = a[j-1];
                    a[j-1] = aux;
                }
            }
        }
    }

    public static float [] llenarArreglo_float(int tamanio){
        Random random = new Random();

        float [] x = new float[tamanio];
        float numeroAleatorio;
        float numeroRedondeado;
        for (int i = 0; i < x.length; i++) {
            numeroAleatorio = random.nextFloat() * 100;
            numeroRedondeado = Math.round(numeroAleatorio * 100.0f) / 100.0f;
            x[i] = numeroRedondeado;
        }
        return x;
    }
    public static int [] llenarArreglo_numeros(int x){
        Random aleatorio = new Random(System. currentTimeMillis());
        int iterador;
        int [] array = new int [x];
        for (iterador = 0; iterador < array.length; iterador++){
            array[iterador] = aleatorio.nextInt(1, 50);
        }
        return array;
    }

    public static Integer [] llenarArray_integer(int x){
        Random aleatorio = new Random(System. currentTimeMillis());
        int iterador;
        Integer [] array = new Integer[x];
        for (iterador = 0; iterador < array.length; iterador++){
            array[iterador] = aleatorio.nextInt(1, 50);
        }
        return array;
    }

    public static String [] llenarArreglo_String(int tamanio){
        Scanner sc = new Scanner(System.in);
        String [] x = new String[tamanio];
        for (int iterador = 0; iterador < x.length; iterador++){
            System.out.print("Ingrese la palabra N°" + (iterador+1) + ": ");
            x[iterador] = sc.nextLine();
        }
        System.out.println(" ");
        return x;
    }



}
