package CercaBinaria;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = {20, 45, 67, 27, 89, 84, 65, 21, 44};

        //System.out.println("Intro numero que vols buscar");
        //int buscar = in.nextInt();
        int buscar = 44;

        Arrays.sort(numeros);

        if (Arrays.binarySearch(numeros, buscar) > 0) {
            System.out.println("si esta");
        } else {
            System.out.println("no esta");
        }

        //mostrar array ordenado
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Busqueda binaria: ");
        int element = 44;
        binari(numeros, element);

        System.out.println("");
        System.out.println("");
        
        System.out.println("Busqueda binaria 2: ");
        binari2(numeros, buscar);
        
    }

    public static int binari(int[] numeros, int element){
        
        int principi = 0;
        int fi = numeros.length-1;
        
        int pos = -1;
        
        while (principi <= fi){
            int mitad = (principi + fi) / 2;
            if (element == numeros[mitad]){
                pos = mitad;
                break;
            } else if (element < numeros[mitad]){
                fi = mitad -1;
            } else if (element > numeros[mitad]){
                principi = mitad +1;
            }
        }
        return pos;
        
        
    }
    
    public static boolean binari2(int[] numeros, int buscar) {
       
        int longitud = numeros.length;  
        int mitad = longitud / 2;        

        System.out.println("Array: " + Arrays.toString(numeros));
        System.out.println("longitud: " + longitud);
        System.out.println("mitad: " + mitad);
       

        if (numeros[mitad] == buscar) {
            return true;
        } else if (longitud == 1) {
            return false;
        } else if (numeros[mitad] > buscar) {
            return binari2(Arrays.copyOfRange(numeros, 0, mitad), buscar);
        } else {
            return binari2(Arrays.copyOfRange(numeros, mitad + 1, longitud), buscar);
        }

    }

    
    
    
    
    
    
    
    
    
}
