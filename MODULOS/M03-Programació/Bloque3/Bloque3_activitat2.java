package Bloque3;
import java.util.Scanner;
public class Bloque3_activitat2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        double euroh, horast, sueldo, horesex, contex;

        System.out.println(" Introdueix a quan pagues la hora treballada... ");
        euroh = in.nextInt();
        System.out.println(" Introdueix quantes hores a fet el treballador... ");
        horast = in.nextInt();

        if (horast<=40){
            sueldo= euroh * horast;
        }else if (horast > 40){
            contex = horast - 40;
            horesex = euroh * 1.5;

        }


    }




}
