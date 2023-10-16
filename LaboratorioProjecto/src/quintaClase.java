import java.util.Random;

public class quintaClase {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 1:");
        int [] arreglo1 = new int [6];
        llenarArreglo(arreglo1);
        mostraArreglo(arreglo1);
        int [] nuevo = new int [6];
        nuevo = menor_a_mayor(arreglo1, 6);
        mostraArreglo(nuevo);
    }

    public static void evaluar_menor(int [] x) {
        int iterador, chico = 0;
        boolean menor = true;
        while (menor){
            for (iterador = 0; iterador < x.length; iterador++){
                if (iterador == 0){
                    chico = x[iterador];
                } else if (x[iterador] < chico) {
                    menor = false;
                } else {
                    menor = true;
                }
                if (menor == true){
                    iterador = x.length-1;
                }
            }

        }
    }
    public static int [] menor_a_mayor(int [] x, int tamanio){
        int [] new_array = new int[tamanio];
        int iterador;
        for (iterador = 1; iterador < x.length; iterador++){
            if (x[iterador] <= x[iterador-1]) {
                new_array[iterador-1] = x[iterador];
                new_array[iterador] = x[iterador-1];
            } else {
                new_array[iterador] = x[iterador];
            }
        }
        return new_array;
    }



    public static void llenarArreglo(int[] x){
        Random aleatorio = new Random(System. currentTimeMillis());
        int iterador;
        for (iterador = 0; iterador < x.length; iterador++){
            x[iterador] = aleatorio.nextInt(1, 50);
        }
    }



    public static void mostraArreglo(int[] x){
        int iterador;
        for (iterador = 0; iterador < x.length; iterador++){
            System.out.print("[" + x[iterador] + "]");
        }
        System.out.println(" ");
    }
}
