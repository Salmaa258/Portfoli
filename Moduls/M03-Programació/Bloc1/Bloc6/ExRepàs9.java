
package Bloc6;

import java.util.Scanner;


public class ExRepàs9 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[][] prova = new int [4][5];
        
        int suma = 0;
        for (int i = 0; i < prova.length ; i++){
            int num = i, sumaT = 0;
            for (int j= 0; j < prova[i].length ; j++){
                prova[i][j] = num;
                suma = suma + prova[i][j];
                sumaT = sumaT + prova[i][j];
                num = num * 2;
                
                sumaT =+ num;
                
                System.out.print(prova[i][j] + " ");  
               
       
            }
            System.out.println("");
            
        }
    
    }
}