package Bloque3;

import java.util.Scanner;

public class numeroprimeoextended {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero;

        System.out.println(" Introdueix un numero... ");
        numero = in.nextInt();
        if (numero == 0 || numero == 1 || numero == 4) {
            System.out.println(" No es primo ");
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    System.out.println(" El numero no es primo ");

                }


            }

        }
    }

}
