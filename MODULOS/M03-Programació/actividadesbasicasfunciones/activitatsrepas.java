/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadesbasicasfunciones;

import java.util.Scanner;


public class activitatsrepas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        actividad01();
        
        int num1=5, num2=6, suma;
        suma=actividad02(num1, num2);
        System.out.println(suma);
        majorque(in);
        ex04();
    }
    
    public static void actividad01(){
        System.out.println(" Hola mundo ");
    }
    
    public static int actividad02 (int num1, int num2){
        int suma;
        suma=num1+num2;
        
        return suma;
    }
    
    public static void majorque(Scanner in){
        int entradateclat;
        entradateclat = in.nextInt();
        
        if (entradateclat>0) {
            System.out.println(" El numero " + entradateclat + " es mes gran que 0 ");
        }else{
            System.out.println(" El numero " + entradateclat + " es mes petit que 0 ");
        }
    }
    
}
