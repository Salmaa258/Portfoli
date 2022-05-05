package Bloc1;

import java.util.Scanner;

public class Exercici7 {

    public static void main(String[] args) {

        Scanner inNum = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);

        System.out.println("Introdueix un producte");
        String producte1 = inStr.nextLine();
        System.out.println("Introdueix un preu per al primer producte");
        int preu1 = inNum.nextInt();

        System.out.println("Introdueix un segon producte");
        String producte2 = inStr.nextLine();
        System.out.println("Introdueix un preu per al segon producte");
        int preu2 = inNum.nextInt();

        System.out.println("Introdueix un tercer producte");
        String producte3 = inStr.nextLine();
        System.out.println("Introdueix un preu per al tercer producte");
        int preu3 = inNum.nextInt();

        System.out.println("Introdueix tots els productes demanats");
        String productesTotal = inStr.nextLine();

        productesTotal = productesTotal + " ";
        String producte = "";
        int cont = 0;
        for (int i = 0; i < productesTotal.length(); i++) {
            if (productesTotal.charAt(i) != ' ') {
                producte = producte + productesTotal.charAt(i);
            } else {
                if (producte.equals(producte1)) {
                    cont = cont + preu1;
                    System.out.println("Producte: " + producte1 + 
                            " >> " + preu1);
                } else if (producte.equals(producte2)) {
                    cont = cont + preu2;
                    System.out.println("Producte: " + producte2 + 
                            " >> " + preu2);
                } else if (producte.equals(producte3)) {
                    cont = cont + preu3;
                    System.out.println("Producte: " + producte3 + 
                            " >> " + preu3);
                  
                }
                producte = "";
                
            }
        }

        
        
        
        System.out.println(producte1 + " " + preu1);
        System.out.println(producte2 + " " + preu2);
        System.out.println(producte3 + " " + preu3);

        int total = preu1 + preu2 + preu3;
        System.out.println("Total: " + total);

    }

}
