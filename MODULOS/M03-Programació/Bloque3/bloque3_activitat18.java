package Bloque3;

import java.util.Scanner;

public class bloque3_activitat18 {
    public static void main(String[] args) {

        int cont = 0;

        Scanner in = new Scanner(System.in);
        System.out.println(" Introdueix una frase... ");
        String frase = in.nextLine();

        System.out.println(" Introdeix una lletra... ");
        char lletra = in.nextLine().charAt(0);
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == lletra) {
                cont++;
            }

        }
        System.out.println(" Hi ha " + cont + " " + lletra);



    }
}
