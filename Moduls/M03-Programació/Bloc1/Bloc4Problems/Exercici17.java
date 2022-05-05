
package Bloc4Problems;

import java.util.Scanner;


public class Exercici17 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     
        int habitants = 0, habitantsPetit = 0, habitantsMitja = 0, 
                habitantsGran = 0, totalHabitants = 0;
        
        for (int i = 0; i < 10 ; i++){
            System.out.println("Introdueix el nombre d'habitants");
            habitants = in.nextInt();
            totalHabitants+= habitants;
            if (habitants < 2000){
                habitantsPetit+=habitants;
            } else if (habitants < 30000){
                habitantsMitja+=habitants;
            } else if (habitants > 30000){
                habitantsGran=habitants;
            }
        }
        
        float percPetita = (float) habitantsPetit / totalHabitants * 100;
        float percMitja = (float) habitantsMitja / totalHabitants * 100;
        float percGran = (float) habitantsGran / totalHabitants * 100;
       
        System.out.println(percPetita);
        System.out.println(percMitja);
        System.out.println(percGran);
    }
    
}
