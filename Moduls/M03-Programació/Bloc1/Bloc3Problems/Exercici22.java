
package Bloc3Problems;

import java.util.Scanner;


public class Exercici22 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String arroba = "@";
        System.out.println("Escriu un correu");
        String cadena = in.nextLine();

        if (cadena.contains(arroba)) {
            System.out.println("conté un '@'");
        } else {
            System.out.println("no conté un '@'");
        }

    }

}
    

