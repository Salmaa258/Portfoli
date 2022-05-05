package Bloc3Problems;

import java.util.Scanner;

public class Exercici21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String reves = "";
        System.out.println("Escriu una frase");
        String cadena = in.nextLine();

        for (int i = cadena.length() - 1; i >= 0; i--) {
            reves = reves + cadena.charAt(i);
        }
        /*System.out.println(reves);
         */

        cadena = cadena.replace(" ", "");
        reves = reves.replace(" ", "");
        if (cadena.equals(reves)) {
            System.out.println("es palindrom");
        } else {
            System.out.println("no es palindrom");
        }

    }

}
