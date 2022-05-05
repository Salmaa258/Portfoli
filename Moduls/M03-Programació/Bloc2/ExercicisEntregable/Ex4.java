package ExercicisEntregable;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont = 0;
        int numeroos = in.nextInt();
        int[] primers = new int[numeroos];
        int num = 2;

        while (cont < numeroos) {
            if (esNombrePrimer(num)) {
                primers[cont] = num;
                cont++;
            }
            num++;
        }

        mostrarVector(primers);
    }

    public static boolean esNombrePrimer(int nombre) {
        int contador = 2;
        boolean esPrimer = true;
        while ((esPrimer) && (contador != nombre)) {
            if (nombre % contador == 0) {
                esPrimer = false;
            }
            contador++;
        }
        return esPrimer;
    }

    public static void mostrarVector(int[] primers) {
        int cont = 9;
        int i;
        for (i = 0; i < primers.length; i++) {
            
            if (i == primers.length -1) {
                System.out.println(primers[i] + ". ");
            } else if (cont > 0){
                System.out.print(primers[i] + ", ");
                cont--;
            } else{
                System.out.println(primers[i] + ", ");
                cont = 9;
            
        }
        
    }
    }
}
