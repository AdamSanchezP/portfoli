/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bloque6;


import java.util.Scanner;
public class llibreriaMain {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Llibre, ISBN, Autor, Editorial;
        int Preu, Stock;
                
        llibreClass[] llibreria=new llibreClass[3];
        
        for (int i = 0; i < llibreria.length; i++) {
            System.out.println(" Introdueix el llibre ");
            Llibre=in.nextLine();
            
            System.out.println(" Introdueix el codi ISBN ");
            ISBN=in.nextLine();
            System.out.println(" Introdueix l'autor del llibre ");
            Autor=in.nextLine();
            System.out.println(" Introdueix el stock que tenim al magatzem ");
            System.out.println(" La editorial es: ");
            Editorial=in.nextLine();
            Stock=in.nextInt();
            System.out.println(" Introdueix el preu del llibre ");
            Preu=in.nextInt();
            
            llibreria[i] = new llibreClass(Llibre, ISBN, Autor,Editorial, Stock, Preu);
            
            
        }
       imprimeix(llibreria);
       
    }
    public static void imprimeix(llibreClass[] biblioteca){
           for (int i = 0; i < biblioteca.length; i++) {
            biblioteca[i].imprimeix();
        }
           
       }
}
