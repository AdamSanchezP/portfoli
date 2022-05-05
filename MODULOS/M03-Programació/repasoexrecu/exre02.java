/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoexrecu;

import java.util.Scanner;

public class exre02 {

    public static final int tamany = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        exre02class[] llibreria = new exre02class[tamany];
        int ISBN, stock;
        String editorial, title, author;
        double precio;

        for (int i = 0; i < tamany; i++) {
            llibreria[i] = new exre02class();
            System.out.println("intodueix el codi ISBN");
            ISBN = in.nextInt();
            llibreria[i].setISBN(ISBN);
           
            System.out.println(" Introdueix el titol del llibre : ");
            title = instr.nextLine();
            llibreria[i].setTitle(title);
            
            System.out.println(" Introdueix l'autor del llibre : ");
            author = instr.nextLine();
            llibreria[i].setAuthor(author);
            
            System.out.println("Introdueix l'editorial del llibre");
            editorial = instr.nextLine();
            llibreria[i].setEditorial(editorial);
            
            System.out.println(" Introdueix el stock del llibre : ");
            stock = instr.nextInt();
            llibreria[i].setStock(stock);

            System.out.println(" Introdueix el preu d'aquest llibre : ");
            precio = in.nextDouble();
            llibreria[i].setPrecio(precio);
            instr.nextLine();
        }
        imprimeix(llibreria);
    }

    public static void imprimeix(exre02class[] llibreria) {
        for (int i = 0; i < tamany; i++) {
            llibreria[i].imprimir();
        }
    }

}
