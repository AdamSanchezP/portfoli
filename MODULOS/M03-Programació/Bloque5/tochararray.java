package Bloque5;

import java.util.Scanner;

public class tochararray {
    public static void main(String[] args) {
        Scanner instr = new Scanner(System.in);
        String dni, nomcomplet;

        //Entradas de teclado
        System.out.println(" Introdueix nom complet ");
        nomcomplet = instr.nextLine();
        System.out.println(" Introdueix el DNI ");
        dni = instr.nextLine();


        String[] partes = nomcomplet.split(",");

        //Definir partes del string

        String parte1 = partes[0]; //1era parte del string separado
        String parte2 = partes[1]; //2nda parte del string separado
        char[] dnichar = dni.toCharArray();
        System.out.println("------------------");
        System.out.println(parte1);
        System.out.println(parte2);
        System.out.println("------------------");
        System.out.println(" DNI en char: ");
        System.out.print(dnichar);
        


    }
}
