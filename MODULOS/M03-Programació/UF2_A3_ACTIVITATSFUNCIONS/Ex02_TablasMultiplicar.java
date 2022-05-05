/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF2_A3_ACTIVITATSFUNCIONS;

import java.util.Scanner;

public class Ex02_TablasMultiplicar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(" Cuantas taulas de multiplicar vols mostrar ? ");
        int entradateclado = in.nextInt();

        generartablas(entradateclado);

    }

    public static void generartablas(int tablas) {

        for (int i = 0; i < tablas;) {
            System.out.println("");
            for (int j = 0; j < 10; j++) {
                System.out.println("");
                for (int k = 0; k < 4; k++) {
                    if (muntarLineaPantalla(i, tablas, k)) {
                        System.out.print(muntarLineaTaulaMultiplicar(i, j, k));
                    }

                }

            }
            i = i + 4;
        }
    }

    public static String muntarLineaTaulaMultiplicar(int i, int j, int k) {
        String resultado = "";

        resultado = ((k + i + 1) + "x" + (j + k) + "=" + ((k + i + 1) * (j + 1)) + "\t");
        return resultado;
    }

    public static boolean muntarLineaPantalla(int i, int tablas, int k) {
        boolean hola = false;

        if (i + k < tablas) {
            hola = true;
        }
        return hola;
    }
}
