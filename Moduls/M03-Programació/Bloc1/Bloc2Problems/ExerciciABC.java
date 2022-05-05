package Bloc2Problems;

import java.util.Scanner;

public class ExerciciABC {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Escriu un número:");
        num1 = in.nextInt();

        System.out.println("Escriu un segon número:");
        num2 = in.nextInt();

        System.out.println("Escriu un tercer número:");
        num3 = in.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El numero major es " + num1);
            } else {
                System.out.println("El numero major es " + num3);
            }
        } else if (num2 > num3) {
            System.out.println("El numero major es " + num2);
        } else {
            System.out.println("El numero major es " + num3);
        }

    }

}
