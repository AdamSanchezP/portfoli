package Bloque6.actividad7;
//IMPORTACIONES

import activitatsclasses.Bloc5proves;
import java.util.Scanner;

public class Bloc6_7_Main {

    public static final int trabajadores = 5;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        

        Bloc6_7_class1[] atrabajadores = new Bloc6_7_class1[trabajadores];

        
            
           atrabajadores[0]=new Bloc6_7_class1("Pepe", 22, 622451059, "Contabilitat");
           atrabajadores[1]=new Bloc6_7_class1("Adam", 23, 622451058, "RRHH");
           atrabajadores[2]=new Bloc6_7_class1("Victor", 24, 622451060, "Valorant");
           atrabajadores[3]=new Bloc6_7_class1("Marcos", 25, 622451061, "CSGO");
           atrabajadores[4]=new Bloc6_7_class1("Marc", 26, 622451062, "COD");
           
            
           
        
        
         imprime(atrabajadores);
        
        

    }
    
    public static void imprime(Bloc6_7_class1[] imprimir){
            for (int i = 0; i < 5; i++) {
                imprimir[i].imprimeix();
        }
        }

}
