/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitatsclasses;
import static activitatsclasses.Bloc5proves.imprimeix;
import java.util.Scanner;

public class repasclasses {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         Scanner instr = new Scanner(System.in);
         
         classCotxe[] concessionari=new classCotxe[3];
         
         
         
                 

        for (int i = 0; i < concessionari.length; i++) {
            System.out.println("Marca cotxe");
            String marca=instr.nextLine();
            
            System.out.println(" Model cotxe ");
            String model=instr.nextLine();
            
            System.out.println(" Potencia ");
            int potencia=in.nextInt();
            
            System.out.println("Electric");
            boolean electric= in.nextBoolean();
            
            concessionari[i]=new classCotxe(marca, model, potencia, electric);
        }
     
        imprimeix(concessionari);
        System.out.println(" La potencia mitjana es " + potenciaMitjana(concessionari));
        System.out.println(" Hi ha  " + vehiclesElectrics(concessionari));
        System.out.println(" El total amb l'increment es : " + sumaPotencia(concessionari));
        
        
        
    }
    public static void imprimeix (classCotxe[]taller){
        System.out.println("Impressio array");
        for (int i = 0; i < taller.length; i++) {
         taller[i].imprimeix();
        }
    }
    
    public static double potenciaMitjana (classCotxe[]potencies){
         int potenciasuma=0;
        for (int i = 0; i < potencies.length; i++) {
           
            potenciasuma+=potencies[i].getPotencia();
            
           
        }
        double mitjana = (float)potenciasuma/potencies.length;
        return  mitjana;
    }
    
    public static double vehiclesElectrics (classCotxe[] electrics){
        int contelectrics=0;
        for (int i = 0; i < electrics.length; i++) {
            if (electrics[i].isElectric() == false) {
                contelectrics++;
            }
            
        }
        return (int) contelectrics;
    }
    
    public static int sumaPotencia(classCotxe[] potenciasuma) {
        int sumapotencia=0;
        for (int i = 0; i < potenciasuma.length; i++) {
            
            sumapotencia=potenciasuma[i].augmentaPotencia(10);
        }
        return sumapotencia;
    }
    
}
