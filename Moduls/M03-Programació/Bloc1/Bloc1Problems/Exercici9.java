package Bloc1Problems;

import java.util.Scanner;
import java.lang.Math;

public class Exercici9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double catet1, catet2, hipotenusa;

        System.out.println("Introdueix el valor d'un catet:");
        catet1 = in.nextFloat();
        System.out.println("Introdueix el valor d'un catet:");
        catet2 = in.nextFloat();

        hipotenusa = Math.sqrt(catet1 * 2 + catet2 * 2);

        System.out.println("La hipotenusa es: " + hipotenusa);

    }

}
