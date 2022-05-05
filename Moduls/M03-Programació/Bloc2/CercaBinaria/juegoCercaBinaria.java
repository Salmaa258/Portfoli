package CercaBinaria;

import java.util.Scanner;

public class juegoCercaBinaria {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int numero;
        int valor;
        int contador = 0;
        boolean ganar = false;
        System.out.println("--------------------------------------");
        System.out.println("|         Bienvenido al juego        |");
        System.out.println("--------------------------------------");
        numero = 1 + (int) (Math.random() * 100);
        System.out.println("En estos momentos se ha generado un numero comprendido entre-\n"
                + "1 y 100, que usted debe adivinar");
        System.out.println("--------------------------------------");
        do {//este ciclo es tambien llamado repeat en otros lenguajes
            contador++;
            System.out.print("-Digite el numero ");
            valor = in.nextInt();//capturamos en numero digitado
            if (valor == numero) {
                System.out.println("Felicitaciones, GANASTES con " + contador + " intentos");
                ganar = true;
            } else {
                String temp = "";
                if (numero > valor) {
                    temp = "mayor";
                } else {
                    temp = "menor";
                }
                System.out.println("El numero que intentas adivinar es " + temp + " que " + valor);
            }
        } while (contador < 6 && ganar == false);//cerramos el ciclo 'do'
        //'contador<6' representa el numero de oportunidades del jugador
        if (ganar == false) {
            System.out.println("Lo siento, no has adivinado, el numero era el " + numero);
        }
    }
}
