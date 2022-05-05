package Bloque1;

import java.util.Scanner;

public class Bloque1_activitat6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1, n2, Quotient;

        System.out.println("Intro primer número");
        n1 = in.nextFloat();
        System.out.println("Intro segon número");
        n2 = in.nextFloat();

        Quotient = n1 / n2;
        System.out.printf(" El quocient es %.2f ", Quotient);

    }

}
