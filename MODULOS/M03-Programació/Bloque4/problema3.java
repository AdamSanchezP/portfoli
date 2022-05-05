package Bloque4;

import java.util.Scanner;

public class problema3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int entrada, max = 0, min = 0, suma = 0, cont=0;
        float mitj = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println(" Introdueix numero ");
            entrada = keyboard.nextInt();
            suma += entrada;
            cont++;
            if (i == 0) {
                min = entrada;
                max = entrada;
            } else if (entrada > max) {
                max = entrada;
            } else if (entrada < min) {
                min = entrada;


            }
        }

        System.out.println(" la mitjana es : " + (float) suma / cont);
        System.out.println(" el minim es:  " + min);
        System.out.println(" el maxim es:" + max);


    }
}
