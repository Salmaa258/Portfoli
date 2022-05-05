package Funcions2;

import java.util.Scanner;

public class Ex2_TaulesMultiplicar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantes taules de multiplicar vols mostrar?");
        int numTaules = in.nextInt();

        muntarLiniaTaulaMultiplicar(numTaules);
        

    }

    public static void muntarLiniaTaulaMultiplicar(int numTaules) {
        int i, j, resultat;
        
        int numMin = 0;
        int numMax = 0;
       
        for (i = 1; i <=10; i++) {
            for (j = 1; j <=numTaules; j++) {   
                resultat = i * j;
               
                System.out.print(j + " x " + i + " = " + resultat + "\t");
                
                if (numTaules > 4){
                    if (j == 4){
                        System.out.println("");
                    }
                } 
                
                
            }
            System.out.println(); 
        }

    }

    public static void muntarLiniaPantalla(int i, int j, int resultat) {
        
        
        
        
    }

    public static void mostrarBlocPantalla() {

    }

}
