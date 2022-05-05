package Bloque3;
import  java.util.Scanner;
public class bloque3_activitat19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int conta=0, conte=0, conti=0, conto=0, contu=0;


        System.out.println(" Introdueix una frase... ");
        String frase = in.nextLine();

        for (int i=0 ; i < frase.length() ; i++){
            if (frase.charAt(i)=='a'){
                conta++;
            }else if (frase.charAt(i)=='e'){
                conte++;
            }else if (frase.charAt(i)=='i'){
                conti++;
            }else if (frase.charAt(i)=='o'){
                conto++;
            }else if (frase.charAt(i)=='u'){
                contu++;
            }

        }
        System.out.println(" llistat de vocals a la frase \n" + " a= " + conta + " e= " + conte + " i= " + conti + " o= " + conto + " u= " + contu);

    }
}
