package Bloque3;
import java.util.Scanner;
public class bloque3_activitat22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String correu;
        int arroba , cont;



        System.out.println(" Introdueix un correu electronic... ");
        correu = in.nextLine();

        //A partir de aqui esta la parte de saber si tiene @ o no


            if (correu.indexOf("@") > 0 ){
                System.out.println("conte arroba");
            }else{
                System.out.println("No conte arroba");
            }




    }

}
