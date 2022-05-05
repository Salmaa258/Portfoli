
package CercaBinaria;

import java.util.Scanner;

/*Fes un programa que faci una cerca per trobar un valor enter dins d’un array de valors aleatoris.
Fes primer la cerca de forma seqüencial i després amb algoritme de cerca binària (suposant que l’array està ordenat).
Mostra el nombre de passes necessàries en cada cas i el temps que triga a fer cada cerca.
 */
public class solucio {

    static final int TOTALELEMENTS = 5000;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean sortir = false;
        String opcio;
        int[] arrayAleatoris;
        int numBuscar;
        while (!sortir) {
            System.out.println("\n\n\n's'--->Sortir\n''---->Cerca Binària");
            opcio = in.nextLine().toLowerCase();
            if (!opcio.equals("s")) {
                arrayAleatoris = creaArray(TOTALELEMENTS);
                numBuscar = demanaInt(in);
                mostraArray(arrayAleatoris);
                cercaSequencial(arrayAleatoris, numBuscar);
                cercaBinaria(arrayAleatoris, numBuscar);
            } else {
                sortir = true;
            }
        }
    }

    public static void mostraArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 10 == 0) {
                System.out.println("[" + i + "]" + array[i] + "  ");
            } else {
                System.out.print("[" + i + "]" + array[i] + "  ");
            }
        }
        System.out.println("");
    }

    public static void cercaBinaria(int[] arrayAleatoris, int numBuscar) {
        System.out.println("\n/////////Binaria////////\n");
        long tempsInicial = System.currentTimeMillis();
        int comptadorPassades = 0;
        int posicio = 0;
        int indexEsquerra = 0;
        int indexDret = arrayAleatoris.length - 1;
        boolean trobat = false;
        while (indexEsquerra <= indexDret && !trobat) {
            posicio = (indexEsquerra + indexDret) / 2;
            if (arrayAleatoris[posicio] == numBuscar) {
                trobat = true;
            } else if (arrayAleatoris[posicio] < numBuscar) {
                indexEsquerra = posicio + 1;
            } else if (arrayAleatoris[posicio] > numBuscar) {
                indexDret = posicio - 1;
            }
            comptadorPassades++;
        }

        if (trobat) {
            // Temps final
            long tempsFinal = System.currentTimeMillis();
            System.out.println("Total passades: " + comptadorPassades);
            System.out.println("Temps total (ms): " + (tempsFinal - tempsInicial));
            System.out.println("L'hem trobat a la posició " + posicio);
        } else {
            System.out.println("NO l'hem trobat a l'array");
        }
    }

    public static void cercaSequencial(int[] arrayAleatoris, int numBuscar) {
        System.out.println("\n/////////Sequencial////////\n");
        boolean trobat = false;
        long tempsInicial = System.currentTimeMillis();
        int comptadorPassades = 0;
        int posicio = 0;
        for (int i = 0; i < arrayAleatoris.length && !trobat; i++) {
            if (numBuscar == arrayAleatoris[i]) {
                trobat = true;
                posicio = i;
            }
            comptadorPassades++;
        }
        if (trobat) {
            long tempsFinal = System.currentTimeMillis();
            System.out.println("Total passades: " + comptadorPassades);
            System.out.println("Temps total (ms): " + (tempsFinal - tempsInicial));
            System.out.println("L'hem trobat a la posició " + posicio);
        } else {
            System.out.println("NO l'hem trobat a l'array");
        }
    }

    public static int demanaInt(Scanner in) {
        int n = 0;
        boolean correcte = false;

        do {
            System.out.print("Introdueix un nombre enter: ");
            if (!in.hasNextInt()) {
                System.out.println("No es un enter");
            } else {
                correcte = true;
                n = in.nextInt();
            }
            in.nextLine();
        } while (!correcte);
        return n;
    }

    public static int[] creaArray(int totalElements) {
        int[] array = new int[totalElements];
        for (int i = 0; i < totalElements; i++) {
            array[i] = (int) (Math.random() * totalElements);
        }
        return ordenaBombolla(array);
    }

    public static int[] ordenaBombolla(int[] array) {
        int aux;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        return array;
    }
}

