package ExercicisEntregable2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String numero = in.nextLine();
        int numero2 = Integer.parseInt(numero);

        String[] paisos = new String[numero2];

        omple(paisos, in);

        Arrays.sort(paisos);

        System.out.println("Països ordenats:");
        for (int i = 0; i < paisos.length; i++) {
            System.out.println(paisos[i]);
        }

    }

    public static void omple(String[] paisos, Scanner in) {
        for (int i = 0; i < paisos.length; i++) {
            paisos[i] = in.nextLine();
        }
    }

}
