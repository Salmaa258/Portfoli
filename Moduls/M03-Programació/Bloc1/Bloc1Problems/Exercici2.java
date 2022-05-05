package Bloc1Problems;

import java.util.Scanner;

public class Exercici2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, suma;

        System.out.println("introdueix el primer numero");
        n1 = in.nextInt();
        System.out.println("introdueix el segon numero");
        n2 = in.nextInt();

        suma = n1 + n2;
        System.out.println("la suma és: " + suma);

    }

}
