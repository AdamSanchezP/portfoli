package Bloque2;

import java.util.Scanner;

public class menuconopciones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero1, numero2, entrada;
        System.out.println("Escull una de les opcions del menu:");
        System.out.println(" (1) Suma (2) Resta (3) Multiplicació (4) Divisió ");
        entrada = in.nextInt();

        if (entrada == 1) {
            System.out.println("Introdueix els nombres a sumar");

            System.out.println("intro num1");
            numero1 = in.nextInt();
            System.out.println("intro num2");
            numero2 = in.nextInt();
            System.out.println(" El resultat es " + (numero1 + numero2));
        } else if (entrada == 2) {
            System.out.println("Introdueix els nombres a restar");

            System.out.println("intro num1");
            numero1 = in.nextInt();
            System.out.println("intro num2");
            numero2 = in.nextInt();
            System.out.println(" El resultat es " + (numero1 - numero2));
        } else if (entrada == 3) {
            System.out.println("Introdueix els nombres a multiplicar");

            System.out.println("intro num1");
            numero1 = in.nextInt();
            System.out.println("intro num2");
            numero2 = in.nextInt();
            System.out.println(" El resultat es: " + (numero1 * numero2));
        } else if (entrada == 4) {
            System.out.println("Introdueix els nombres a dividir");

            System.out.println("intro num1");
            numero1 = in.nextInt();
            System.out.println("intro num2");
            numero2 = in.nextInt();
            System.out.println(" El resultat es: " + (numero1 / numero2));
        } else {
            System.err.print("Opcio del menu incorrecta, torna a introduir una opció");
        }
    }
}
