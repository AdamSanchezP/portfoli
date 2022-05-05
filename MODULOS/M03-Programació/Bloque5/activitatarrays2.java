package Bloque5;

import java.util.Scanner;

public class activitatarrays2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] mitjanes = new int [6];
        int par=0, impar=0;

        for ( int j=0 ;j<mitjanes.length ;j++ ){
            mitjanes[j] = in.nextInt();
            if ((mitjanes[j] %2==0) || (mitjanes[j]==0)){
                par=mitjanes[j]+par;
            }else{
                impar=mitjanes[j]+impar;
            }

        }
        System.out.println(" La suma dels valors pars es : " + par);
        System.out.println(" La suma dels valors impars es : " + impar);
    }
}
