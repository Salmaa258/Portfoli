
package Bloc7;

import java.util.Scanner;

public class Exercici2Main {
 
    public static void main (String[] args){
        
        Scanner in = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);
     
        Exercici2[] biblio = new Exercici2[2];
        
        for (int i = 0; i < biblio.length; i++){
            System.out.println("ISBN: ");
            String ISBN = in.nextLine();
            System.out.println("Titol: ");
            String titol = in.nextLine();
            System.out.println("Autor: ");
            String autor = in.nextLine();
            System.out.println("Editorial: ");
            String editorial = in.nextLine();
            System.out.println("Numero de Llibres: ");
            int numLlibres = inNum.nextInt();
            System.out.println("Preu: ");
            int preu = inNum.nextInt();
            
            biblio[i] = new Exercici2(ISBN, titol, autor, editorial, numLlibres, preu);
            
        }
        
        imprimeixArray(biblio);
        
        
    }    
    
        public static void imprimeixArray(Exercici2[] biblio) {
        System.out.println("Impressió de l'array");
            for (int i = 0; i < biblio.length; i++){
            biblio[i].imprimeix();
            }
        }
        
        public static void demana (Exercici2[] biblio){
            Scanner in = new Scanner(System.in);
            System.out.println("Introdueix el titol del llibre");
            String titol = in.nextLine();
        }
        
    
    
}
