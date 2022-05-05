package Bloque5;

import java.util.Scanner;
import javax.print.attribute.standard.Media;

public class activitatarraysexamen {
    public static final int Exercicis=3;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        int kbalumnat, suma = 0, nota=0, i, mitjana=0;
        System.out.println(" Introdueix alumnes per introduir les notes: ");
        kbalumnat = in.nextInt();
        int[][] alumnes = new int[kbalumnat][Exercicis];
        
        //bucle 1: suma
        for ( i = 0; i < kbalumnat; i++) {
            suma=0;
            System.out.println(" Alumne " + i);
            for (int j = 0; j < alumnes[i].length; j++) {

                System.out.println(" Introdueix una nota per l'exercici " + j);
                nota=in.nextInt();
                alumnes[i][j]=nota;
                System.out.println(" Has introduit un " + nota);
                suma+=alumnes[i][j];


            }
            System.out.println(suma);
            if (suma/3>=5){
                System.out.println(" Alumne Aprovat ");
            }else{
                System.out.println(" Alumne Suspès ");
            }


        }
        
        for (int j = 0; j<alumnes[0].length ;j++) {
         
            mitjana=0;
            for ( i = 0; i < kbalumnat; i++) {
               mitjana+=alumnes[i][j];
               
            }
             System.out.println(" La nota mitjana del excercici "+ j +  " es: " + (double) (mitjana/kbalumnat));
            
          
        }
       

    }
}
