
package ExercicisEntregable;

import java.util.Scanner;


public class Ex2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        String figura;
        boolean s = false;
        
        do{

            figura = in.nextLine().toLowerCase();
                if (null != figura) switch (figura) {
                    case "q": 
                        q(in);
                        break;
                    case "r":  
                        r(in);
                        break;
                    case "t":
                        t(in);
                        break;
                    case "c":
                        c(in);
                        break;
                    case "s":
                        s = true;
                        break;
                    default:
                        break;
                }
        } while ( s == false);
        
        
    }
    
    
    public static void q (Scanner in){
        
        double peri, sup;
        
        double costat = in.nextDouble();
        
        peri = costat * 4;
        sup = costat * costat;
        
        System.out.println("==Quadrat==");
        System.out.printf("Perímetre : %.2f %n", peri);
        System.out.printf("Superfície: %.2f %n", sup);
    
    }
    
    public static void r(Scanner in){
        
        double peri, sup;
        
        double base = in.nextDouble();
        
        double alt = in.nextDouble();
        
        peri = base * 2 + alt * 2;
        sup = base * alt;
        
        System.out.println("==Rectangle==");
        System.out.printf("Perímetre : %.2f %n", peri);
        System.out.printf("Superfície: %.2f %n", sup);
    }
    
    public static void t(Scanner in){
        
        double peri, sup, alt;
        
        double costat = in.nextDouble();
        
        double base = in.nextDouble();
        
        alt = Math.sqrt(Math.pow(costat, 2) - Math.pow(base, 2) / 4);
        peri = costat * 2 + base;
        sup = base * alt / 2;
        
        System.out.println("==Triangle isòsceles==");
        System.out.printf("Perímetre : %.2f %n", peri);
        System.out.printf("Superfície: %.2f %n", sup);
        
    }
    
    public static void c(Scanner in){
        
        double peri, sup;
        
        double radi = in.nextDouble();
  
        peri = (2 * Math.PI) * radi;
        sup = (Math.PI) * Math.pow(radi, 2);
        
        System.out.println("==Cercle==");
        System.out.printf("Perímetre : %.2f %n", peri);
        System.out.printf("Superfície: %.2f %n", sup);
        
    } 
    
}
