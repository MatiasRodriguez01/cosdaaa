package Clases_tp10;

public class Ejer_6_7 {
    public static void main(String[] args) {
        Estudiante alumno = new Estudiante();
        alumno.inicializacion("Matias", 19, "672349");


        System.out.println("Estudiante: nombre = " + alumno.getNombre() + ", edad = " + alumno.getEdad() + ", identificacion = " + alumno.getIdentificacion());
    }
}

