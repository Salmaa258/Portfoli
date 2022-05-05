
package Bloc1;

import java.util.Scanner;

public class Exercici1 {
    public static final String USUARI = "yo";
    public static final String PASSWORD = "siyo";
   
    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);
        boolean ok = false;
        String user, pass;
        int intents = 0;
        
        while ((ok == false) && (intents < 3)) {
            System.out.println("Introdueix l'usuari");
            user = intro.nextLine();
            System.out.println("Introdueix la contrasenya");
            pass = intro.nextLine();
            
            if ((user.equals(USUARI)) && pass.equals(PASSWORD)){
                System.out.println("ok, benvingut/da " + user);
                ok = true;
                
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
    
}
