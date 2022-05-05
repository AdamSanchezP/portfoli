package Bloque3;
import java.util.Scanner;
public class tablasdemultiplicar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mult=1, cont=1, vueltas=1;
        do {
           mult=mult*cont;
           cont++;
            System.out.println("El resultat es " + mult);
           if (cont==10){
               mult++;
               vueltas++;
               cont=cont-10;
           }
        }while (vueltas != 10);

    }

}
