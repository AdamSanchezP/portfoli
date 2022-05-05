package Bloque2;

import java.util.Locale;
import java.util.Scanner;

public class Bloque2_activitat15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        sn.useLocale(Locale.US);
        int aprobados;
        double nota = 0;

        System.out.println("Intro nota...");
        nota = sn.nextDouble();
        if ((nota < 4.99) || (nota > 0)) {
            System.out.println("Suspés");
        } else if (nota == 0) {

        }
    }
}
