package Bloque5;
import java.util.Scanner;
import java.util.Arrays;
public class activitat31arrays2d {
    public static final int venedors=4;
    public static final int productes=7;
    public static void main(String[] args) {

        int [][]array2d=new int [venedors][productes];
        int suma=0, maxvenedor=0, maxproducte=0;

       for ( int i=0;i<venedors ;i++){
           for (int j=0;j<productes ;j++){
            array2d[i][j] = (int) (Math.random()* 50);
               System.out.print(array2d[i][j] + " ");
           }
           System.out.println("");
           //System.out.println("vendedor" + i );
       }

       for (int i=0;i<venedors;i++ ){
           suma=0;
           for (int j=0; j<productes;j++){

                   suma+=array2d[i][j];

           }
           System.out.println(" vendedor "+ i + " ha vendido " + suma);

       }



    }

}
