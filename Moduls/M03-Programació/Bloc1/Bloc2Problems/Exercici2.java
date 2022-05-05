package Bloc2Problems;

import java.util.Scanner;

public class Exercici2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;

        System.out.println("Escriu un valor:");
        num1 = in.nextInt();

        System.out.println("Escriu un altre valor:");
        num2 = in.nextInt();

        if (num1 < num2) {
            System.out.println("El nombre major es: " + num2);
        } else {
            System.out.println("El nombre major es: " + num1);
        } if (num1 == num2) {
                System.out.println("El nombre " + num1 + " i " + num2 + " son iguals");
            }

    }

}
