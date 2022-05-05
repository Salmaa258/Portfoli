package Bloc1;

import java.util.Scanner;

public class Exercici5 {

    public static void main(String[] args) {

        Scanner inNum = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);

        System.out.println("Introdueix el primer producte");
        String producte1 = inStr.nextLine();
        System.out.println("Digues la quantitat mínima");
        int quant1 = inNum.nextInt();

        System.out.println("Introdueix el segon producte");
        String producte2 = inStr.nextLine();
        System.out.println("Digues la quantitat mínima");
        int quant2 = inNum.nextInt();

        System.out.println("Introdueix el tercer producte");
        String producte3 = inStr.nextLine();
        System.out.println("Digues la quantitat mínima");
        int quant3 = inNum.nextInt();

      
        do {
            System.out.println("Introdueix un producte dels seguents: "
                    + "[" + producte1 + ", "+ producte2 + ", " + producte3 + "]");
            String producte = inStr.nextLine();
            if (producte.equals("fi")) break;

            System.out.println("Quants " + producte + " hi ha?");
            int quantProd = inNum.nextInt();

            if (producte.equals(producte1)) {
                if (quantProd > quant1) {
                    int resta = quantProd - quant1;
                    System.out.println("Sobren " + resta + " productes");
                } else {
                    int resta1 = quant1 - quantProd;
                    System.out.println("Falten " + resta1 + " productes");
                }

            } else if (producte.equals(producte2)) {
                if (quantProd > quant2) {
                    int resta = quantProd - quant2;
                    System.out.println("Sobren " + resta + " productes");
                } else {
                    int resta1 = quant2 - quantProd;
                    System.out.println("Falten " + resta1 + " productes");
                }

            } else if (producte.equals(producte3)) {
                if (quantProd > quant3) {
                    int resta = quantProd - quant3;
                    System.out.println("Sobren " + resta + " productes");
                } else {
                    int resta1 = quant3 - quantProd;
                    System.out.println("Falten " + resta1 + " productes");
                }

            }
            

        } while (!producte1.equals("fi"));

    }

}
