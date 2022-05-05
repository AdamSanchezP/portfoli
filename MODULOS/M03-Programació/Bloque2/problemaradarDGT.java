package Bloque2;

import java.util.Scanner;

public class problemaradarDGT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float distanciaM, velMax, segundos, distanciaKM, horas, total, porcentaje;
        /*En esta parte estan las entradas del programa*/
        System.out.println("Introduce la distancia de las dos camaras...");
        distanciaM = in.nextInt();
        System.out.println("Introduce la velocidad maxima permitida en este tramo...");
        velMax = in.nextInt();
        System.out.println("Introduce el tiempo que se ha tardado en hacer el recorrido en segundos...");
        segundos = in.nextInt();
        /*A partir de aqui estan las conversiones*/
        distanciaKM = distanciaM / 1000;
        horas = segundos / 3600;
        total = distanciaKM / horas;
        porcentaje = velMax * 20 / 100;
        /*En esta parte tengo las condicionales*/
        if (total <= velMax) {
            System.out.println("OK");
        } else if (total >= porcentaje + velMax) {
            System.out.println("PUNTOS");
        } else if (total < porcentaje + velMax) {
            System.out.println("MULTA");
        } else {
            System.err.println("Introduce un valor valido");
        }
    }
}
