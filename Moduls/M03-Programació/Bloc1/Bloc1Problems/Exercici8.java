package Bloc1Problems;

import java.util.Scanner;
import java.lang.Math;

public class Exercici8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radi, resultat = 0;

        System.out.println("Valor:");
        radi = in.nextDouble();

        resultat = 2 * Math.PI * radi;

        System.out.println("Resultat:" + resultat);

    }

}
