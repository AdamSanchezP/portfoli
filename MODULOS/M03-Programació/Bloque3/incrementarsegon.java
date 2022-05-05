package Bloque3;
import java.util.Scanner;
public class incrementarsegon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hores, minuts, segons;
        System.out.println(" introdueix les hores... ");
        hores = in.nextInt();
        System.out.println(" introdueix els minuts... ");
        minuts = in.nextInt();
        System.out.println("Introdueix els segons...");
        segons = in.nextInt();

        if ((segons <60) && (segons >=0) && (minuts <60) && ((minuts>=0))){
            segons= segons +1;
            if (segons == 60){
                minuts= minuts +1;
                segons = 0;
            } if (minuts == 60){
                hores = hores +1;
                minuts = 0;
            }System.out.println(hores + "h" + minuts + "m" + segons + "s");
        }else{
            System.err.println("Introdueix un valor valid...");
        }


    }
}
