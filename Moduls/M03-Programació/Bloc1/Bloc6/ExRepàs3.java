
package Bloc6;

import java.util.Scanner;


public class ExRepàs3 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
     int[][] prova = new int [3][3];
     for (int i = 0; i < prova.length; i++){
         for (int j = 0; j < prova[i].length; j++){
             if (i + j == prova.length - 1){
                 prova[i][j] = 1;
             }
             System.out.print(prova[i][j] + " ");
         }
         System.out.println(" ");
     }
    
    }
    
}
