
package Bloc3Problems;

import java.util.Scanner;


public class Exercici16 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   
        System.out.println("Escriu una frase");
        String cadena = in.nextLine();
        
        for (int i = cadena.length()-1 ; i >= 0 ; i--){
            System.out.println(cadena.charAt(i));
        }
        System.out.println("");
    }
    
}
