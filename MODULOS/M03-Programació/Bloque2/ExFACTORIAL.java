package Bloque2;

import java.util.Scanner;

public class ExFACTORIAL {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor, resultat;

        //Esto es un bucle, este en especifico se utiliza cuando sabemos las veces que se va a repetir
        System.out.println("Intro numero");
        valor = in.nextInt();
        resultat = 1;
        for (int i = 1; i <= valor; i++) {
            resultat = resultat * i;

        }
        System.out.println("El Factorial de " + valor + " és " + resultat%10);
    }
}
