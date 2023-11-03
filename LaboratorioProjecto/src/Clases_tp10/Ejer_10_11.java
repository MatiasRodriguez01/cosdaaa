package Clases_tp10;


public class Ejer_10_11 {
    public static void main(String[] args) {
        //Ejercicio 10:
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.inicializacion(6000, 123);
        //Ejercicio 11:
        if (cuenta1.acceso()){
            System.out.println("----------------------------------");
            cuenta1.depositar();
            System.out.println("Su monto es de $" + cuenta1.getSaldo());
            cuenta1.retirar();
            System.out.println("Su monto es de $" + cuenta1.getSaldo());
        } else {
            System.out.println("Acceso Denegado.");
        }

    }

}
