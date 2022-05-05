package Bloc3Problems;

import java.util.Scanner;

public class ExerciciFactorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, resultat = 1;

        System.out.println("introdueix un numero");
        num = in.nextInt();

        for (int i = num; i > 0; i--) {
            resultat = resultat * i;
        }

        System.out.println("El resultat es: " + resultat
                + ", i l'últim digit es: " + (resultat % 10));
    }
}
