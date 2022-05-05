package Bloc6;

import java.util.Scanner;
import java.util.Arrays;

public class equals {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr1 = new int[]{1, 2, 3};

        int[] arr2 = new int[]{1, 2, 3};

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Son iguals");
        } else {
            System.out.println("no son iguals");
        }

    }
}
