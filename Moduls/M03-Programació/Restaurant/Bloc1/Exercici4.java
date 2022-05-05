
package Bloc1;

import java.util.Scanner;


public class Exercici4 {
    
    public static final double IVA = 0.05;
    public static final double DESCOMPTE = 0.05;
    
    
    public static void main(String[] args) {
        Scanner inNum = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
      
        float diners, totalDiners = 0;
        double preuFidel;
        String siono = "";
        
        do {
       
            System.out.println("Introdueix un preu");
            diners = inNum.nextFloat();
            totalDiners = totalDiners + diners;
            
           }while (diners != 0);  
            
        System.out.println("La consumició és de " + totalDiners);
        System.out.println("És un client fidel ? (S/N)");
        siono = inStr.nextLine();
            
            if ( siono.equals("s")){
                preuFidel = totalDiners * (1 - DESCOMPTE);
                System.out.printf("Per ser client fidel el preu és %.2f",preuFidel);
                System.out.printf("\nEl preu amb IVA és %.2f", (preuFidel * (1 + IVA)));
            } else {
                System.out.printf("\nEl preu amb IVA és %.2f", (totalDiners * (1 + IVA)));
        }
     }
    
}
