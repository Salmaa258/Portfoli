
package Bloc5Problems;

import java.util.Scanner;

import java.lang.Math;

public class Problema {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        int[][] nota = new int[5][1]; 
        
        int suma = 0;
        for (int j = 0; j < nota[0].length; j++){
            for (int i = 0; i < nota.length; i++){
                
                nota[i][j] = (int) (Math.random() * 3);
                
                suma += nota[i][j];
               
                System.out.print(nota[i][j] + "  ");
               
            }
            System.out.println("");
            
            
        }
       
        int[][] nota2 = new int[5][1]; 
        
        int suma2 = 0;
        for (int j = 0; j < nota[0].length;j++){
            for (int i = 0; i < nota.length; i++){
                
                nota[i][j] = (int) (Math.random() * 4);
                
                suma2 += nota[i][j];
               
                System.out.print(nota[i][j] + "  ");
            }
            System.out.println("");
            
        }
        
        int[][] nota3 = new int[5][1]; 
        
        int suma3 = 0;
        for (int j = 0; j < nota[0].length; j++){
            for (int i = 0; i < nota.length; i++){
                
                nota[i][j] = (int) (Math.random() * 6);
                
                suma3 += nota[i][j];
                
                System.out.print(nota[i][j] + "  ");
            }
            System.out.println("");
            System.out.println(suma);
            System.out.println(suma2);
            System.out.println(suma3);
            
            
        }
        
    }
    
    
    
}
