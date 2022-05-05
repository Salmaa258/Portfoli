
package Bloc2Problems;

import java.util.Scanner;


public class Exercici7 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Escriu un valor:");
        num = in.nextInt();

        if ((num % 2 == 0) && (num % 3 == 0)) {
            System.out.println("El nombre es multiple de 2 i de 3");
          } else if (num % 3 == 0) {
            System.out.println("El nombre es multiple de 3");
          } else if (num % 2 == 0) {
              System.out.println("El nombre es multiple de 2");
          } else {
              System.out.println("El nombre no es multiple ni de 2 ni de 3");
          }
        
    }
}
