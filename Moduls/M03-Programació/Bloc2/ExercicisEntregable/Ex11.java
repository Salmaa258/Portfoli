package ExercicisEntregable;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String num1, num2, figura;
        
        boolean s = false;

        while (s == false) {

            num1 = in.nextLine();
            
            if (num1.equalsIgnoreCase("s")) {
                s = true;
            } else {
                num2 = in.nextLine();
                figura = in.nextLine();

                switch (figura) {
                    case "+":
                        suma(num1, num2);
                        break;
                    case "-":
                        resta(num1, num2);
                        break;
                    case "x":
                        multiplicacio(num1, num2);
                        break;
                    case "/":
                        divisio(num1, num2);
                        break;
                    default:
                        break;
                }
            }
        }

    }

    public static void suma(String num1, String num2) {

        int a, b, suma;
        a = parseInt(num1);
        b = parseInt(num2);

        suma = a + b;
        System.out.println(num1 + " + " + num2 + " = " + suma);

    }

    public static void resta(String num1, String num2) {

        int a, b, resta;
        a = parseInt(num1);
        b = parseInt(num2);

        resta = a - b;
        System.out.println(num1 + " - " + num2 + " = " + resta);

    }

    public static void multiplicacio(String num1, String num2) {
        
        int a, b, multi;
        
        a = parseInt(num1);
        b = parseInt(num2);

        multi = a * b;
        System.out.println(num1 + " x " + num2 + " = " + multi);

    }
    
    public static void divisio(String num1, String num2) {
        
        int a, b, divi;
        
        a = parseInt(num1);
        b = parseInt(num2);
        
        if ((num2.equals("0")) || (num1.equals("0"))) {
            System.out.println("No es pot dividir per 0.");
        } else {
            divi = a / b;
            System.out.println(num1 + " / " + num2 + " = " + divi);

        }

    }

}
