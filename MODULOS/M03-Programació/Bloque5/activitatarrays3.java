package Bloque5;
import java.util.Scanner;
public class activitatarrays3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] multiplos = new int[100];
        int entrada=0, suma=0;

        for (int i=0 ; i<=multiplos.length-1 ;i++ ){
            System.out.println(" Introdueix numero ");
            multiplos[i] = in.nextInt();
            if (i%3==0){
            suma+=multiplos[i];
            }else{

            }

        }
        System.out.println(" La suma es " + suma);

    }
}
