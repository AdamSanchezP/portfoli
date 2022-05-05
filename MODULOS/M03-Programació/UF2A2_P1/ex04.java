package UF2A2_P1;

import java.util.*;

public class ex04 {
     public static void main(String[] args) {
        int cont = 0;
        int []contarr=new int [1];
        Scanner in = new Scanner(System.in);

        int entradateclat = in.nextInt();
        in.nextLine();
        String[] arr = new String[entradateclat];
        omplirArray(arr, in);
        
        String x = in.nextLine();
        ordenaBombolla(arr, entradateclat);
        int result = cercaBinaria(arr, x, cont, contarr);

        if (result == -1) {
            System.out.println("Total passades: " + contarr[0]);
            System.out.println("No trobat");
        } else {
            System.out.println("Total passades: " + contarr[0]);
            System.out.println("Trobat a la posició: " + result);
        }

    }

    // Returns index of x if it is present in arr[],
    // else return -1
    static int cercaBinaria(String[] arr, String x, int cont, int []contarr) {
        String l = "", r = arr.length - 1;
        
        while (l <= r) {
            cont++;
            contarr[0]=cont;
            int m = l + (r - l) / 2;

            int res = x.compareTo(arr[m]);

            // Check if x is present at mid
            if (res == 0) {
                return m;
            }

            // If x greater, ignore left half
            if (res > 0) {
                l = m + 1;
            } // If x is smaller, ignore right half
            else {
                r = m - 1;
            }
            
            
            
        }
        

        return -1;
    }

    // Driver method to test above
    
     public static void ordenaBombolla(String[] paisos, int entradateclat) {

        String temp;
        
        for (int j = 0; j < entradateclat; j++) {
            for (int i = j + 1; i < entradateclat; i++) {
                // comparing adjacent strings
                if (paisos[i].compareTo(paisos[j]) < 0) {
                    temp = paisos[j];
                    paisos[j] = paisos[i];
                    paisos[i] = temp;
                }
            }
            
        }

    }
    public static void omplirArray(String[] paisos, Scanner in) {
        for (int i = 0; i < paisos.length; i++) {
            paisos[i] = in.nextLine();
        }
    }
    
    
   
}



