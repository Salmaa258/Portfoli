
package Bloc5Problems;

import java.util.Scanner;

public class ArraysIntro {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        int [] notes = new int [10];
        
        int sumaPar = 0, sumaImpar = 0;
        for (int i = 0 ; i < notes.length ; i++){
            System.out.println("Introdueix una nota");
            notes[i] = in.nextInt();
            if (notes[i] % 2 == 0){
                sumaPar+=notes[i];
            }else{
                sumaImpar+=notes[i];
            }
        }
        System.out.println("La suma total dels continguts pars de les notes "
                + "es: " + sumaPar);
        System.out.println("La suma total dels continguts impars de les notes "
                + "es: " +sumaImpar);
        
        
        
        
    }    
}
