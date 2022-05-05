package ExercicisEntregable2;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String numero = in.nextLine();
        int numero2 = Integer.parseInt(numero);

        String[] paisos2 = new String[numero2];

        for (int i = 0; i < paisos2.length; i++) {
            paisos2[i] = in.nextLine();
        }

        String buscar = in.nextLine();

        cercaBinaria(paisos2, buscar);
    }

    public static void cercaBinaria(String[] paisos2, String buscar) {

        int cont = 0;
        int posicio = 0;
        int esquerra = 0;
        int dreta = paisos2.length - 1;

        boolean trobat = false;

        while (esquerra <= dreta && !trobat) {
            posicio = dreta + (esquerra - dreta) / 2;

            if (paisos2[posicio].compareTo(buscar) > 0) {
                dreta = posicio - 1;
                cont++;
            } else if (paisos2[posicio].equals(buscar)) {
                trobat = true;
            } else {
                esquerra = posicio + 1;
                cont++;
            }

        }

        if (trobat) {
            System.out.println("Total passades: " + cont);
            System.out.println("Trobat a la posició " + posicio);
        } else {
            cont--;
            System.out.println("Total passades: " + cont);
            System.out.println("No trobat");
        }
    }
}
