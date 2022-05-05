
package FuncionsExercicis;

import java.util.Scanner;


public class Ex4_Menu {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        menu();
    
    }
    
    public static void menu() {
        Scanner in = new Scanner(System.in);
        
        int opcio;
        boolean sortir = false;
        
        do {
            System.out.println("Selecciona una opció");
            System.out.println("Menú d'opcions");
            System.out.println("1. Ex1_Calculadora");
            System.out.println("2. Ex2_Figures2D");
            System.out.println("3. Ex3_Figures3D");
            System.out.println("4. Sortir");
            
            System.out.println("Introdueix una opció");
            opcio = in.nextInt();
            switch (opcio){
                case 1:
                    System.out.println("Opcio : Ex1_Calculadora");
                    
                    break;
                case 2:
                    System.out.println("Opcio : Ex2_Figures2D");
                    
                    break;
                case 3:
                    System.out.println("Opcio : Ex3_Figures3D");
                    
                    break;
                case 4:
                    System.out.println("Opcio : Sortir");
                    sortir = true; 
                    break;                
                default:
                    System.out.println("Opció no vàlida");
            }
            
        } while ( sortir == false );
  
        
    }
}
