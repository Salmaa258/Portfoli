package Funcions2;

import java.util.Scanner;

class ordenSeleccion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        int[] numeros = new int[5];
        System.out.println("llenando arreglo");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("digite dato entero numero:-- " + i);
            numeros[i] = sc.nextInt();
        }

        System.out.println("el orden original:....");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + " : " + numeros[i]);
        }

        System.out.println("ordenando por seleccion");

        for (int i = 0; i < numeros.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[minimo]) {
                    minimo = j;
                }
            }
            temp = numeros[i];
            numeros[i] = numeros[minimo];
            numeros[minimo] = temp;

        }
        System.out.println("orden correcto:...");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + " : " + numeros[i]);
        }
    }
}
