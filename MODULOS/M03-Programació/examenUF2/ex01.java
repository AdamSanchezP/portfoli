package examenUF2;

import java.math.*;
import java.util.Scanner;

public class ex01 {

    public static final int maxim = 8;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] caselles = new int[maxim][maxim];
        int intent = 1, fila, columna, contn=0;
        omplirArray(caselles);
        
        while ((intent < 10)&&(contn<4)) {
            
            imprimirArraytmp(caselles);
            System.out.println(" Intent : " + intent);
            System.out.print(" Fila : ");
            fila = in.nextInt();
            System.out.print(" Columna : ");
            columna = in.nextInt();
            
            intent++;
            
            if (tocaVora(fila, columna, caselles)) {
                System.out.println(" No és vàlida. Toca la vora! ");
            } else if (existeixFitxa(fila, columna, caselles)) {
                System.out.println(" No és vàlida. Ja hi ha una fitxa! ");
            } else {
                System.out.println(" Perfecte! La posició és vàlida ");
                caselles[fila][columna]=2;
                contn++;
            }
            
        }
        
        if (contn==4) {
            System.out.println("Enhorabona! Has guanyat!");
        }else{
            System.out.println("Has perdut!");
        }
        imprimirArray(caselles);
        
    }

    public static void omplirArray(int[][] caselles) {
        int contb = 0;

        while (contb < 20) {
            int r1 = (int) (Math.random() * 8);
            int r2 = (int) (Math.random() * 8);
            if (caselles[r1][r2] == 0) {
                caselles[r1][r2] = 1;
                contb++;

            } else {

            }

        }
    }

    public static boolean tocaVora(int fila, int columna, int[][] caselles) {
        boolean tocavora = false;

        if ((fila == 0) || (columna == 0)) {
            tocavora = true;
        } else if ((fila == 8) || (columna == 8)) {
            tocavora = true;
        }

        return tocavora;
    }

    public static boolean existeixFitxa(int fila, int columna, int[][] caselles) {
        boolean existeixfitxa = false;
        if ((caselles[fila][columna] == 1) || (caselles[fila][columna] == 2)) {
            existeixfitxa = true;
        }
        return existeixfitxa;
    }

    public static void imprimirArray(int[][] caselles) {
        for (int i = 0; i < maxim; i++) {
            for (int j = 0; j < maxim; j++) {
                if (caselles[i][j]==1) {
                    System.out.print("B");
                }else if(caselles[i][j]==2){
                    System.out.print("N");
                }else{
                    System.out.print(caselles[i][j]);
                }
            }
            System.out.println("");
        }
    }
     public static void imprimirArraytmp(int[][] caselles) {
        for (int i = 0; i < maxim; i++) {
            for (int j = 0; j < maxim; j++) {
                System.out.print(caselles[i][j]);
            }
            System.out.println("");
        }
    }

}
