package Bloc1Problems;

import java.util.Scanner;

public class Exercici4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, div;

        System.out.println("introdueix el primer numero");
        n1 = in.nextInt();
        System.out.println("introdueix el segon numero");
        n2 = in.nextInt();

        div = n1 / n2;
        System.out.println("la divisió és: " + div);

    }

}
