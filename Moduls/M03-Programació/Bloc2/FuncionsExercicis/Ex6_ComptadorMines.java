package FuncionsExercicis;

import java.util.Scanner;

public class Ex6_ComptadorMines {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        comptaMines(in);

    }

    public static void comptaMines(Scanner in) {
        int filas;
        int columnas;

        System.out.println("Intro filas");
        filas = in.nextInt();

        System.out.println("Intro columnas");
        columnas = in.nextInt();

        int[][] buscaminas = new int[filas][columnas];

        for (int i = 0; i < buscaminas.length; i++) {
            for (int j = 0; j < buscaminas[i].length; j++) {
                System.out.println("Introdueix els valors");
                buscaminas[i][j] = in.nextInt();

                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (k >= 0 && l >= 0 && k < filas && l < columnas) {
                            if (buscaminas[k][l] == -1 && buscaminas[i][j] != -1) {
                                buscaminas[i][j]++;
                            }
                        }
                    }
                }

                /* if (tocaAltres(filas, columnas, buscaminas)) {
                    buscaminas[filas][columnas] = -1;
                    buscaminas[i][j]++;
                }*/
            }

        }

        mostra(in, buscaminas);

    }

    public static void mostra(Scanner in, int[][] buscaminas) {

        for (int i = 0; i < buscaminas.length; i++) {
            for (int j = 0; j < buscaminas[i].length; j++) {
                System.out.print(buscaminas[i][j] + "  ");
            }
            System.out.println("");
        }

    }

    /*public static boolean tocaAltres(int filas, int columnas, int[][] buscaminas) {
        if ((buscaminas[filas - 1][columnas - 1] == -1)
                || (buscaminas[filas - 1][columnas] == -1) || (buscaminas[filas - 1][columnas + 1] == -1)
                || (buscaminas[filas][columnas - 1] == -1) || (buscaminas[filas][columnas + 1] == -1)
                || (buscaminas[filas + 1][columnas - 1] == -1) || (buscaminas[filas + 1][columnas] == -1)
                || (buscaminas[filas + 1][columnas + 1] == -1)) {
            return false;
        }
        return true;
    }*/
}
