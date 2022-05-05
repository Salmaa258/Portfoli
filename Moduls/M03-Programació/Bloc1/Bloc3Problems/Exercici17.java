
package Bloc3Problems;

import java.util.Scanner;


public class Exercici17 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont = 0;
        
        System.out.println("Escriu una frase");
        String cadena = in.nextLine();
        
        for (int i = 0 ; i < cadena.length() ; i++){
            if (cadena.charAt(i) == 'a'){
                cont++;
            }
        }
        System.out.println("Hi ha " + cont + " lletres 'a'");

    }
}
