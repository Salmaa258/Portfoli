
package Funcions_ExercicisBàsics;

import java.util.Scanner;


public class Ex4_Random {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        System.out.println("Introdueix un primer numero [num_Max]");
        int num1 = in.nextInt();
        
        System.out.println("Introdueix un segon numero [num_Min]");
        int num2 = in.nextInt();
        
        double randomnum = Math.random() * (num1 - num2);
        
        System.out.println("Numero random: " + randomnum);
        
    
    }
    
}
