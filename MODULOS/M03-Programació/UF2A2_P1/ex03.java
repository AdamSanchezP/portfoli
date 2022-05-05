/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF2A2_P1;
import java.util.*;
public class ex03 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       ArrayList<String> paisos = new ArrayList<String>();

        int entradateclat;

        entradateclat = in.nextInt();
        in.nextLine();
       

        ompleArray(paisos, entradateclat, in);
        collectionSort(paisos, entradateclat);

    }

    public static void ompleArray(ArrayList<String> paisos, int entradateclat, Scanner in) {
        for (int i = 0; i <entradateclat; i++) {
            paisos.add(in.nextLine());
            
        }

    }

    public static void collectionSort(ArrayList<String> paisos, int entradateclat) {
        Collections.sort(paisos);
        
        System.out.println("Països ordenats:");
        
        for (int i = 0; i < entradateclat; i++) {
            System.out.println(paisos.get(i));
        }
       

    }

}


