package Bloque3;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class bloque3_activitat6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int  suma=1, cont=0;
        for (cont=0;cont < 101; cont++){
            suma=cont+suma;

        }
        System.out.println(" La suma total es " + suma);
    }

}
