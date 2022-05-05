
package Bloc6;

import java.util.Scanner;


public class split {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String cadena = "Andrew, 18, pero parece de 13, 13, jejeje";
        
        String[] separacion = new String[5];
        
        separacion = cadena.split(",");
        
        for (int i = 0; i < cadena.length() ; i++ ){
            System.out.println(cadena);
        }
        
        
        
        
    }
    
}

