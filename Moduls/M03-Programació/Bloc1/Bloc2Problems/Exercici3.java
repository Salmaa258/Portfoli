package Bloc2Problems;

import java.util.Scanner;

public class Exercici3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Escriu un valor:");
        num = in.nextInt();

        if (num == 0) {
            System.out.println("El nombre es 0");
        } else if (num < 0) {
            System.out.println("El nombre es negatiu");
        } else {
            System.out.println("El nombre es positiu");
        }

    }

}
