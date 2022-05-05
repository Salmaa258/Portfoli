package Ordenació;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vector = generaVector((int) (Math.random() * (10 - 5) + 5));
        System.out.println("vector desordenat: " + vector[0]);
        mostraVector(vector);

        ordenaSeleccio(vector);
        ordenaBombolla(vector);

    }

    public static int[] generaVector(int numElements) {

        int[] numero = new int[numElements];

        for (int i = 0; i < numero.length; i++) {
            if (i == 0) {
                numero[i] = numElements;
            } else {
                numero[i] = numero[i - 1] - 1;
            }
        }

        return numero;
    }

    public static void mostraVector(int[] vector) {
        System.out.print("Vector ordenat a la inversa: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");

        }
        System.out.println("");
        System.out.println("");
    }

    public static void ordenaSeleccio(int[] vector) {

        for (int i = 0; i < vector.length - 1; i++) {
            int minimo = i;
            int temp;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] < vector[minimo]) {
                    minimo = j;
                }
            }
            temp = vector[i];
            vector[i] = vector[minimo];
            vector[minimo] = temp;

        }
        System.out.print("Vector ordenat per selecció: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
        System.out.println("");

    }

    public static void ordenaBombolla(int[] vector) {
       
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length - 1; j++) {
                int elementoActual = vector[j],
                        elementoSiguiente = vector[j + 1];
                if (elementoActual > elementoSiguiente) {
                    vector[j] = elementoSiguiente;
                    vector[j + 1] = elementoActual;

                }
            }
        System.out.print("Vector ordenat per bombolla: " );
        for (int k = 0; k < vector.length; k++) {
            System.out.print(vector[i] + " ");
        }

    
    
        }
    
    
    }

}
