package Bloque2;

import java.util.Scanner;

public class Bloque2_activitat3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nombre1;

        System.out.println(" Introdueix nombre1 ");
        nombre1 = in.nextInt();
        if (nombre1 > 0) {
            System.out.println(" Es positiu  ");
        } else if (nombre1 < 0) {
            System.out.println("Es negatiu");
        } else if (nombre1 == 0) {
            System.out.println(" Es zero ");
        }

    }
}
