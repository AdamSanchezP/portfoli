package Bloque3;
import java.util.Scanner;
public class activitattrianglepedres {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pedres = 0, pedresperfila=0, pedresposades=0;

        System.out.println("Introduce las piedras que utilizaras...");

        while (pedresposades <= pedres){
        pedresperfila++;
        pedresposades = pedresposades + pedresperfila;
        }
        System.out.println("El triangle es de " + (pedresperfila-1));
        System.out.println(" Sobren " + (pedres - (pedresposades - pedresperfila)));



    }
}
