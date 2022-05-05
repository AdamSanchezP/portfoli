/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitatsordenacio;

import java_clases.tmpClass;

import java.util.*;

public class activitat01ordenacio {

    public static void main(String[] args) {

        //crear variables
        int[] vector = new int[5];
        ArrayList<String> list = new ArrayList();

        //Llamadas a metodos
        vector = generaVector(vector);
        mostraVector(vector);

        selectionSort(vector);
        mostraVector(vector);

        ordenaBombolla(vector);
        mostraVector(vector);

        collectionSort(list);
        mostraArrayList(list);
    }
//METODOS

    public static int[] generaVector(int[] vector) {

        vector[0] = 55;
        vector[1] = 20;
        vector[2] = 1;
        vector[3] = 5;
        vector[4] = 7;

        return vector;
    }

    public static void mostraVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");

        }
        System.out.println("");

    }
    
    public static void mostraArrayList(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void mostraVector(ArrayList<Integer> vector) {
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");

        }
        System.out.println("");

    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index  
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void ordenaBombolla(int[] A) {

        int n = A.length;
        int tmp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (A[j - 1] > A[j]) {
                    tmp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = tmp;
                }
            }
        }

    }

    public static void collectionSort(ArrayList<String> list) {

        list.add("hola");
        list.add("adios");
       

        Collections.sort(list);

       
    }

}
