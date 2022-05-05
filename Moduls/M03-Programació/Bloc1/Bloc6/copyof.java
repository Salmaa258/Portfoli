
package Bloc6;

import java.util.Scanner;
import java.util.Arrays;

public class copyof {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] arrInt = new int[] {2, 3, 4};
        
        int[] arrInt2 = Arrays.copyOf(arrInt, 5);
        arrInt2[3] = 5;
        arrInt2[4] = 6;
        
        for (int i = 0; i < arrInt2.length; i++){
            System.out.println(arrInt2[i]);
        }
        
        
        
        
        
    }
    
    
    
    
}
