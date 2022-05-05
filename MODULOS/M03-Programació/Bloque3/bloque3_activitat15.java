package Bloque3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bloque3_activitat15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char posicion;

        System.out.println(" Introdueix el teu nom... ");
        String nombre = in.nextLine();
        System.out.println(" Hola " + nombre);
        System.out.println(" Tu nombre tiene " + + nombre.length() + " carácteres ");
        posicion = nombre.charAt(3);
        System.out.println(" El caracter en la posicion 3 es " + posicion);


        System.out.println("Introdueix un nom nou...");
        String nombre2 = in.nextLine();

        if (nombre.equals(nombre2)){
            System.out.println("son iguals");
        }else{
            System.out.println(" No son iguals. ");
        }

        System.out.println(" Els noms cambiats són " + nombre.toUpperCase());
        System.out.println( nombre2.toLowerCase() );

    }


}
