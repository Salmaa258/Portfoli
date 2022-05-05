
package Bloc3Problems;

import java.util.Scanner;


public class Exercici19 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        
        System.out.println("Escriu una frase");
        String cadena = in.nextLine();
        
        for (int i = 0 ; i < cadena.length() ; i++){
            if (cadena.charAt(i) == 'a') {
                cont1++;
            } else if (cadena.charAt(i) == 'e') {
                cont2++;
            } else if (cadena.charAt(i) == 'i') {
                cont3++;
            } else if (cadena.charAt(i) == 'o') {
                cont4++;
            } else if (cadena.charAt(i) == 'u') {
                cont5++;
            } 
        }
        System.out.println("Hi ha " + cont1 + " lletres 'a'" );
        System.out.println("Hi ha " + cont2 + " lletres 'e'" );
        System.out.println("Hi ha " + cont3 + " lletres 'i'" );
        System.out.println("Hi ha " + cont4 + " lletres 'o'" );
        System.out.println("Hi ha " + cont5 + " lletres 'u'" );
        
    
}
}
