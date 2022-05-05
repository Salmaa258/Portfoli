
package Bloc5Problems;

import java.util.Scanner;

import java.lang.Math;

public class Exercici31 {
    
    private static final int Ven = 5;
    private static final int Prod = 5;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] vendes = new int[Ven][Prod];
        int i, j, suma, maxim = -1, vend_maxim = 0, prod_maxim = 0, producte;

        for (i = 0; i < Ven; i++) {
            for (j = 0; j < Prod; j++) {
                vendes[i][j] = (int) (Math.random() * 40);
            }
        }
        System.out.printf("Les vendes introduides han estat...\n");

        for (i = 0; i < Ven; i++) {
            System.out.printf("\n");
            for (j = 0; j < Prod; j++) {
                System.out.printf("%d\t ", vendes[i][j]);
            }
        }
       
        for (i = 0; i < Ven; i++) {
            suma = 0;
            for (j = 0; j < Prod; j++) {
                suma = suma + vendes[i][j];
            }
            if (suma > maxim) {
                maxim = suma;
                vend_maxim = i;
            }
        }

        System.out.printf("\n\nEl venedor que ha tingut més vendes "
                + "és el %d amb %d unitats\n", vend_maxim, maxim);

        
        maxim = -1;
        for (j = 0; j < Prod; j++) {
            suma = 0;
            for (i = 0; i < Ven; i++) {
                suma = suma + vendes[i][j];
            }
            if (suma > maxim) {
                maxim = suma;
                prod_maxim = j;
            }
        }

        System.out.printf("\n\nEl producte més venut és el %d amb %d "
                + "unitats\n", prod_maxim, maxim);

       
        System.out.printf("\nQuin producte vols que calculem ?");
        producte = in.nextInt();
        suma = 0;
        for (i = 0; i < Ven; i++) {
              System.out.println("De l'article " + producte + " el venedor " + i 
                      + " ha venut " + vendes[i][producte] + " unitats");  
        }
    
        
        
    }
}
