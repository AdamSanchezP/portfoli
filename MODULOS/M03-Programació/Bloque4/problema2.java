package Bloque4;
import java.util.Scanner;
public class problema2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cont = 0, multiplicacio;

        for (int i=0 ; i<=10; i++ ){
            if (i % 2 == 0){
                cont=0;
                while (cont<=10){
                  multiplicacio=i*cont;
                    System.out.println(i + " x " + cont + " = " + multiplicacio);
                  cont++;

                }

            }else{

            }
        }



    }
}
