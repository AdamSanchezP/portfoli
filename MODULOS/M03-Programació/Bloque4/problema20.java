package Bloque4;

import java.util.Scanner;

public class problema20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);
        String trabajador;
        int anystreballats, bonustotal=0;
        boolean introduir = true;
        while (introduir) {
            System.out.println(" introduce el nombre del trabajador ");
            trabajador = instr.nextLine();
            if (trabajador.equals("FI")) {
                introduir = false;
                break;
            } else {

            }
            System.out.println(" Introduce los anyos trabajados del trabajador ");
            anystreballats = in.nextInt();
            if (anystreballats>3 && anystreballats<10){
                bonustotal+=300;
            }else  if (anystreballats>10 && anystreballats<15){
            bonustotal+=400;
            }else if (anystreballats>15){
                bonustotal+=700;
            }

        }
        System.out.println(" En total has pagat " + bonustotal + " € " + " en bonus ");

    }
}
