package Bloc7;

import java.util.Scanner;

public class Exercici5 {

    public static final int materies = 4;
    public static final int alumnes = 5;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] notes = new int[4][3];

        emplena(notes);
        mitjanaMateries(notes);
        mitjanaAlumnes(notes);

    }

    public static void emplena(int[][] qualificacions) {
        for (int i = 0; i < materies; i++) {
            for (int j = 0; j < alumnes; j++) {
                qualificacions[i][j] = (int) (Math.random() * 10);
                System.out.print(qualificacions[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void mitjanaMateries(int[][] qualificacions) {
        int suma;
        double mitjana;
        for (int i = 0; i < materies; i++) {
            suma = 0;
            for (int j = 0; j < alumnes; j++) {
                suma += qualificacions[i][j];
            }
            mitjana = (double) suma / alumnes;
            System.out.println("Mitjana materia " + i + ": " + mitjana);
        }

    }

    public static void mitjanaAlumnes(int[][] qualificacions) {
        int suma;
        double mitjana;
        for (int j = 0; j < alumnes; j++) {
            suma = 0;
            for (int i = 0; i < materies; i++) {
                suma += qualificacions[i][j];

                mitjana = (double) suma / materies;
                System.out.println("Mitjana alumnes " + i + ": " + mitjana);

            }
        }

    }

}
