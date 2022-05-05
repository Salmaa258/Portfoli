
package Bloc4Problems;

import java.util.Scanner;


public class Exercici3 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num, max = 0, min = 0, mitjana = 0;
        
        for (int  i = 0; i < 0 ; i++){
            System.out.println("Introdueix un numero");
            num = in.nextInt();
            
            if (num > max){
                max=+num;
                System.out.println("El max es: " + max);
            } else {
                min=+num;
                System.out.println("El minim es: " + min);
            }
            
            mitjana=+num / i;
            System.out.println("La mitjana es: " + mitjana);
            
            
            
            
        }
        
        
        
        
        
    
    }
    
    
    
    
}
