
package Bloc1;

import java.util.Scanner;


public class Exercici11 {
    
      public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
 
        String contrabe = "contra"; 
        String usuaribe = "mlopez";
        int intents = 0;
        
        System.out.println("Introdueix el teu usuari");
        String usuari = in.nextLine();
        
        

        while (usuari.equals(usuaribe) && (intents < 3)){
            System.out.println("Intro contra");
            String contra = in.nextLine();
            if (!contra.equals(contrabe)){
                System.out.println("error, torna ha intentar-ho");
                intents++;
                if (intents == 3){
                    System.out.println("ja s'han acabat els intents, "
                            + "portes " + intents + " intents");
                }
            }else{
                System.out.println("benvingut " + usuaribe);
            }
        
        }
        }
    
}
