package CercaBinaria;

import java.util.*;

class Main {

    public static void main(String args[]) {
        int numArray[] = {5, 10, 15, 20, 25, 30, 35};
        System.out.println("The input array: " + Arrays.toString(numArray));

        int key = 20;

        System.out.println("Key to be searched=" + key);

        int first = 0;
        int last = numArray.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (numArray[mid] == last) {
                System.out.println("Element is not found!");
            }
            
        }
    }
}
