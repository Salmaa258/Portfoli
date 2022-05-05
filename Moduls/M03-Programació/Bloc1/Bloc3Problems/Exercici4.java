package Bloc3Problems;

import java.util.Scanner;

public class Exercici4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hores, minuts, segons;

        System.out.println("Introdueix una hora");
        hores = in.nextInt();
        System.out.println("Introdueix uns minuts");
        minuts = in.nextInt();
        System.out.println("Introdueix uns segons");
        segons = in.nextInt();

        segons = segons + 1;

        if (segons == 60) {
            minuts = minuts + 1;
            segons = 0;
        }
        if (minuts == 60) {
            hores = hores + 1;
            minuts = 0;
        }

        System.out.println("hores:" + hores + ", minuts:"
                + minuts + ", segons:" + segons);

    }
}
