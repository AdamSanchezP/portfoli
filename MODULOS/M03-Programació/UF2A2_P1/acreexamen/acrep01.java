/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF2A2_P1.acreexamen;
import java.util.Scanner;
public class acrep01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int limit=in.nextInt();
        in.nextLine();
        String[]paisos=new String[limit];
        
        demanaPaisos(paisos, in, limit);
        ordenaBombolla(paisos, limit);
        imprimirArray(paisos, limit);
    }
    
    public static void demanaPaisos(String []arr, Scanner in, int limit){
        
        for (int i = 0; i < limit; i++) {
            arr[i]=in.nextLine();
            
        }
        
    }
    
public static void ordenaBombolla(String [] arr, int limit){
    for (int j = 0; j < limit; j++) {
        for (int i = j+1; i < limit; i++) {
            if (arr[j].compareTo(arr[i])>0) {
                String tmp="";
                        tmp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=tmp;
            }
        }
    }
}
    
    public static void imprimirArray(String []arr, int limit){
        for (int i = 0; i < limit; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
