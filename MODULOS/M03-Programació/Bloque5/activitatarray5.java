package Bloque5;

import java.util.Scanner;

public class activitatarray5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] notas = new int[20];
        int suma = 0, notables=0;
        for (int i = 0; i < notas.length; i++) {

            System.out.println(" Introdueix nota ");
            notas[i] = in.nextInt();
            suma += notas[i];
            if ((notas[i] == 7) || (notas[i] == 8)){
                notables++;
            }
        }
        System.out.println(" La mitjana es " + suma / (notas.length));
        System.out.println(" Els notables son: " + notables);

    }
}
