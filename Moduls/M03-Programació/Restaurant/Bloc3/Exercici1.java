package Bloc3;

import java.util.Scanner;

public class Exercici1 {

    private static final int Mes = 3;
    private static final int taula = 5;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double[][] compte = new double[Mes][taula];

        compte[0][0] = 10.25;
        compte[0][1] = 27.32;
        compte[0][2] = 0;
        compte[1][0] = 5.25;
        compte[1][1] = 0;
        compte[2][0] = 7.25;
        compte[2][1] = 18;
        compte[2][2] = 13;
        compte[2][3] = 0;

        // Ingressat cada dia
        double sumaDia;
        for (int i = 0; i < taula; i++) {
            sumaDia = 0;
            for (int j = 0; compte[i][j] > 0; j++) {
                sumaDia += compte[i][j];
            }
            System.out.println("Suma dia " + i + ": " + sumaDia);
        }

        // Dia de més ingressos
        int diaMaxIngres = 0;
        for (int i = 0; i < taula; i++) {
            sumaDia = 0;
            for (int j = 0; compte[i][j] > 0; j++) {
                sumaDia += compte[i][j];
            }
            if (i == 0) {
                diaMaxIngres = i;
            } else {
                if (sumaDia > diaMaxIngres) {
                    diaMaxIngres = i;
                }
            }
        }
        System.out.println("Dia de max ingrès: " + diaMaxIngres);

        // Dia i taula que més ha pagat
        diaMaxIngres = 0;
        double MaxIngres = 0;
        for (int i = 0; i < taula; i++) {
            for (int j = 0; compte[i][j] > 0; j++) {
                if ((i == 0) && (j == 0)) {
                    diaMaxIngres = 0;
                    MaxIngres = compte[0][0];
                } else {
                    if (compte[i][j] > MaxIngres) {
                        diaMaxIngres = i;
                        MaxIngres = compte[i][j];
                    }
                }

            }
        }
        System.out.println("Dia de la taula Max: " + diaMaxIngres);
        System.out.println("Taula Max: " + MaxIngres);

        // Dia que has servit més taules
        int diaMaxTaules = 0, taulesMax = 0, taules = 0;
        for (int i = 0; i < taula; i++) {
            for (int j = 0; compte[i][j] > 0; j++) {
                taules = j;
            }
            if (i == 0) {
                taulesMax = taules;
                diaMaxTaules = 0;
            } else {
                if (taules > taulesMax) {
                    taulesMax = taules;
                    diaMaxTaules = i;
                }
            }
        }
        System.out.println("Dia de max taules: " + diaMaxTaules);

    }

}
