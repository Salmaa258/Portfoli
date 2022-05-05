package Bloc3Problems;

import java.util.Scanner;


public class Exercici18 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont = 0;
        
        System.out.println("Escriu una frase");
        String cadena = in.nextLine();
        
        System.out.println("Escriu una lletra");
        char lletra = in.nextLine().charAt(0);
        
        for (int i = 0 ; i < cadena.length() ; i++){
            if (cadena.charAt(i) == lletra){
                cont++;
            }
        }
        System.out.println("Hi ha " + cont + " lletres " + lletra);

    }
}