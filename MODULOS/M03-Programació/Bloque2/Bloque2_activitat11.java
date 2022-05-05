package Bloque2;

import java.util.Scanner;

public class Bloque2_activitat11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float preu, descompte;

        System.out.println(" Intro preu... ");
        preu = in.nextInt();
        if (preu > 10000) {
            descompte = preu * 10 / 100;

        } else {
            descompte = preu * 5 / 100;
        }

        System.out.println(" El descompte és " + descompte + "€");
    }

}
