package FuncionsExercicis;

import java.util.Scanner;

public class Ex5_Matrius {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        menu(in);

    }

    public static void menu(Scanner in) {

        int opcio;
        boolean sortir = false;

        do {

            System.out.print("1- Manual | ");
            System.out.print("2- Random | ");
            System.out.println("3- Sortir ");

            System.out.println("Intro opcio");
            opcio = in.nextInt();
            
            

            switch (opcio) {
                case 1:
                    demanaMatriu(in);
                    break;
                case 2:
                    generaMatriu(in);
                    break;
                case 3:
                    sortir = true;
                    break;
            }
        } while (sortir == false);

    }

    public static void mostraMatriu(Scanner in, int[][] matriu) {

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + "  ");
            }
            System.out.println("");
        }

    }

    public static void demanaMatriu(Scanner in) {
        int filas;
        int columnas;

        System.out.println("Intro filas");
        filas = in.nextInt();

        System.out.println("Intro columnas");
        columnas = in.nextInt();

        int[][] matriu = new int[filas][columnas];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.println("Introdueix els valors ");
                matriu[i][j] = in.nextInt();

            }

        }
        mostraMatriu(in, matriu);
    }

    public static void generaMatriu(Scanner in) {
        int filas;
        int columnas;
        int max;
        int min;

        System.out.println("Intro filas");
        filas = in.nextInt();

        System.out.println("Intro columnas");
        columnas = in.nextInt();

        System.out.println("Intro valor max");
        max = in.nextInt();

        System.out.println("Intro valor min");
        min = in.nextInt();

        int[][] matriu = new int[filas][columnas];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {

                matriu[i][j] = (int) (Math.random() * (max - min)) + min;

            }

        }
        mostraMatriu(in, matriu);

    }

}
