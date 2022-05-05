package ExercicisEntregable2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //creació de l'array
        int numElements = in.nextInt();

        double[] vector = new double[numElements];

        //declarem els valors del array
        for (int i = 0; i < vector.length; i++) {
            vector[i] = in.nextDouble();
        }

        

        
        
        //cridem la funció d'ordenar per bombolla
        ordenaSeleccio(vector);

    }

    public static void ordenaSeleccio(double[] vector) {
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {

                if (vector[i] < vector[j]) {
                    double aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;

                }
                cont += 1;
            }

        }
        //mostrem el vector ordenat + el total de passades
        for (int i = vector.length -1; i >=0; i--) {
            System.out.println(vector[i] + " ");
        }

        System.out.println("");
        System.out.println("Total passades: " + cont);
    }
}
