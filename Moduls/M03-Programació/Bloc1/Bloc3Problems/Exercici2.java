package Bloc3Problems;

import java.util.Scanner;

public class Exercici2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hores, horaPagada, horesExtra, diners, dinersF, cont = 1;

        System.out.println("A quant pagues la hora?");
        horaPagada = in.nextInt();

        
        
        do {
            System.out.println("Quantes hores ha treballat el "
                    + "treballador a la setmana " + cont + "?");
            hores = in.nextInt();
            cont++;
            
            if (hores >= 40){
                horaPagada = horaPagada * 24;
                horaPagada = horaPagada * 7;
 
                horesExtra = hores - 40;
            }

        } while (cont <= 10);
    }

}
