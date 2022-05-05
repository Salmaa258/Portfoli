package Split;

import java.util.Arrays;
import java.util.Scanner;

public class Prova1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Prova 1");
        String cadena = "Hola|Stackoverflow|en|español";
        String[] parts = cadena.split("\\|");
        System.out.println(Arrays.asList(parts));

        
        
        System.out.println("");
        System.out.print("Prova 2");
        String sCiudades = "#01avila#02madrid#03toledo#04santander";
        String[] items = sCiudades.split("#0[0-9]");

        for (String item : items) {
            System.out.println(item);
        }

        
        
        System.out.println("");
        System.out.println("Prova 3");
        String data = "1,2,3,,5,6,,";
        String[] split = data.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        System.out.println("Done");
    }
}
