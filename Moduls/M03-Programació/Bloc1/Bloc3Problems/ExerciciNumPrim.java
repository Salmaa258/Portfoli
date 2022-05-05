package Bloc3Problems;

import java.util.Scanner;

public class ExerciciNumPrim {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0, cont = 2, comptaPrimers = 0;
        boolean esPrimer = true;

        /*for (cont = 2; cont < num / 2; cont++){
            
            if (num / 2 == 0){
                System.out.println("no es prim");
            } else {
                System.out.println("es prim");
            }
        }
        
        
        do {  
            
        System.out.println("Digues un num");
        num = in.nextInt();
        
        if (cont < num / 2){
            if (num % 2 == 0){
            System.out.println("el numero no es prim");    
            } else {
                cont++;
            }
        } else {
            System.out.println("el numero es prim");
        }
       
        } while (num < 10);
        /*/
        while (comptaPrimers <= 100) {
            num++;
            cont = 2;
            esPrimer = true;
            while ((cont <= num / 2) && (esPrimer == true)) {
                if (num % cont == 0) {
                    esPrimer = false;
                }
                cont++;
            }

            if (esPrimer == true) {
                comptaPrimers++;
                System.out.println(num);
            }
        }

    }
}
