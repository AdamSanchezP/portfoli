package Bloque6.activitat5;

import java.util.Scanner;

public class activitat5main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int notas[][] = new int[3][4];
        int sumamat = 0, mediaalum = 0, mediamat = 0;
        int nota, contalum = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println(" Introdueix la nota del alumne " + j + " de la materia " + i);
                nota = in.nextInt();
                notas[i][j] = nota;
                mediaalum += notas[i][j];
                
            }
        }
        int i, j;
        for (j = 0; j < notas[0].length; j++) {
            sumamat = 0;
            for (i = 0; i < notas.length; i++) {
                sumamat += notas[i][j];
                contalum++;
                System.out.println("Alumne"+ contalum +  " nota mitajana " +  " = " + (double) sumamat/3);
                
            }

        }

        System.out.println("la mitjana total de tots els alumnes es: " + mediaalum / contalum);
    }
}
