package UF2_A3_ACTIVITATSFUNCIONS;

import java.util.Scanner;

public class ex03_penjat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arrayparaules = new String[5];
        boolean sortir = false, codificar = true;
        String paraula = "";
        char lletra;
        int numeroaleatori, contintents;
        //omplirarray
        arrayparaules[0] = "Kanchenjunga";
        arrayparaules[1] = "Lhotse";
        arrayparaules[2] = "ChomoLonzo";
        arrayparaules[3] = "Kanjut Sar";
        arrayparaules[4] = "Rakaposhi";
        String str1 = "";

        //codificafio paraula
        do {

            paraula = agafaParaula(paraula, arrayparaules);
            if (codificar == true) {
                for (int i = 0; i < paraula.length(); i++) {
                    str1 = str1 + "*";
                }
                codificar = false;
            } else {

            }
            
            System.out.println(" Paraula : "+str1);
            System.out.println(" Introdueix lletra: ");
            lletra = in.next().charAt(0);

            comprobarParaula(lletra, paraula, str1);
            
        } while (sortir == false || !paraula.equals(str1));
    }

    public static void comprobarParaula(char lletra, String paraula, String str1) {
        int cont = 1;
        String LLetres = "";
        LLetres = LLetres + lletra;
        for (int i = 0; i < paraula.length(); i++) {
            if (paraula.charAt(i) == lletra) {
                str1=str1.replace(str1.charAt(i), lletra);
                cont++;
                System.out.println(str1);
            } else {
                System.out.println("adios");
            }
{
                
            }
        }
        
        comprovarAhorcat(cont,paraula);
        System.out.println("");
        System.out.println(" Lletres : " + LLetres);
        System.out.println(str1);
        
    }

    public static String agafaParaula(String paraulaagafada, String[] arrayparaules) {
        int numeroaleatori=1;
//        numeroaleatori = (int) (Math.random() * (5 - 0)) + 0;
       
        paraulaagafada = arrayparaules[numeroaleatori].toLowerCase();
        return paraulaagafada;
    }

    public static boolean comprovarAhorcat(int cont, String paraula) {
        boolean sortir=false;
        switch (cont) {
            case 1:
                System.out.println("  ____\n"
                        + "  |\n"
                        + "  |\n"
                        + "  |\n"
                        + "  |\n"
                        + "  |\n"
                        + " _|_\n"
                        + "|   |______\n"
                        + "|          |\n"
                        + "|__________|");
                break;

            case 2:
                System.out.println("  ____\n"
                        + "  |    |\n"
                        + "  |\n"
                        + "  |\n"
                        + "  |\n"
                        + "  |\n"
                        + " _|_\n"
                        + "|   |______\n"
                        + "|          |\n"
                        + "|__________|");
                break;

            case 3:
                System.out.println("  ____\n"
                        + "  |    |\n"
                        + "  |    o\n"
                        + "  |\n"
                        + "  |\n"
                        + "  |\n"
                        + " _|_\n"
                        + "|   |______\n"
                        + "|          |\n"
                        + "|__________|");
                break;

            case 4:
                System.out.println("  ____\n"
                        + "  |    |\n"
                        + "  |    o\n"
                        + "  |    |\n"
                        + "  |\n"
                        + "  |\n"
                        + " _|_\n"
                        + "|   |______\n"
                        + "|          |\n"
                        + "|__________|");
                break;

            case 5:
                System.out.println("   ____\n"
                        + "  |    |\n"
                        + "  |    o\n"
                        + "  |   /|\n"
                        + "  |\n"
                        + "  |\n"
                        + " _|_\n"
                        + "|   |______\n"
                        + "|          |\n"
                        + "|__________|");
                break;

            case 6:
                System.out.println("   ____\n"
                        + "  |    |\n"
                        + "  |    o\n"
                        + "  |   /|\\\n"
                        + "  |\n"
                        + "  |\n"
                        + " _|_\n"
                        + "|   |______\n"
                        + "|          |\n"
                        + "|__________|");
                break;

            case 7:
                System.out.println("   ____\n"
                        + "  |    |\n"
                        + "  |    o\n"
                        + "  |   /|\\\n"
                        + "  |    |\n"
                        + "  |\n"
                        + " _|_\n"
                        + "|   |______\n"
                        + "|          |\n"
                        + "|__________|");
                break;
            case 8:
                System.out.println("   ____\n"
                        + "  |    |\n"
                        + "  |    o\n"
                        + "  |   /|\\\n"
                        + "  |    |\n"
                        + "  |   /\n"
                        + " _|_\n"
                        + "|   |______\n"
                        + "|          |\n"
                        + "|__________|");
                break;
            case 9:
                System.out.println("  ____\n"
                        + "  |    |\n"
                        + "  |    o\n"
                        + "  |   /|\\\n"
                        + "  |    |\n"
                        + "  |   / \\\n"
                        + " _|_\n"
                        + "|   |______\n"
                        + "|          |\n"
                        + "|__________|");
                System.out.println("t'has quedat sense intents");
                System.out.println(" La paraula secreta era " + paraula);
                sortir=true;
                break;
        }
        return sortir;
    }
}
