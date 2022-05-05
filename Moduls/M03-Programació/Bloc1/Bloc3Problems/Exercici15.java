package Bloc3Problems;

import java.util.Scanner;

public class Exercici15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cadena1 = "Hola ";

        System.out.println("Com et dius?");
        String nom = in.nextLine();

        System.out.println(cadena1.concat(nom));

        System.out.println("La longitud del text es: "
                + cadena1.concat(nom).length());

        char lletra = cadena1.charAt(3);
        System.out.println("la tercera lletra es: " + lletra);

        System.out.println("Digues un altre nom");
        String nom2 = in.nextLine();

        if (nom.equals(nom2)) {
            System.out.println("Son iguals");
        } else {
            System.out.println("son diferents");
        }

        System.out.println(nom.toLowerCase());
        System.out.println(nom2.toUpperCase());
    }
}
