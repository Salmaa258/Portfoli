package Bloc3Problems;

import java.util.Scanner;

public class Exercici9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aprovats = 0, suspesos = 0, suficient = 0,
                be = 0, notable = 0, excelent = 0;
        float nota = 0;

        /* 
        for (float i = nota; nota <= 10; i++) {
            System.out.println("Introdueix una nota");
            nota = in.nextFloat();
            cont = cont + 1;
            if (nota >= 5) {
                aprovats = aprovats + 1;
                if (nota >=5 && nota < 6) {
                 suficient = suficient + 1;
                } else if (nota > 6 && nota < 7) {
                 be = be + 1;
                } else if (nota >= 7 && nota < 9) {
                 notable = notable + 1;
                } else if (nota >= 9 && nota <= 10) {
                 excelent = excelent + 1; 
                }
            } else {
                suspesos = suspesos + 1;
            }
            if (cont >= 10) {
                System.out.println("Aprovats: " + aprovats
                        + ", suspesos: " + suspesos);
                System.out.println("Aprovats amb suficient: " + suficient
                    + ", amb be: " + be + ", amb notale: " + notable
                    + ", amb excelent: " + excelent);
            } else {
                
            }
            }
           /*/
        for (int i = 0; i < 10; i++) {
            System.out.println("Introdueix una nota");
            nota = in.nextInt();

            if (nota >= 0 && nota <= 10) {
                if (nota < 5) {
                    suspesos++;
                } else {
                    aprovats++;
                    if (nota < 6) {
                        suficient++;
                    } else if (nota < 7) {
                        be++;
                    } else if (nota < 9) {
                        notable++;
                    } else {
                        excelent++;
                    }
                }

            } else {
                System.out.println("nota no valida");
                i--;
            }

        }
        System.out.println("Aprovats: " + aprovats
                + ", suspesos: " + suspesos);
        System.out.println("Aprovats amb suficient: " + suficient
                + ", amb be: " + be + ", amb notale: " + notable
                + ", amb excelent: " + excelent);
    }
}
