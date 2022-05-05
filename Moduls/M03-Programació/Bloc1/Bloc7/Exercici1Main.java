
package Bloc7;

import java.util.Scanner;

public class Exercici1Main {
    
    public static void main (String[] args){
        
        Scanner in = new Scanner(System.in);
        
        Exercici1[] peli = new Exercici1[5];
        
        for (int i = 0; i < peli.length ; i++){
            System.out.println("Titol: ");
            String titol = in.nextLine();
            System.out.println("Tipus: ");
            String tipus = in.nextLine();
            System.out.println("Director: ");
            String director = in.nextLine();
            
            peli[i] = new Exercici1(titol, tipus, director);
            
        }
        
        imprimeixArray(peli);
        
        
    }
        public static void imprimeixArray(Exercici1[] pelis) {
        System.out.println("Impressió de l'array");
            for (int i = 0; i < pelis.length; i++){
            pelis[i].imprimeix();
            }
            
        }
        
}   
    

