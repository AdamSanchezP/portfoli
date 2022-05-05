package UF2A1_P1;

import java.util.Scanner;

public class UF2A1_P1_ACT1 {

    public static void main(String[] args) {
        int a, b;

        String operacio = "";
        boolean sortir=false;
        Scanner in = new Scanner(System.in);
        
        do {

            if (in.hasNextInt()) {
                a = in.nextInt();
                b = in.nextInt();
                in.nextLine();
                operacio = in.nextLine();
                switch (operacio) {
                    case "+":
                        sumar(a, b);
                        break;

                    case "-":

                        restar(a, b);
                        break;

                    case "/":
                        dividir(a, b);
                        break;

                    case "x":
                        multiplicar(a, b);
                        break;
                }
            } else if(in.nextLine().equals("S")){
                sortir=true;
            }
           

        } while (sortir!=true);

    }

    public static void sumar(int a, int b) {
        int resultado;

        resultado = a + b;

        System.out.println(a + " + " + b + " = " + resultado);
    }

    public static void restar(int a, int b) {
        int resultado;

        resultado = a - b;

        System.out.println(a + " - " + b + " = " + resultado);
    }

    public static void dividir(int a, int b) {
        int resultado = 0;
        if (b == 0) {
            System.out.println("No es pot dividir per 0.");
        } else {
            resultado = a / b;
             System.out.println(a + " / " + b + " = " + resultado);
        }

       
    }

    public static void multiplicar(int a, int b) {
        int resultado;

        resultado = a * b;

        System.out.println(a + " x " + b + " = " + resultado);
    }
}
