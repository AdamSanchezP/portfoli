package Bloque5;

import java.util.Arrays;
import java.util.Scanner;

public class Activitatarrays15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] evennumbers = new int[20];
        for (int i = 0; i < evennumbers.length; i++) {
            evennumbers[i] = i * 2;
        }
        System.out.print(Arrays.toString(evennumbers));
    }
}
