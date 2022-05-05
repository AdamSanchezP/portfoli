/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF2_A1_ACTIVITATS;



import java.util.Scanner;
public class ex05_matrius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opciomenu;
        int matriu;
        String sortir="";
        do{
                System.out.println("Introdueix que vols fer : ");
        opciomenu = in.nextLine();
        switch(opciomenu){
            case "generaMatriu": 
                generaMatriu(in);
                int[][] matriumostra=generaMatriu(in);
                mostraMatriuGenerada(matriumostra);
            break;
            case "demanaMatriu":
                    demanaMatriu(in);
                    break;
            
                    
            default :
                System.out.println(" Opcio no correcta, torna a introduirla : ");
        }
        //Declaracion de arrays
        }while(sortir.equals(false));;
        
    
        
        
        
    }
    
    
 
    public static int [][]generaMatriu(Scanner in){
        int x,y, min, max;
        
        System.out.println("Introdueix la dimensio x del array -->");
        x = in.nextInt();
        System.out.println("Introdueix la dimensio y del array -->");
        y = in.nextInt();
        System.out.println(" Introdueix el minim random -->");
        min = in.nextInt();
        System.out.println(" Introdueix el maxim random -->");
        max=in.nextInt();
        int [][]matriugenerada = new int [x][y];
        
        for (int i = 0; i < matriugenerada.length; i++) {
            for (int j = 0; j < matriugenerada[i].length; j++) {
                matriugenerada[i][j]=(int)(Math.random()*(max - min)+min);
            }
        }
        
  
       return matriugenerada; 
    }
    
    public static void mostraMatriuGenerada(int [][] imprimeixmatriu){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(imprimeixmatriu[i][j]);
            }
        }
        
    }
    
    public static int [][] demanaMatriu(Scanner in){
        int x,y, entradateclat;
        System.out.println(" Introdueix mida x del array : ");
        x = in.nextInt();
        System.out.println(" Introdueix mida y del array : ");
        y= in.nextInt();
        
        int [][] matriudemanada = new int [x][y];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
        System.out.println(" Introdueix el valor per la posicio " + x + " " + y);
        entradateclat = in.nextInt();
        matriudemanada[i][j]=entradateclat;
            }
        }
       
       return matriudemanada;
    }
    
    public static void imprimeixmatriudemanada(int [][] imprimeixmatriudemanada){
        
    }
   
    
    
    
}
