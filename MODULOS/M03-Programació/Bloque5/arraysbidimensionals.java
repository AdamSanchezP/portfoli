package Bloque5;
import java.util.Scanner;
import java.util.Arrays;
public class arraysbidimensionals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=1;
        int[][] array2d = new int[3][3];
        for (int i = 0; i < array2d.length; i++){
            for (int j = 0; j <array2d[i].length; j++){

                array2d[i][j]=num;
                num=num*2;
            }
        }
        System.out.println(Arrays.deepToString(array2d));
    }
}