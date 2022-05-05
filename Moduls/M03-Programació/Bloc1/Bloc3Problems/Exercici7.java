package Bloc3Problems;

import java.util.Scanner;

public class Exercici7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, resultat;
           
        
        
        do {
            System.out.println("introdueix un numero");
            num = in.nextInt();
            if (num == 0) {
                if (num % 2 == 0) {
                    System.out.println("Numeros parells: " + num);
                }
            }
        } while (num >= 1);

    }
}
