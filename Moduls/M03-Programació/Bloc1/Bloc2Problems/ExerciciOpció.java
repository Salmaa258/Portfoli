package Bloc2Problems;

import java.util.Scanner;

public class ExerciciOpció {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, suma, resta, multi, div, opcio;

        System.out.println("Escull que vols fer -> sumar (1), restar (2), "
                + "multiplicar (3) o dividir (4), posa-ho en numeros.");
        opcio = in.nextInt();

        System.out.println("Escriu un valor:");
        num1 = in.nextInt();

        System.out.println("Escriu un valor:");
        num2 = in.nextInt();

        suma = num1 + num2;

        resta = num1 - num2;

        multi = num1 * num2;

        div = num1 / num2;

        if (opcio == 1) {
            System.out.println("El resultat es: " + suma);
        } else if (opcio == 2) {
            System.out.println("El resultat es: " + resta);
        } else if (opcio == 3) {
            System.out.println("El resultat es: " + multi);
        } else {
            System.out.println("El resultat es: " + div);
        }

    }

}
