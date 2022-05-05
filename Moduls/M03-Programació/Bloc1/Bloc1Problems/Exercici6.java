package Bloc1Problems;

import java.util.Scanner;

public class Exercici6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n, n1;
        float divisio;

        System.out.println("introdueix un numero");
        n = in.nextFloat();
        System.out.println("introdueix un altre numero");
        n1 = in.nextFloat();

        divisio = n / n1;
        System.out.println("la divisio de: " + n
                + " per " + n1 + " es: " + divisio);

    }

}
