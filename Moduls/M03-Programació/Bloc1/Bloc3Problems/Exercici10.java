
package Bloc3Problems;

import java.util.Scanner;


public class Exercici10 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aprovats = 0, suspesos = 0, suficient = 0,
                be = 0, notable = 0, excelent = 0, mitjanasus;
        float nota = 0;
    
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
   } 
}
