
package Bloc6;

import java.util.Scanner;


public class ExRepàs10 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        
        int[][] prova = new int [4][5];

        
        
        for (int j = 0; j < prova[0].length ; j++){
            int num = j;
            for (int i= 0; i < prova.length ; i++){
               
                prova[i][j] = num;
                num = num * 2;
                
                System.out.print(prova[i][j] + " ");  
                
       
            }
            System.out.println("");
             
            
        }
    
    
    }
}
