package Clases_ArrayList_tp11;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejer_1 {
    public static void main(String[] args) {
        ArrayList<String> marcas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean exit = true; String car; char option;
        System.out.println("Vamos a rellenar un arraylst con marcas de autos: ");
        while (exit){
            System.out.print("Ingrese una marca de auto: ");
            car = sc.nextLine();
            marcas.add(car);
            System.out.println("Desea guardar mas marcas de autos <<s/n>>: ");
            option = sc.nextLine().charAt(0);
            option = Character.toLowerCase(option);
            if (option != 's'){
                exit = false;
            }
        }
        System.out.println("-----------------");
        System.out.println("MARCAS DE AUTOS: ");
        for (String i : marcas){
            System.out.println(i);
        }
    }
}
