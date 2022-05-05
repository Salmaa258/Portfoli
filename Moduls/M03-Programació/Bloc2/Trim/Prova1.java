package Trim;

import java.util.Scanner;

public class Prova1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sCadena = "    Esto Es Una Cadena     ";
        System.out.println(sCadena.trim());  //elimina los espacios en blanco que hay tanto delante del string como detrás.
    }
}
