package Bloc3Problems;

import java.util.Scanner;

public class ejemplo {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        String cadena;
        boolean palindrom = true;
        int i = 0, j;
        System.out.println("Intro cadena");
        cadena = teclat.nextLine();

        cadena = eliminaEspais(cadena);

        int longitud = cadena.length();
        j = longitud - 1;
        while ((i < j) && (palindrom == true)) {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                palindrom = false;
            }
            i++;
            j--;
        }
        System.out.println(cadena + "\n");
    }

    public static String eliminaEspais(String cadena) {

//        System.out.println("La cadena original mesura..." + cadena.length());
//        cadena = cadena.replace(" ", "");
//        System.out.println("La cadena final mesura..." + cadena.length());
//        return cadena;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                cadena = cadena.substring(0, i);
            }
            
        }
       

        return cadena;

    }
}