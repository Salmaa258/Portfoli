
package Bloc3Problems;

import java.util.Scanner;
import java.lang.Math;

public class Exercici20 {
    
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n,m;
        
         System.out.println("Intro m");
         m = in.nextDouble();
         
         System.out.println("Intro n");
         n = in.nextDouble();
         
         double pot = Math.pow(m, n);
         
         pot = 1;
         for (int i = 1 ; i <= n; i++){
             pot = pot * m;
         }
         System.out.println(pot);
         
         
}
}