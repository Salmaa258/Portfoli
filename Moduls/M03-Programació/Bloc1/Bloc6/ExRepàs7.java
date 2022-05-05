
package Bloc6;

import java.util.Scanner;


public class ExRepàs7 {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[][] prova = new int [4][5];
        
        int num = 1;
        for (int i = 0; i < prova.length ; i++){
            for (int j= 0; j < prova[i].length ; j++){
                prova[i][j] = num;
                num = num * 2;
                
                System.out.print(prova[i][j] + " ");            
            }
            System.out.println(" ");
        }
        
        
    }    
}
