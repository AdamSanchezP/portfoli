package Bloque4;
import java.util.Scanner;
public class problema4 {
    public static void main(String[] args) {

       Scanner keyboard  = new Scanner(System.in);
       int entrada, max=0, min=0, mitj=0, entradamax, suma=0;
        System.out.println(" Cuantos numeros vas a introducir? ");
       entradamax=keyboard.nextInt();
       for ( int i=0 ; i<entradamax ;i++ ){
           System.out.println(" introdueix numero: ");
           entrada=keyboard.nextInt();
           if (i==0){
               min=entrada;
               max=entrada;
           }else if (entrada<min){
               min=entrada;
           }else if (entrada>max){
               max=entrada;
           }
           suma+=entrada;

       }
        System.out.println(" el minim es:" + min);
        System.out.println(" el maxim es: " + max);
        System.out.println(" la mitjana es: " + suma/entradamax);
    }
}
