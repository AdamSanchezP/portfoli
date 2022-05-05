package Bloque2;

import java.util.Scanner;

public class Bloque2_cualestuedad {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Dia, Mes, Año, DiaN, MesN, AñoN, Edad, Resultado;

        System.out.println("Introduce Dia actual");
        Dia = in.nextInt();
        System.out.println("Introduce Mes actual");
        Mes = in.nextInt();
        System.out.println("Introduce Año actual");
        Año = in.nextInt();

        System.out.println("Introduce Dia nacimiento");
        DiaN = in.nextInt();
        System.out.println("Introduce Mes nacimiento");
        MesN = in.nextInt();
        System.out.println("Introduce año nacimiento");
        AñoN = in.nextInt();
        Edad = (Año - AñoN);

        if (Mes > MesN) {
            Resultado = Edad - 1;
            System.out.println("Tienes" + Resultado);


        }

    }
}
