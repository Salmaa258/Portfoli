package Bloc3Problems;

import java.util.Scanner;

public class Exercici212 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean palindrom = true;
        int i = 0, j;
        System.out.println("Escriu una frase");
        String cadena = in.nextLine();

        int longitud = cadena.length();
        j = longitud -1 ;
        while((i < j) && (palindrom == true)){
            if (cadena.charAt(i) != cadena.charAt(j)){
                palindrom = false;
            }
            i++;
            j--;
        }
        

        if (palindrom) {
            System.out.println("es palindrom");
        } else {
            System.out.println("no es palindrom");
        }

    }

}
