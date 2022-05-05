package FuncionsExercicis;

import java.util.Scanner;

public class Ex1_Calculadora {

    public static void main(String[] args) {

        calculadora();

    }

    public static void calculadora() {
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);

        System.out.println("Introdueix un primer numero");
        int num1 = in.nextInt();

        System.out.println("Introdueix un segon numero");
        int num2 = in.nextInt();

        int suma, resta, multi, divi;

        System.out.println("Introdueix si vols sumar[s], restar[r], dividir[d] "
                + "o mutlipliacar[m]");
        String cosa = inStr.nextLine();

        if (null != cosa) switch (cosa) {
            case "s":
                suma = num1 + num2;
                System.out.println("La suma del valor " + num1 + " mes la suma del "
                        + "valor " + num2 + " es: " + suma);
                break;
            case "r":
                resta = num1 - num2;
                System.out.println("La resta del valor " + num1 + " menys el "
                        + "valor " + num2 + " es: " + resta);
                break;
            case "d":
                divi = num1 / num2;
                System.out.println("La divisió del valor " + num1 + " i la del "
                        + "valor " + num2 + " es: " + divi);
                break;
            case "m":
                multi = num1 * num2;
                System.out.println("La multiplicació del valor " + num1 + " per la del "
                        + "valor " + num2 + " es: " + multi);
                break;
            default:
                break;
        }

    }
    
    

}
