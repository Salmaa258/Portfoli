package Bloc4Problems;

import java.util.Scanner;


public class Exercici19 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);  
        double hores = 0, salariEstandard = 30, salariM = 0, 
                salariV = 0, salariN = 0;
        String torn;
        
        for (int i = 0; i < 1; i++){
            System.out.println("Introdueix quantes hores ha treballat");
            hores = in.nextInt();
            System.out.println("Introdueix si ha treballat al mati[M], "
                    + "al vespre[V] o a la nit[N] ");
            torn =  inStr.nextLine();
            
            
            
           
            
            switch (torn) {
                case "M":
                    hores = hores * salariEstandard;
                    salariM = hores * 5;
                    break;
                case "V":
                    hores = hores * salariEstandard;
                    salariV = hores * 1.2;
                    salariV = salariV * 5;
                    break;
                case "N":
                    hores = hores * salariEstandard;
                    salariN = hores * 1.5; 
                    salariN = salariN * 5;
                    break;
                default:
                    break;
            }
            
            
                if (salariM < 700){
                    salariM = salariM / 1.08;
                    System.out.println("El treballador ha treballat pel matí " 
                        + (int)hores + " hores, i el seu salari es: " + salariM);
                } else if (salariM < 1100){
                    salariM = salariM / 1.10;
                    System.out.println("El treballador ha treballat pel matí " 
                        + (int)hores + " hores, i el seu salari es: " + salariM);
                } else if (salariM > 1100){
                    salariM = salariM / 1.12;
                    System.out.println("El treballador ha treballat pel matí " 
                        + (int)hores + " hores, i el seu salari es: " + salariM);
                } else if (salariV < 700){
                    salariV = salariV / 1.08;
                    System.out.println("El treballador ha treballat pel vespre " 
                        + (int)hores + " hores, i el seu salari es: " + salariV);
                } else if (salariV < 1100){
                    salariV = salariV / 1.10;
                    System.out.println("El treballador ha treballat pel vespre " 
                        + (int)hores + " hores, i el seu salari es: " + salariV);
                } else if (salariV > 1100){
                    salariV = salariV / 1.12;
                    System.out.println("El treballador ha treballat pel vespre " 
                        + (int)hores + " hores, i el seu salari es: " + salariV);
                } else if (salariN < 700){
                    salariN = salariN / 1.08;
                    System.out.println("El treballador ha treballat per la nit " 
                        + (int)hores + " hores, i el seu salari es: " + salariN);
                } else if (salariN < 1100){
                    salariN = salariN / 1.10;
                    System.out.println("El treballador ha treballat per la nit " 
                        + (int)hores + " hores, i el seu salari es: " + salariN);
                } else if (salariN > 1100){
                    salariN = salariN / 1.12;
                    System.out.println("El treballador ha treballat per la nit " 
                        + (int)hores + " hores, i el seu salari es: " + salariN);
           
           
        }
                
        
        
        
        
        
    }
    }
    
    
}
