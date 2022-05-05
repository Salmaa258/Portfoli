
package Bloc5Problems;

import java.util.Scanner;


public class Arrays {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     
        /*int [] inventari = new int[10];
        
        
        for (int i = 0 ; i < inventari.length ; i++){
            inventari[i] = in.nextInt();
           
            
        }
        /*/
       
        
        /*Mitjana*/
        float[] notes = new float [5];
        
        for (int i = 0 ; i < notes.length ; i++){
            notes [i] = in.nextFloat();
        }
        
        float suma = 0, mitjana;
        for (int i = 0 ; i < notes.length ; i++){
            suma += notes[i];
        }
        mitjana = suma / notes.length;
        System.out.println("La mitjana es: " + mitjana );
        
        
        
    
    }
}
