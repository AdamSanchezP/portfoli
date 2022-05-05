/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bloque5;

import java.util.Scanner;
import java.math.*;
import java.util.Arrays;
public class Activitatarrays2d19012022 {

    public static void main(String[] args) {
        int[][] ganader = new int[5][31];
        int  m1=0, m2=0, m3=0, m4=0, m5=0, maxtemp=0, dia=0;
        for (int i = 0; i < ganader.length; i++) {
            for (int j = 0; j < ganader[i].length; j++) {
                ganader[i][j] = (int) (Math.random() * 50);
                
                if (j==0) {
                    m1+=ganader[i][j];
                }else if (j==1) {
                    m2+=ganader[i][j];
                }else if (j==2) {
                    m3+=ganader[i][j];
                }else if (j==3) {
                    m4+=ganader[i][j];
                }else if (j==4) {
                    m5+=ganader[i][j];
                }
            }
        }
        System.out.println(" Les temperatures mitjanes són: ");
        System.out.println(" Animal 1: " + (float) m1/31 + " graus ");
        System.out.println(" Animal 2: " + (float) m2/31 + " graus ");
        System.out.println(" Animal 3: " + (float) m3/31 + " graus ");
        System.out.println(" Animal 4: " + (float) m4/31 + " graus ");
        System.out.println(" Animal 5: " + (float) m5/31 + " graus ");
        
        
        for (int i = 0; i < ganader.length; i++) {
            int j=0;
            for ( j=0; j < ganader[i].length; j++) {
                
               
                if (i==0) {
                    maxtemp=ganader[i][j];
                    dia=j;
                    
                }else if (ganader[i][j]>maxtemp) {
                    maxtemp=ganader[i][j];
                    dia=j;
                }
                
            }
             
        }
        System.out.println(" La temperatura maxima ha sigut: " + maxtemp + " Graus " + " --> " + " Al dia: " + dia);
        
        
        
    }
}
