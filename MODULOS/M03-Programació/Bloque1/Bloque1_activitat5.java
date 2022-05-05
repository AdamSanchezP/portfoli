package Bloque1;

import java.util.Scanner;

public class Bloque1_activitat5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, reminder;

        System.out.println("Intro primer número");
        n1 = in.nextInt();
        System.out.println("Intro segon número");
        n2 = in.nextInt();

        reminder = n1 % n2;
        System.out.println(" El residu es " + reminder);

    }

}
