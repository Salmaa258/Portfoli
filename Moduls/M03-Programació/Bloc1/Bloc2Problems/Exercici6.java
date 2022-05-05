package Bloc2Problems;

import java.util.Scanner;

public class Exercici6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int any1, any2, mes1, mes2, dia1, dia2, edad;

        System.out.println("Escriu l'any de quan vas neixer:");
        any1 = in.nextInt();

        System.out.println("Escriu el mes de quan vas neixer:");
        mes1 = in.nextInt();

        System.out.println("Escriu el dia de quan vas neixer:");
        dia1 = in.nextInt();

        System.out.println("Escriu l'any actual:");
        any2 = in.nextInt();

        System.out.println("Escriu el mes actual:");
        mes2 = in.nextInt();

        System.out.println("Escriu el dia actual:");
        dia2 = in.nextInt();

        edad = any2 - any1;

        if (mes2 < mes1) {
            if (dia2 < dia1) {
                edad = edad - 1;
            }
            edad = edad - 1;
        }

        System.out.println("La teva edad es: " + edad);

    }

}
