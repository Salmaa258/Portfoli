
package Bloc6;

import java.util.Scanner;
import java.util.Arrays;

public class fill {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        
        Arrays.fill(arr, 1, 9, 5);
        
        System.out.println(Arrays.toString(arr));
        
        
        
        
        
    }    
    
}

