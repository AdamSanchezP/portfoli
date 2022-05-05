/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF2A1_P1;

import java.util.Locale;
import java.util.Scanner;
public class UF2A1_P1_ACT3 {
   
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        String opciomenu;
        boolean sortir=false;

        do {
            opciomenu = in.nextLine().toLowerCase();
            switch (opciomenu) {
                case "c":
                  
                    calcCilindre(in);
                    break;
                case "h":
                     
                    calcHexaedre(in);
                    break;
                case "t":
                     
                    calcTetraedre(in);
                    break;
                case "e":
                    
                    calcEsfera(in);
                    break;
                case "s":
                    sortir=true;
                    break;
                   
                   
                      
            }
        } while (sortir==false);

    }

    public static void calcCilindre(Scanner in) {
        System.out.println("==Cilindre==");
        double r, pcilindre, acilindre, a;

        r = in.nextDouble();
        a = in.nextDouble();
        acilindre = 2*Math.PI*r*a;
        pcilindre = Math.PI*Math.pow(r, 2)*a;

        System.out.printf("Superfície: %.2f ", acilindre);
        System.out.println("");
        System.out.printf("Volum: %.2f ", pcilindre);
        System.out.println("");
    }

    public static void calcHexaedre(Scanner in) {
        System.out.println("==Hexaedre==");
        double c, ahexaedre, phexaedre;
        c = in.nextDouble();
        ahexaedre = 6*Math.pow(c, 2);
        phexaedre = Math.pow(c, 3);

        System.out.printf("Superfície: %.2f ", ahexaedre);
        System.out.println("");
        System.out.printf("Volum: %.2f ", phexaedre);
        System.out.println("");
    }

    public static void calcTetraedre(Scanner in) {
        System.out.println("==Triangle isòsceles==");
        double a, atriangulo, ptriangulo;

        a=in.nextDouble();

       
        atriangulo =Math.sqrt(3)*Math.pow(a, 2);
        ptriangulo = Math.sqrt(2)/12*Math.pow(a, 3);

        System.out.printf("Superfície: %.2f ", atriangulo);
        System.out.println("");
        System.out.printf("Volum: %.2f ", ptriangulo);
        System.out.println("");
    }

    public static void calcEsfera(Scanner in) {
        System.out.println("==Esfera==");

        double r, pesfera, aesfera;

        
        r = in.nextDouble();

        aesfera = 4* Math.PI * Math.pow(r, 2);
        pesfera = 4/3*Math.PI * Math.pow(r, 3);

        System.out.printf("Superfície: %.2f ", aesfera);
        System.out.println("");
        System.out.printf("Volum: %.2f ", pesfera);
        System.out.println("");
    }

}