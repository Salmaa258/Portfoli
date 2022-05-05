
package Bloc5Problems;

import java.util.Scanner;


public class Exercici5 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float[] notes = new float [5];
        
        int totalNotable = 0;
        for (int i = 0 ; i < notes.length ; i++){
            System.out.println("Introdueix una nota");
            notes [i] = in.nextFloat();
            if((notes[i] >= 7 && notes[i] <= 8)){
                totalNotable++;
                
            }
           
        }
        System.out.println("Total de notes notables: " + totalNotable);
        
        
        
        
    }  
   
    
}
