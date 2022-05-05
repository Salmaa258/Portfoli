
package Bloc4Problems;

import java.util.Scanner;


public class Exercici20 {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
    
        int anys, total = 0;
        String nom;
        
        do {
            System.out.println("Digues un nom");
            nom = inStr.nextLine();
            
            System.out.println("Digues quants anys porta treballant");
            anys = in.nextInt();
            
            if ((anys >= 3) && (anys < 10)){
                System.out.println("Te una bonificacio de 300€");
            } else if ((anys >= 10) && (anys < 15)){
                System.out.println("Te una bonificacio de 400€");
            } else if (anys >= 15){
                System.out.println("Te una bonificacio de 700€");
            }
            
            total+=anys;
            
        } while (!nom.equals("Fi"));
        
        
        
    }
    
    
    
}
