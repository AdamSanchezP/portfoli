package Bloque5;
import java.util.Scanner;


public class activitatarrays1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] mitjanes = new int [5];
        int suma=0;
        for ( int i=0 ; i<mitjanes.length; i++ ){
            mitjanes[i] = in.nextInt();
        }

        for ( int j=0 ;j<mitjanes.length ;j++ ){

            suma=mitjanes[j]+suma;
        }
        System.out.println(" la mitjana es : " + suma / mitjanes.length);
    }
}
