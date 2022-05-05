/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicisEntregable2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class prueba4_2 {

    private static int vis = 10;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Con = in.nextInt();
        ArrayList Array = new ArrayList();

        GeneraRan(Array);
        System.out.print("[");
        for (int i = 0; i < vis; i++) {

            if (i == vis - 1) {
                System.out.print(Array.get(i));

            } else {
                System.out.print(Array.get(i) + ",");
            }
        }
        System.out.println("]");
        Seq(Array, Con);
        Bin(Array, Con);

    }

    static void GeneraRan(ArrayList Array) {
        for (int i = 0; i < 10; i++) {
            Random claseRandom = new Random();
            Array.add(claseRandom.nextInt(7));
        }
        Collections.sort(Array);
    }

    static void Seq(ArrayList Array, int Con) {
        int cont = 0;
        int Num = Array.size();
        boolean seq = false;
        System.out.print("Seqüencial:");
        for (int i = 0; i < Num; i++) {
            cont++;
            if (Con == (Integer) Array.get(i)) {
                seq = true;
                break;

            }

        }
        if (seq == true) {
            System.out.println("El numero " + Con + " si esta.");
        } else {
            System.out.println("El numero " + Con + " no esta.");
        }
        System.out.println("passes:" + cont);
    }

    static void Bin(ArrayList Array, int Con) {

        int pri = 0;

        int ult = Array.size() - 1;
        int cont = 0;
        boolean Dif = true;
        System.out.print("Binària:");
        while (pri <= ult) {
            cont++;

            int mid = pri + (ult - pri) / 2;
            if ((Integer) Array(mid) == Con) {
                System.out.println("El numero " + Con + " si esta.");
                Dif = false;
                break;
            } else if ((Integer) Array.get(mid) < Con) {

                pri = mid + 1;
            } else {

                ult = mid - 1;
            }
        }
        if (Dif) {
            System.out.println("El numero " + Con + " no esta.");
        }
        System.out.println("passes:" + cont);
    }

}
