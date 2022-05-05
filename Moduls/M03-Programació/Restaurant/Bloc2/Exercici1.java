
package Bloc2;

import java.util.Scanner;


public class Exercici1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   
        float[] preu = new float [3];
        float major = 0, economic = 0, mitjana = 0, sumaTotal = 0;    
        for (int i = 0; i < preu.length; i++){
            System.out.println("Introdueix els preus dels comptes");
            preu[i] = in.nextFloat();
            sumaTotal+= preu[i];
            mitjana = sumaTotal / i;
            if (preu[i] > preu[i]){
                major = preu[i];
            }else{
                economic = preu[i];
            }
            
        }
        System.out.println("El preu mes elevat correspon a: " + major);
        System.out.println("El preu mes economic correspon a un total "
                + "de:" + economic);
        System.out.println("La mitjana dels preus del comptes es:" + mitjana);
        System.out.println("L'ingrés total del dia es: " + sumaTotal);
    }
}
