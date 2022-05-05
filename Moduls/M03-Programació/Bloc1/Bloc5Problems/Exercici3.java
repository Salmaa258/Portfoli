
package Bloc5Problems;

import java.util.Scanner;


public class Exercici3 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int [] num = new int [6];
        
        int multiple = 0;
        for (int i = 0 ; i < num.length ; i++){
            System.out.println("Introdueix un numero");
            num[i] = in.nextInt();
            if (num[i] % 3 == 0){
                multiple+=num[i];
            }
        }
        
        System.out.println("La suma dels continguts dels numeros multiples "
                + "de 3 es: " + multiple);
        
        
        
        
        
        
        
        
    }
    
    
}
