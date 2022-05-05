package Bloque4;

import java.util.Scanner;

public class problema1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont = 0, i = 0;
        while (i!=20) {
            cont++;
            if (cont % 2 != 0) {
                i++;
                System.out.println(cont);
            }
        }

    }
}
