/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF2_A1_ACTIVITATS;

import java.util.Scanner;
import java.math.*;

public class Ex02_Figures2D {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        menu(in);
    }

    public static void menu(Scanner in) {
        int opciomenu;
        System.out.println("Introdueix la figura 2D");
        System.out.println(" 1.quadrat ");
        System.out.println(" 2.rectangle ");
        System.out.println(" 3.triangle isoceles ");
        System.out.println(" 4.cercle ");

        opciomenu = in.nextInt();

        switch (opciomenu) {
            case 1:
                calcCuadrado(in);

                break;

            case 2:
                calcRectangulo(in);

                break;

            case 3:

                calcTriangulo(in);
                break;

            case 4:
                calcCirculo(in);

                break;

        }
    }

    public static void calcCuadrado(Scanner in) {
        int l, pcuadrado, acuadrado;
        System.out.println(" Introduce longitud de los lados ");
        l = in.nextInt();

        pcuadrado = l * l;
        acuadrado = l + l + l + l;

        System.out.println(" Area cuadrado : " + acuadrado);
        System.out.println(" Perimetro cuadrado " + pcuadrado);
    }

    public static void calcRectangulo(Scanner in) {
        int b, alt, arectangulo, prectangulo;
        System.out.println(" Introduce longitud de la base ");
        b = in.nextInt();
        System.out.println(" Introduce altura ");
        alt = in.nextInt();

        arectangulo = b * alt;
        prectangulo = 2 * alt + 2 * b;

        System.out.println(" Area rectangulo : " + arectangulo);
        System.out.println(" Perimetro rectangulo : " + prectangulo);
    }

    public static void calcTriangulo(Scanner in) {
        int b, a, l, atriangulo, ptriangulo;

        System.out.println(" Introduce altura trinagulo : ");
        a = in.nextInt();
        System.out.println(" Introduce base triangulo : ");
        b = in.nextInt();
        System.out.println(" Introduce lado triangulo ");
        l = in.nextInt();
        atriangulo = b * a / 2;
        ptriangulo = b + l + l;

        System.out.println(" Area triangulo isoceles : " + atriangulo);
        System.out.println(" Perimetro triangulo isoceles : " + ptriangulo);
    }

    public static void calcCirculo(Scanner in) {
        
        double r, d, pcirculo, acirculo;
        
        
        System.out.println(" Introduce diametro : ");
        d = in.nextInt();
        
        System.out.println("Introduce radio : ");
        r = in.nextInt();
        
        pcirculo = Math.PI*d;
        acirculo = Math.PI*Math.pow(r, 2);
        
        System.out.println(" Area circulo : " + acirculo);
        System.out.println(" Perimetro circulo : " + pcirculo);
        

    }

}
