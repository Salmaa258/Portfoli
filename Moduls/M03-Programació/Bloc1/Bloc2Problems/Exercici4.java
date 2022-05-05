package Bloc2Problems;

import java.util.Scanner;

public class Exercici4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1;

        System.out.println("Escriu un valor:");
        num1 = in.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("El nombre es par");
        } else {
            System.out.println("El nombre es impar");
        }

    }

}
