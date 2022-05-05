
package Bloc3Problems;

import java.util.Scanner;


public class Exercici3 {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int diners;
        
        System.out.println("Introdueix el salari anual");
        diners = in.nextInt();
        
        if (diners <= 9000){
            diners = diners * 1;
            System.out.println("El salari total es: " + diners);
        } else if (diners <= 15000){
            diners = diners * 1;
            System.out.println("El salari total es: " + diners);
        } else if (diners <= 20000){
            diners = diners * 5;
            System.out.println("El salari total es: " + diners);
        } else if (diners > 20000){
            System.out.println("El salari total es: " + diners);

    }
 
    }
    }