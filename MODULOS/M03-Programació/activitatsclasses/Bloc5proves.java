package activitatsclasses;

import java.util.Scanner;

public class Bloc5proves {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);

        classCotxe[] concessionari = new classCotxe[3];

        for (int i = 0; i < concessionari.length; i++) {
            System.out.println("Marca: ");
            String marca = in.nextLine();
            System.out.println("Model: ");
            String model = in.nextLine();
            System.out.println("Potència: ");
            int potencia = inNum.nextInt();
            System.out.println("És electric: ");
            boolean electric = inNum.nextBoolean();

            concessionari[i] = new classCotxe(marca, model, potencia, electric);
        }

        imprimeix(concessionari);
        mitjanaPotencia(concessionari);
        comptaElectrics(concessionari);
        
    }

    public static void imprimeix(classCotxe[] taller) {
        System.out.println("Resultat del taller");
        for (int i = 0; i < taller.length; i++) {
            taller[i].imprimeix();
        }
    }

    public static void mitjanaPotencia(classCotxe[] taller) {
        int sumaPot = 0;
        for (int i = 0; i < taller.length; i++) {
            sumaPot = sumaPot + taller[i].getPotencia();
        }
        double mitjana = (float) sumaPot / taller.length;
        System.out.println("Mitjana: " + mitjana);
    }

    public static void comptaElectrics(classCotxe[] taller) {
        int sumaElectrics = 0;
        for (int i = 0; i < taller.length; i++) {
            if (taller[i].isElectric() == true) {
                sumaElectrics++;
            }
        }
        System.out.println("Electrics: " + sumaElectrics);
    }    
    
    public static classCotxe potenciaSuperior(classCotxe[] taller) {
        int max = 0;
        int potMax = taller[0].getPotencia();
        for (int i = 1; i < taller.length; i++) {
            if ( taller[i].getPotencia() > potMax){
                max = i;
                potMax = taller[i].getPotencia();
            }
        }
        return taller[max];
    }
    
    
}
