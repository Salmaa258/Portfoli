package Bloc2Problems;

import java.util.Scanner;

public class Exercici11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int preu, desc;

        System.out.println("Escriu un preu:");
        preu = in.nextInt();

        if (preu > 10000) {
            desc = preu * 10 / 100;
        } else {
            desc = preu * 5 / 100;
        }

        preu = preu - desc;
        System.out.println("El preu final es " + preu);

    }

}
