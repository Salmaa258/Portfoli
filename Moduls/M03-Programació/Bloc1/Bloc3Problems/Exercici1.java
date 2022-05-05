
package Bloc3Problems;

import java.util.Scanner;


public class Exercici1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int piedras, piedraspuestas, piedrasfila = 0;

        System.out.println("Escribe una cantidad de piedras:");
        piedras = in.nextInt();

       /* lados = 1;
        for (int i = lados; piedras >=1; i--) {
            piedras = piedras + lados;
        }
        
        System.out.println(lados);

       cont = 1; 
       while (piedras <= 10) {
           cont = cont + 1;
           piedras = piedras + cont;
           
       }
        System.out.println(cont);

        
       
/*/   
       piedraspuestas = 0;
       while (piedraspuestas <= piedras){
           piedrasfila++;
           piedraspuestas = piedraspuestas + piedrasfila;
       }
        System.out.println("el triangle es de " + (piedrasfila - 1));
        System.out.println("sobren " + ( piedras - (piedraspuestas - piedrasfila) ));
        System.out.println("se usan: " + (piedras -(piedras - (piedraspuestas - piedrasfila)) ));
    }
    
}
