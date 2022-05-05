/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenrec_sanchezadam;

import java.util.Scanner;

public class exrecmain {

    public final static int maxim = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        //creacio d'arrays
        examenrecclass_articles[] arrayarticles = new examenrecclass_articles[maxim];

        exrecclass_venedor[] arrayvenedors = new exrecclass_venedor[maxim];

        int[][] array2d = new int[maxim][maxim];

        //trucada als metodes
        arrayarticles = omplirArrayArticles(arrayarticles, in, instr);
        arrayvenedors = omplirArrayVenedors(arrayvenedors, in, instr);
        array2d = omplirArray2D(array2d, in);
        generaInforme(arrayarticles, arrayvenedors, array2d, instr);
        beneficiPerArticle(in, array2d, arrayarticles, arrayvenedors);

    }

    public static examenrecclass_articles[] omplirArrayArticles(examenrecclass_articles[] arrayarticles, Scanner in, Scanner instr) {
        int id, preu;
        String nom;
        for (int i = 0; i < maxim; i++) {

            id = i;

            System.out.println(" Introdueix el nom de l'article : ");
            nom = instr.nextLine();

            System.out.println(" Introdueix el preu de l'article : ");
            preu = in.nextInt();

            arrayarticles[i] = new examenrecclass_articles(id, nom, preu);
        }
        return arrayarticles;
    }

    public static exrecclass_venedor[] omplirArrayVenedors(exrecclass_venedor[] arrayvenedors, Scanner in, Scanner instr) {

        String nom, DNI;
        for (int i = 0; i < maxim; i++) {
            System.out.println(" Introdueix el DNI del venedor : ");
            DNI = instr.nextLine();

            System.out.println(" Introdueix el nom del venedor : ");
            nom = instr.nextLine();

            arrayvenedors[i] = new exrecclass_venedor(DNI, nom);
        }

        return arrayvenedors;
    }

    public static int[][] omplirArray2D(int[][] array2d, Scanner in) {

        for (int i = 0; i < maxim; i++) {

            for (int j = 0; j < maxim; j++) {

                array2d[i][j] = (int) (Math.random() * (3 - 0)) + 0;

            }
        }

        return array2d;
    }

    public static void generaInforme(examenrecclass_articles[] arrayarticles, exrecclass_venedor[] venedors, int[][] array2d, Scanner in) {

        for (int i = 0; i < maxim; i++) {
            int beneficigenerat = 0;

            System.out.println("El venedor " + venedors[i].getNom() + " ha fet les seguents vendes: ");

            for (int j = 0; j < maxim; j++) {

                if (array2d[i][j] != 0) {
                    System.out.println(arrayarticles[j].getNom());
                    System.out.println(" Unitats vengudes :" + array2d[i][j]);

                    beneficigenerat += arrayarticles[j].getPreu() * array2d[i][j];

                }

            }
            System.out.println(" El benefici generat del  " + venedors[i].getNom() + " ha sigut : " + beneficigenerat + " € ");
        }
    }

    public static void beneficiPerArticle(Scanner in, int[][] array2d, examenrecclass_articles[] arrayarticles, exrecclass_venedor[] arrayvenedors) {
        int entrada, cont = 0, beneficiindv = 0, beneficitotal = 0;

        System.out.println(" Introdueix ID article per poder fer la cerca : ");
        entrada = in.nextInt();

        System.out.println(" De l'article amb id : " + entrada + " els beneficis de cada venedor han estat : ");
        while (cont < maxim) {
            beneficiindv = array2d[cont][entrada] * arrayarticles[entrada].getPreu();
            beneficitotal += beneficiindv;

            if (beneficiindv != 0) {
                System.out.println(arrayvenedors[cont].getNom() + " : " + beneficiindv + " € ");
            } else {

            }

            cont++;
        }
        System.out.println("El benefici total d'aquest article ha sigut de : " + beneficitotal + " € ");

    }

}
