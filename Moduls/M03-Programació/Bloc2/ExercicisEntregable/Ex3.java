
package ExercicisEntregable;

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String figura;
        boolean s = false;
        do{

            figura = in.nextLine().toLowerCase();
            if (null != figura) switch (figura) {
                case "c":
                    c(in);
                    break;
                case "h":
                    h(in);
                    break;
                case "t":
                    t(in);
                    break;
                case "e":
                    e(in);
                    break;
                case "s":
                    s = true;
                    break;
                default:
                    break;
            }
      
        } while ( s == false);
    }
    
    public static void c(Scanner in){
        
        double sup, volumen;
        
        double radi = in.nextDouble();
     
        double alçada = in.nextDouble();
        
        sup = 2 * Math.PI * radi * alçada;
        volumen = Math.PI * Math.pow(radi, 2) * alçada;
        
        System.out.println("==Cilindre==");
        System.out.printf("Superfície: %.2f %n", sup);
        System.out.printf("Volum: %.2f %n", volumen);
        
    }
    
    public static void h(Scanner in){
      
        double sup, volumen;
        
        double costat = in.nextDouble();

        sup = 6 * Math.pow(costat, 2);
        volumen = Math.pow(costat, 3);
        
        System.out.println("==Hexaedre==");
        System.out.printf("Superfície: %.2f %n", sup);
        System.out.printf("Volum: %.2f %n", volumen);
        
    }
    
    public static void t(Scanner in){    
        
        double sup, volumen;
        
        double a = in.nextDouble();

        
        sup = Math.pow(a, 2) * Math.sqrt(3);
        volumen = Math.pow(a, 3) * (Math.sqrt(2) / 12);
        
        System.out.println("==Tetraedre==");
        System.out.printf("Superfície: %.2f %n", sup);
        System.out.printf("Volum: %.2f %n", volumen);
        
    }
    
    public static void e(Scanner in){  
        
        double sup, volumen;
        
        double radi = in.nextDouble();
        
        sup = 4 * Math.PI * Math.pow(radi, 2);
        volumen = 4 * Math.PI * (Math.pow(radi, 3)) / 3;
        
        System.out.println("==Esfera==");
        System.out.printf("Superfície: %.2f %n", sup);
        System.out.printf("Volum: %.2f %n", volumen);
        
        
    }
    
    
}
