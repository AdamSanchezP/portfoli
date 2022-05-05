package Bloque3;

import java.util.Scanner;

public class autoavalucio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombres;

        System.out.println(" Introdueix els noms ");
        nombres = (" " + in.nextLine() + " ");


        if (nombres.contains(" " + "eva" + " ")) {
            nombres = nombres.replace(" " + "eva" + " ", " " + "Eva" + " ");

        }else{
            System.out.println("no conte eva");
        }

        System.out.println(nombres.trim());


        }
    }



