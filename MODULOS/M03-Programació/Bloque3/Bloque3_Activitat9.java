package Bloque3;

import java.util.Scanner;

public class Bloque3_Activitat9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float nota;
        int cont = 0, aprovats = 0, suspesos = 0, suf = 0, bé = 0, notable = 0, exce = 0;

        do {
            System.out.println(" Introdueix una nota... ");
            nota = in.nextFloat();
            cont++;
            if (nota == 5) {
                aprovats++;
                suf++;
            } else if (nota <= 4) {
                suspesos++;
            } else if ((nota >= 5.99) && (nota < 6.99)) {
                aprovats++;
                bé++;
            } else if ((nota >= 6.99) && (nota <= 8.99)) {
                notable++;
                aprovats++;
            } else if ((nota >= 8.99) && (nota <= 10)) {
                exce++;
                aprovats++;
            }

        } while (cont <= 10);
        System.out.println(" Tens " + aprovats + " aprovats " + suspesos + " suspesos " + suf + " suficients " + bé + " bé " + notable + " notables " + exce + " excelents ");


    }
}
