package Bloque3;
import java.util.Scanner;
public class bloque3_activitat3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double salari;

        System.out.println(" Introdueix el salari del treballador... ");
        salari = in.nextInt();

        if (salari <= 9000) {
            salari = salari * 1.2;
            System.out.println(" El salari es " + salari);
        } else if ((salari >= 9001) && (salari <= 15000)) {
            salari = salari * 1.1;
            System.out.println(" El salari es " + salari);
        } else if ((salari >= 15001) && (salari <= 20000)) {
            salari = salari * 1.05;
            System.out.println(" El salari es " + salari);
        } else if (salari > 20000) {
            System.out.println(" El salari es " + salari);
        }else{

        }
    }
}
