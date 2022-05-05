
package Bloc3Problems;

import static Bloc3Problems.ejemplo.eliminaEspais;
import java.util.Scanner;


public class Exercici23 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Escriu un correu");
        String cadena = in.nextLine();

        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                cadena = cadena.substring(0, i);
            }
            i = i + 1;
        }
       

    

    }

}
    