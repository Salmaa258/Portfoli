package Bloc3Problems;

import java.util.Scanner;

public class Exercici {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, resultat;

        System.out.println("introdueix un numero");
        num = in.nextInt();

        resultat = 1;
        for (int i = num; i >= 1; i--) {
            resultat = resultat * i;
        }
        System.out.println("El resultat es: " + resultat);

        /*int i = 1;
        resultat = 1;
        while (i <= num) {
            resultat = resultat * i;
            i++;
        }
        System.out.println("el resultat es: " + resultat);
    
        i = 1;
        resultat = 1;
        do {
            resultat = resultat * i;
            i++;
        } while (i <= num){
            System.out.println("el resultat ess: " + resultat);
    }
    /*/
    
    }
}
