package Bloc2Problems;

import java.util.Scanner;

public class Exercici15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota;

        System.out.println("Escriu una nota:");
        nota = in.nextFloat();

        if (nota >= 5 && nota < 6) {
            System.out.println("Suficient");
        } else if (nota >= 6 && nota <7) {
            System.out.println("Bé");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Exel·lent");
        } else if (nota > 10) {
            System.out.println("Matricul·la d'honor");
        } else {
            System.out.println("Suspès");
        }

    }

}
