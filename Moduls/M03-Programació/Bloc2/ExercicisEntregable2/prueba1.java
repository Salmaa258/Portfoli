package ExercicisEntregable2;
import java.util.*;
public class prueba1 {

    public static void main(String[] args) {
       // Valores que tiene el array A desordenado.
        Scanner tecla = new Scanner(System.in);
        Scanner key = new Scanner(System.in);
        int tam;
        System.out.println("ingrese tamaño");
        tam = tecla.nextInt();
        String[] A= new String[tam]; 
        for(int i=0; i<A.length; i++) 
        {
            System.out.println("ingrese texto: "+i);
            A[i] = key.nextLine();
        }
       
        // Imprimimos el array A desordenado. 
        System.out.println("array A desordenado: "); 
        for(int i=0; i<A.length; i++) 
        {System.out.println( " A[" + i + "] = " + A[i] ); }
       
        // Inicio del metodo de ordenamiento de la Burbuja
        String aux; 
        for(int i=1; i<=A.length; i++) {  
            for(int j=0; j<A.length-i; j++) { 
                if( A[j].compareTo( A[j+1] ) > 0 ) { 
                    aux   = A[j]; 
                    A[j]  = A[j+1]; 
                    A[j+1]= aux; 
                }    
            } 
        }
        // Fin del metodo de ordenamiento de la Burbuja
     
        // Imprimimos el array A ordenado. 
        System.out.println("\n array A ordenado: "); 
        for(int i=0; i<A.length; i++) 
        {System.out.println( " A[" + i + "] = " + A[i] ); }
    }
}