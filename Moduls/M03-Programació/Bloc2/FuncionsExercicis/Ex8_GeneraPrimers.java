package FuncionsExercicis;

import java.util.Scanner;

public class Ex8_GeneraPrimers {
  
    static int[]primers;
    
    public static void main(String[] args) {   
        Scanner in= new Scanner(System.in);
        int cont = 0; 
        primers = new int[100]; 
        int num = 2; 
        
        
        while(cont < 100){            
            if(esNombrePrimer(num)){
                primers[cont]= num;
                cont++; 
            }
            num++;           
        } 
        
        System.out.println("Intro 100 per mostrar els 100 primers");
        mostrarPrimers(in.nextInt()); 
    }
    
    public static boolean esNombrePrimer(int numero){
        int contador = 2;
        boolean esPrimer = true;
        while ((esPrimer) && (contador!=numero)){
          if (numero % contador == 0) 
            esPrimer = false;
            contador++;
        }
        return esPrimer;
    }
    
    public static void mostrarPrimers(int quantitat){
        for(int i = 0; i < quantitat; i++){
            System.out.print(primers[i]+", "); 
        }
    }
}