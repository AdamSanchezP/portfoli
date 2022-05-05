/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF2A2_P1;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valorn, cont;
        valorn = in.nextInt();
        double[] temperaturas = new double[valorn];

        for (int i = 0; i < valorn; i++) {
            temperaturas[i] = in.nextDouble();

        }

        cont = ordenaSeleccio2(temperaturas);

        imprimirArray(temperaturas, cont);
    }

    public static int ordenaSeleccio2(double[] arr) {
        int cont = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                cont++;
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index  
                }
            }
            double smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return cont;
    }

    public static void imprimirArray(double[] temperaturas, int cont) {

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(temperaturas[i] + " ");
           
        }
         System.out.println("");
        System.out.println("Total passades: " + cont);

    }
}
