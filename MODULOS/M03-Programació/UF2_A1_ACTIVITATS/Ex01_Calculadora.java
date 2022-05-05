/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF2_A1_ACTIVITATS;

import java.util.Scanner;

public class Ex01_Calculadora {

    public static void main(String[] args) {
        int n1 = 0, n2 = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Introdueix un nombre enter");
        n1 = in.nextInt();
        System.out.println("Introdueix un segon nombre enter");
        n2 = in.nextInt();

        menu(in, n1, n2);

    }

    public static void menu(Scanner in, int n1, int n2) {
        int opciomenu, resultat;
        System.out.println(" Introdueix la opcio que vols fer : ");

        System.out.println(" 1.Multiplicar ");
        System.out.println(" 2.Dividir ");
        System.out.println(" 3.Sumar ");
        System.out.println(" 4.Dividir ");
        opciomenu = in.nextInt();
        switch (opciomenu) {
            case 1:
                resultat = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + resultat);
                break;

            case 2:
                resultat = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + resultat);

            case 3:
                resultat = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + resultat);

            case 4:
                resultat = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + resultat);
        }
    }

}
