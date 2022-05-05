
package Bloc2Problems;

import java.util.Scanner;


public class ExerciciBisiesto {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int año;

        System.out.println("introdueix un any");
        año = in.nextInt();
      /*
        if (año % 4 == 0) {
            System.out.println(año + " es un año bisiesto");
        } else if (año % 100 == 0) {
            System.out.println(año + " no es año bisiesto");
        } else if (año % 400 == 0){
            System.out.println(año + " es un año bisiesto");
        }
         
        
      
      if (año % 100 == 0) {
          System.out.println(año + " no es un año bisiesto");
      } else if (año % 4 == 0) {
          System.out.println(año + " es un año bisiesto");
      } else {
          System.out.println(año + " es un año bisiesto");
        
     
       }


      if (año % 4 == 0) {
          if (año % 400 == 0){
              System.out.println("si es");
          } else if (año % 100 == 0) {
              System.out.println("no es");
          }
      } else if (año % 400 == 0) {
          System.out.println("no es");
      } else {
          System.out.println("si es");
      }
      */
      
      if (año % 100 == 0){
          if (año % 400 == 0){
              System.out.println("es un año bisiesto");
          } else {
              System.out.println("no es un año bisiesto");
          }
      } else if (año % 4 == 0){
          if (año % 100 == 0){
              System.out.println("no es un año bisiesto");
          } else{
              System.out.println("es un año bisiesto");
          }
      } else {
          System.out.println("no es un año bisiesto");
      }
      
      }
    
}
