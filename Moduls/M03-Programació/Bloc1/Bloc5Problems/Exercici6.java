
package Bloc5Problems;

import java.util.Scanner;

public class Exercici6 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        int[] num = new int [6];
        
        int igual = 0, menor = 0, minim = 0;
        for (int i = 0 ; i < num.length ; i++){
            System.out.println("Introdueix un numero");
            num [i] = in.nextInt();
            if (num[i] == 25){
                igual++;
            } else if(num[i] < 25){
                menor++;
            }
            if (num[i] > num[i]){
                minim+= num[i];
            }
        }
        
        float suma = 0, mitjana;
        for (int i = 0 ; i < num.length ; i++){
            suma += num[i];
        }
        mitjana = suma / num.length;
        
        System.out.println("Hi ha " + igual + " numeros iguals a 25");
        System.out.println("Hi ha " + menor + " numeros menors a 25");
        System.out.println("La mitjana es: " + mitjana );
        System.out.println("El minim es: " + minim);
        
        
        
    }
}
