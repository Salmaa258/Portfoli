package Bloc3Problems;

import java.util.Scanner;

public class Exercici5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*int num, resultat, nummul;

        num = 2;
        nummul = 1;
        resultat = 1;
        do {
            System.out.println("el resultat de " + num + "*"
                    + nummul + " = " + resultat);
            nummul++;
            resultat = num * nummul;

            if (nummul >= 10) {
                nummul = 1;
                num = num + 1;
                nummul++;
                resultat = num * nummul;
            }
        } while (num <= 10);*/
        
        
        
        int i, resultat, j;

        i = 1;
        j = 1;
        resultat = 1;
        do {
            System.out.println("el resultat de " + i + "*"
                    + j + " = " + resultat);
            j++;
            resultat = i * j;

            if (j >= 10) {
                j = 1;
                i = i + 1;
                j++;
                resultat = i * j;
            }
        } while (i <= 10);

    }
}
