package Bloque2;

import java.util.Scanner;

public class Bloque2_activitat2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nombre1;
        int nombre2;

        System.out.println(" Introdueix nombre1 ");
        nombre1 = in.nextInt();
        System.out.println(" Introdueix segon nombre2 ");
        nombre2 = in.nextInt();
        if (nombre1 > nombre2) {
            System.out.println(" Nombre1 es mayor que nombre2 ");
        } else if (nombre1 < nombre2) {
            System.out.println("nombre2 es mes gran que nombre1");
        } else if (nombre1 == nombre2) {
            System.out.println(" Els dos nombres son iguals ");
        }

    }
}
