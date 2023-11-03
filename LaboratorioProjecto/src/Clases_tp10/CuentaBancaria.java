package Clases_tp10;

import java.util.Scanner;

public class CuentaBancaria {
    private int saldo;
    private int numeroCuenta;

    // saldo:
    public int getSaldo(){ return saldo ;}
    public void setSaldo(int saldo){ this.saldo = saldo;}

    // numero cuenta:
    public int getNumeroCuenta(){ return numeroCuenta ;}
    public void setNumeroCuenta(int numeroCuenta){ this.numeroCuenta = numeroCuenta ;}

    // Metodos:
    public void inicializacion(int s, int nc){
        saldo = s;
        numeroCuenta = nc;
    }

    public void depositar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el monto a depositar: ");
        int deposito = sc.nextInt();
        saldo += deposito;
        this.saldo = saldo;
    }

    public void retirar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el monto a retirar: ");
        int retiro = sc.nextInt();
        saldo -= retiro;
        this.saldo = saldo;
    }

    public boolean acceso(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de cuenta: ");
        int numero = sc.nextInt();
        return numero == numeroCuenta;
    }

}

