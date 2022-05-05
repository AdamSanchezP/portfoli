/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF2A1_P1;

import java.util.Locale;
import java.util.Scanner;
import java.math.*;
public class UF2A1_P1_ACT2 {
   
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        String opciomenu = "";

        do {
            opciomenu = in.nextLine().toLowerCase();
            switch (opciomenu) {
                case "q":
                  
                    calcQuadrat(in);
                    break;
                case "r":
                     
                    calcRectangle(in);
                    break;
                case "t":
                     
                    calcTriangleIsoceles(in);
                    break;
                case "c":
                     
                    calcCercle(in);
                    break;
            }
        } while (!opciomenu.equalsIgnoreCase("s"));

    }

    public static void calcQuadrat(Scanner in) {
        System.out.println("==Quadrat==");
        double l, pcuadrado, acuadrado;

        l = in.nextDouble();

        acuadrado = l * l;
        pcuadrado = l + l + l + l;

        System.out.printf("Perímetre : %.2f ", pcuadrado);
        System.out.println("");
        System.out.printf("Superfície: %.2f ", acuadrado);
        System.out.println("");
    }

    public static void calcRectangle(Scanner in) {
        System.out.println("==Rectangle==");
        double b, alt, arectangulo, prectangulo;
        b = in.nextDouble();
        alt = in.nextDouble();

        arectangulo = b * alt;
        prectangulo = 2 * alt + 2 * b;

        System.out.printf("Perímetre : %.2f ", prectangulo);
        System.out.println("");
        System.out.printf("Superfície: %.2f ", arectangulo);
        System.out.println("");
    }

    public static void calcTriangleIsoceles(Scanner in) {
        System.out.println("==Triangle isòsceles==");
        double c1, c2, atriangulo, ptriangulo;

        c1 = in.nextDouble();

        c2 = in.nextDouble();

       
        atriangulo =2*c1+c2;
        ptriangulo = (c2 / 2)* Math.sqrt(c1 * c1 - c2 * c2 / 4);

        System.out.printf("Perímetre : %.2f ", atriangulo);
        System.out.println("");
        System.out.printf("Superfície: %.2f ", ptriangulo);
        System.out.println("");
    }

    public static void calcCercle(Scanner in) {
        System.out.println("==Cercle==");

        double r, pcirculo, acirculo;

        
        r = in.nextDouble();

        pcirculo = 2* Math.PI * r;
        acirculo = Math.PI * Math.pow(r, 2);

        System.out.printf("Perímetre : %.2f ", pcirculo);
        System.out.println("");
        System.out.printf("Superfície: %.2f ", acirculo);
        System.out.println("");
    }

}