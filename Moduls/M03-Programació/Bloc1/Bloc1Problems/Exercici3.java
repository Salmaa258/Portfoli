package Bloc1Problems;

import java.util.Scanner;

public class Exercici3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, multi;

        System.out.println("introdueix el primer numero");
        n1 = in.nextInt();
        System.out.println("introdueix el segon numero");
        n2 = in.nextInt();

        multi = n1 * n2;
        System.out.println("la multiplicació és: " + multi);

    }

}
