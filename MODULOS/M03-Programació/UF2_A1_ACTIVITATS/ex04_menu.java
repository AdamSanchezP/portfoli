/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF2_A1_ACTIVITATS;

import java.math.*;
import java.util.Scanner;

public class ex04_menu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        activitat04(in, instr);
    }

    public static void activitat04(Scanner in, Scanner instr) {
        int opciomenuact = 0;
        String sortirstr="";
        boolean sortir=false;
        while(sortir==false){
        
    
        System.out.println(" posa el numero del enunciat que vols : ");
        System.out.println(" 1. activitat 2");
        System.out.println(" 2. activitat 3 ");
        opciomenuact = in.nextInt();
        
        switch (opciomenuact) {
            case 1:
                menuact2(in);
                break;
            case 2:
                menuact3(in);
        }
            System.out.println("Has acabat ?");
            sortirstr=instr.nextLine();
            if (sortirstr.equals("sortir")){
                sortir=true;
            }else{
                
            }

    }
    }
    

   public static void menuact2(Scanner in){
       
   
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
    public static void menuact3(Scanner in) {
        int opciomenu = 0;

        System.out.println(" introdueix una opcio del menu : ");
        System.out.println(" 1. cilindre ");
        System.out.println(" 2. hexaedre ");
        System.out.println(" 3. Tetraedre ");
        System.out.println(" 4. esfera ");
        opciomenu = in.nextInt();
        switch (opciomenu) {
            case 1:
                cilindre(in);
                break;

            case 2:
                hexaedre(in);
                break;

            case 3:
                tetraedre(in);
                break;

            case 4:
                esfera(in);
                break;
        }
    }

    public static void cilindre(Scanner in) {
        double h, r, atotal, vtotal;
        System.out.println(" introduce altura del cilindro : ");
        h = in.nextInt();
        System.out.println(" Qual es el radio del cilindro ? ");
        r = in.nextInt();

        vtotal = Math.PI * Math.pow(r, 2);
        atotal = 2 * Math.PI * r * (r + h);

        System.out.println("L'area del cilindre es de : " + atotal);
        System.out.println("El volum del cilindre es de : " + vtotal);

    }

    public static void hexaedre(Scanner in) {
        double a, atotal, vtotal, ar;
        System.out.println(" Introduce area del hexaedro ");
        a = in.nextInt();
        System.out.println(" Introduce la medida de la arista : ");
        ar = in.nextInt();
        atotal = 6 * Math.pow(a, 2);
        vtotal = Math.pow(ar, 3);
    }

    public static void tetraedre(Scanner in) {
        double lados, atotal, vtotal;
        System.out.println(" Introduce la medida de los lados del tetraedro ");
        lados = in.nextInt();
        vtotal = Math.pow(lados, 3) * Math.sqrt(2);
        atotal = lados * Math.sqrt(3);
        System.out.println(" El volumen del tetraedro es : " + vtotal);
        System.out.println(" El area del tetraedro es de : " + atotal);
    }

    public static void esfera(Scanner in) {
        double radioesfera, atotal, vtotal;
        System.out.println(" Introduce el radio de la esfera : ");
        radioesfera = in.nextInt();

        vtotal = (4 / 3) * Math.PI * Math.pow(radioesfera, 3);
        atotal = 4 * Math.PI * Math.pow(radioesfera, 3);

        System.out.println(" El volumen de la esfera es de : " + vtotal);
        System.out.println(" el area de la esfera es de : " + atotal);
    }
}


