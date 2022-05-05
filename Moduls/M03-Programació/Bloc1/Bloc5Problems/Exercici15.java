
package Bloc5Problems;

import java.util.Scanner;


public class Exercici15 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int [] num = new int [20];
        
        int parell = 0;
        for (int i = 0 ; i < num.length ; i++){
            if (num[i] % 2 == 0){
                parell = parell + 2;
            }
            System.out.println(parell);
        }
        
        
       
        
        
        
        
    }    
    
}
