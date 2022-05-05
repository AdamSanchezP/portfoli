package Bloque6;

import activitatsclasses.Bloc5proves;
import java.util.Scanner;

public class activitat1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Pelicula, Genere, Directorr;

        peliClass[] pelii = new peliClass[3];

        for (int i = 0; i < pelii.length; i++) {
            System.out.println(" Introdueix el nom de la peli ");
            Pelicula = in.nextLine();
            System.out.println(" Introdueix el Genere de la peli ");
            Genere = in.nextLine();
            System.out.println(" Introdueix el director ");
            Directorr = in.nextLine();

            pelii[i] = new peliClass(Pelicula, Genere, Directorr);
        }
        imprimeixArray(pelii);
    }

    public static void imprimeixArray(peliClass[] arraypeli) {
        for (int i = 0; i < arraypeli.length; i++) {
            arraypeli[i].imprimeix();
        }
    }

}
