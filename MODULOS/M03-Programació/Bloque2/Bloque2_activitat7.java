package Bloque2;
import  java.util.Scanner;
public class Bloque2_activitat7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int entrada;
        System.out.println("Introdueix un numero...");
        entrada = in.nextInt();
        if (entrada % 2 == 0) {
            if (entrada % 3 == 0) {
                System.out.println(entrada + "Es multiple per 2 y per 3");
            }

        }
    }
}
