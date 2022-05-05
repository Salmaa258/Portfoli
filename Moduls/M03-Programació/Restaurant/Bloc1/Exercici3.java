
package Bloc1;

import java.util.Scanner;


public class Exercici3 {
    
    public static final String USUARI = "salma";
    public static final String PASSWORD = "123";
    public static final double IVA = 0.05;
    public static final double DESCOMPTE = 0.05;
   
    public static void main(String[] args) {

        Login();
        
    }
    
    public static void Login(){
        Scanner in = new Scanner(System.in);
        boolean ok = false;
        String user, pass;
        int intents = 0;
        
        
        while ((ok == false) && (intents < 3)){
            System.out.println("Introdueix l'usuari");
            user = in.nextLine();
            System.out.println("Introdueix la contrasenya");
            pass = in.nextLine();
            
            if ((user.equals(USUARI)) && pass.equals(PASSWORD)){
                System.out.println("ok, benvingut/da " + user);
                ok = true;
                
                MenuOpcions();
                
            } else {
                intents ++;
                System.out.println("Error");
                System.out.println("Portes " + intents + " intents");
                if (intents == 3){
                    System.out.println("Contacta amb l'administrador");
                }
            }
        }
        
    }
    
    
    public static void FeselCompte(){
        
        Scanner inNum = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
      
        float diners, totalDiners = 0;
        double preuFidel;
        String siono = "";
        
        do {
       
            System.out.println("Introdueix un preu");
            diners = inNum.nextFloat();
            totalDiners = totalDiners + diners;
            
           }while (diners != 0);  
            
        System.out.println("La consumició és de " + totalDiners);
        System.out.println("És un client fidel ? (S/N)");
        siono = inStr.nextLine();
            
            if ( siono.equals("s")){
                preuFidel = totalDiners * (1 - DESCOMPTE);
                System.out.printf("Per ser client fidel el preu és %.2f",preuFidel);
                System.out.printf("\nEl preu amb IVA és %.2f", (preuFidel * (1 + IVA)));
            } else {
                System.out.printf("\nEl preu amb IVA és %.2f", (totalDiners * (1 + IVA)));
        }
     }
        

    public static void MenuOpcions(){
        /*Menu d'opcions/*/
        Scanner intro = new Scanner(System.in);
        int opcio;
        boolean  sortir = false;
        
        do {
            System.out.println("\nSelecciona una opció...");
            System.out.println("Menú d'opcions");
            System.out.println("1. Reserva taula");
            System.out.println("2. Carta");
            System.out.println("3. Fes el compte");
            System.out.println("4. Pla \"Clients Fidels\"");
            System.out.println("5. Receptari");
            System.out.println("6. Inventari cuina");
            System.out.println("7. Sortir");
            
            System.out.println("Introdueix una opció");
            opcio = intro.nextInt();
            switch (opcio){
                case 1:
                    System.out.println("Opcio : Reserva taula");
                    break;
                case 2:
                    System.out.println("Opcio : Carta");
                    break;
                case 3:
                    FeselCompte();
                    break;
                case 4:
                    System.out.println("Opcio : Pla \"Clients Fidels\"");
                    break;
                case 5:
                    System.out.println("Opcio : Receptari");
                    break;
                case 6:
                    System.out.println("Opcio : Inventari cuina");
                    break;                    
                case 7:
                    System.out.println("Opcio : Sortir");
                    sortir = true; 
                    break; 
                default:
                    System.out.println("Opció no vàlida");
            }
            
        } while ( sortir == false );
        
        
    }
        /*Finalitza Menu d'opcions/*/
    }
    
    
    

