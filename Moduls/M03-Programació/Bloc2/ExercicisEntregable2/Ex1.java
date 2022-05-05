package ExercicisEntregable2;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String numero = in.nextLine();
        int numero2 = Integer.parseInt (numero);

        String[] paisos = new String[numero2];

        omple(paisos, in);
        ordenaBombolla(paisos);

    }

    public static void omple(String[] paisos, Scanner in) {
        for (int i = 0; i < paisos.length; i++) {
            paisos[i] = in.nextLine();
        }
    }

    public static void ordenaBombolla(String[] paisos) {
        String aux;
        for (int i = 1; i <= paisos.length; i++) {
            for (int j = 0; j < paisos.length - i; j++) {
                if (paisos[j].compareTo(paisos[j + 1]) > 0) {
                    aux = paisos[j];
                    paisos[j] = paisos[j + 1];
                    paisos[j + 1] = aux;
                }
            }
        }

        
        System.out.println("Països ordenats:");
        for (int i = 0; i < paisos.length; i++) {
            System.out.println(paisos[i]);
        }

    }

}
