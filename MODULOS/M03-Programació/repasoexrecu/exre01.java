/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoexrecu;
import java.util.Scanner;
public class exre01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        exre01class[] array =new exre01class[3];
        rellenarArray(array, in );
        imprimeix(array);
    }
    
    public static void rellenarArray(exre01class[]array, Scanner in){
        String director, type, title;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introdueix director");
            director=in.nextLine();
            
            System.out.println("Introdueix el tipus");
            type=in.nextLine();
            
            System.out.println("Introdueix el titol de la pelicula ");
            title=in.nextLine();
            
            array[i]=new exre01class(director, type, title);
        }
        
       
    }
    
     public static void imprimeix(exre01class[] array){
            for (int i = 0; i < array.length; i++) {
             array[i].imprimeix();
         }
        }
}
