
package Funcions_ExercicisBàsics;

import java.util.Scanner;


public class Ex2_Paràmetres {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Intro primer numero");
        int num1 = in.nextInt();
        
        System.out.println("Intro segon numero");
        int num2 = in.nextInt();
        
        int suma = 0;
        
        suma = num1+num2;
        
        System.out.println("La suma del primer numero " + num1 + 
                ", mes el segon numero " + num2 + ", es: " + suma);
        
    }
    
    
    
}
