
package Bloc5Problems;

import java.util.Scanner;


public class Exercici4 {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] notes = new int [20];
        
        for (int i = 0 ; i < notes.length ; i++){
            System.out.println("Introdueix una nota");
            notes [i] = in.nextInt();
        }
        
        float suma = 0, mitjana;
        for (int i = 0 ; i < notes.length ; i++){
            suma += notes[i];
        }
        mitjana = suma / notes.length;
        System.out.println("La mitjana es: " + mitjana );
        
        
        
        
    }
    

    
}
