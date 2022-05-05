package UF2_A1_ACTIVITATS;

import java.util.Scanner;
import java.math.*;
public class ex03_figures3d {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        menu(in);
    }

    public static void menu(Scanner in) {
            int opciomenu=0;
            
            System.out.println(" introdueix una opcio del menu : ");
            System.out.println(" 1. cilindre ");
            System.out.println(" 2. hexaedre ");
            System.out.println(" 3. Tetraedre ");
            System.out.println(" 4. esfera ");
            opciomenu=in.nextInt();
        switch(opciomenu){
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
    
    public static void cilindre(Scanner in){
        double h, r, atotal, vtotal;
        System.out.println(" introduce altura del cilindro : ");
        h=in.nextInt();
        System.out.println(" Qual es el radio del cilindro ? ");
        r=in.nextInt();
        
        
        vtotal=Math.PI*Math.pow(r, 2);
        atotal=2*Math.PI*r*(r+h);
        
        System.out.println("L'area del cilindre es de : " + atotal);
        System.out.println("El volum del cilindre es de : " + vtotal);
        
        
    }
    
    public static void hexaedre(Scanner in){
        double a, atotal, vtotal, ar;
        System.out.println(" Introduce area del hexaedro ");
         a=in.nextInt();
        System.out.println(" Introduce la medida de la arista : ");
        ar=in.nextInt();
        atotal=6*Math.pow(a, 2);
        vtotal=Math.pow(ar, 3);
    }
    
    public static void tetraedre(Scanner in){
        double lados, atotal, vtotal;
        System.out.println(" Introduce la medida de los lados del tetraedro ");
        lados=in.nextInt();
        vtotal=Math.pow(lados, 3)*Math.sqrt(2);
        atotal=lados * Math.sqrt(3);
        System.out.println(" El volumen del tetraedro es : " + vtotal);
        System.out.println(" El area del tetraedro es de : " + atotal);
    }
    
    public static void esfera(Scanner in){
        double radioesfera, atotal, vtotal;
        System.out.println(" Introduce el radio de la esfera : ");
        radioesfera=in.nextInt();
        
        vtotal=(4/3)*Math.PI*Math.pow(radioesfera, 3);
        atotal=4*Math.PI*Math.pow(radioesfera, 3);
        
        System.out.println(" El volumen de la esfera es de : " + vtotal);
        System.out.println(" el area de la esfera es de : " + atotal);
    }
}
