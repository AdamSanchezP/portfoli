package Bloque3;
import java.util.Scanner;
public class bloque3_activitat21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i= 0, j;

        System.out.println(" Introdueix la frase... ");
        String frase = in.nextLine();
        boolean palindromo = true;

        j = frase.length() - 1;

        while ((i < j) && (palindromo)) {
            if (frase.charAt(i) == frase.charAt(j)) {
                i++;
                j--;

            } else {
                    palindromo = false;
                System.out.println("No es palindrom");
            }


        }
        System.out.println("Es palindrom");
    }
}