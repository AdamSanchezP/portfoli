/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF2_A1_ACTIVITATS;

import java.util.Scanner;

public class ex07_sudoku {

    public static final int FILAS = 9, COLUMNAS = 9;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] sudoku = new int[FILAS][COLUMNAS];

        llegirsudoku(sudoku, in);

        comprobarfila(sudoku);

    }

    public static int[][] llegirsudoku(int[][] sudokul, Scanner in) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                sudokul[i][j] = in.nextInt();

            }
        }
        return sudokul;
    }

    public static void comprobarfila(int[][] sudokuf) {
        int numeroguardado = 0, contador = 0;
        
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (numeroguardado == sudokuf[i][j]) {
                    contador++;
                }
                if (contador > 1) {
                    System.out.println(" la fila " + i + " es valida ");
                    break;
                }

            }
        }
    }

}

}
