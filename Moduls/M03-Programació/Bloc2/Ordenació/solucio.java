
package Ordenació;
import java.util.Scanner;
//import jdk.nashorn.internal.objects.NativeRegExp;

public class solucio {

    public static void main(String[] args) {

        boolean sortir = false;
        Scanner in = new Scanner(System.in);
        int numElements = 0;
        do {
            System.out.println("Numero d'elements del vector:");
            if (in.hasNextInt()) {
                numElements = in.nextInt();
                sortir = true;
            }
            in.nextLine();
        } while (numElements == 0);
        int[] vector = generaVector(numElements);
        mostraVector(vector);
        boolean salir = false;
        System.out.println("\n1: Ordenar per selecció\n2: Ordenar per bombolla");
        while (salir == false) {
            switch (in.nextInt()) {
                case 1:
                    System.out.println("seleccio-->");
                    salir = true;
                    ordenaSeleccio(vector);
                    break;
                case 2:
                    System.out.println("bombolla-->");
                    salir = true;
                    ordenaBombolla(vector);
                    break;
                default:
                    System.out.println("Selecciona Bé!!");
                    break;
            }
        }
        System.out.println("");
        mostraVector(vector);
    }

    static void ordenaBombolla(int[] vector) {
        int comptadorPassades = 0;
        // Fer ordenació
        for (int i = 0; i < vector.length - 1; ++i) {
            for (int j = 0; j < vector.length - 1 - i; ++j) {
                comptadorPassades++;
                if (vector[j] > vector[j + 1]) {
                    // Intercanviem posicions
                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
    }

    public static void ordenaSeleccio(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                if (vector[i] < vector[j]) {
                    int aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    }

    public static void mostraVector(int[] vector) {
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (i == vector.length - 1) {
                System.out.print("[" + i + "]" + vector[i] + ".\n");
            } else {
                System.out.print("[" + i + "]" + vector[i] + " , ");
            }
            if (cont % 10 == 0 && i != 0) {
                System.out.println("");
            }
            cont++;
        }
    }

    public static int[] generaVector(int numElements) {
        int[] vector = new int[numElements];
        int cont = 0;
        for (int i = numElements; i > 0; i--) {
            vector[cont] = i;
            cont++;
        }
        return vector;
    }

}
