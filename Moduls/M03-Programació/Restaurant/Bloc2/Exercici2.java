package Bloc2;

import java.util.Scanner;

public class Exercici2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);

        String[] plat = new String[5];

        String platExitos = "", platnoExitos = "";
        int max = 0, min = 0, totalPlats = 0;
        for (int i = 0; i < plat.length; i++) {
            System.out.println("Introdueix un plat");
            plat[i] = inStr.nextLine();
        }

        int[] vegades = new int[3];

        for (int j = 0; i < plat.length; i++) {
            System.out.println("Introdueix quants cops s'ha venut");
            vegades[j] = in.nextInt();

            totalPlats = totalPlats + vegades[j];

        }

        System.out.println("El plat mes exitos es: " + max);
        System.out.println("El plat mes exitos es: " + plat[max]);
        System.out.println("El plat menys exitos es: " + min);
        System.out.println("El plat menys exitos es: " + platnoExitos);
        System.out.println("S'ha servit un total de " + totalPlats
                + " plats");

    }

}
