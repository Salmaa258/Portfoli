
package Bloc3Problems;

import java.util.Scanner;


public class Exercici6 {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, resultat;

        num = 1;

        resultat = 0;
        for (int i = num; i <= 100; i++) {
            resultat = resultat + i;
        }
        System.out.println("El resultat es: " + resultat);
        
    }
}