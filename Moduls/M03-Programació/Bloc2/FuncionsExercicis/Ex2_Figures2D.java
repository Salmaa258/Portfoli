
package FuncionsExercicis;

import java.util.Scanner;


public class Ex2_Figures2D {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        
        System.out.println("Introdueix una figura [quadrat, rectangle, triangle o cercle]");
        String figura = inStr.nextLine();
        
        if (null != figura)switch (figura) {
            case "quadrat":
                quadrat();
                break;
            case "rectangle":
                rectangle();
                break;
            case "triangle":
                triangle();
                break;
            case "cercle":
                cercle();
                break;
            default:
                break;
        }
      
        
    }
    
    
    public static void quadrat (){
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        
        double peri, sup;
        
        System.out.println("Introdueix quant medeix un dels costats del quadrat");
        int costat = in.nextInt();
        
        peri = costat * 4;
        sup = costat + costat + costat + costat;
        
        System.out.println("El perimetre del quadrat es: " + peri);
        System.out.println("La superficie del quadrat es: " + sup);
    
    }
    
    public static void rectangle(){
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        
        double peri, sup;
        
        System.out.println("Introdueix quant medeix la base del rectangle");
        int base = in.nextInt();
        System.out.println("Introdueix quant medeix la altura del rectangle");
        int alt = in.nextInt();
        
        peri = base * 2 + alt * 2;
        sup = base * alt;
        
        System.out.println("El perimetre del rectangle es: " + peri);
        System.out.println("La superficie del rectangle es: " + sup);
    }
    
    public static void triangle(){
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        
        double peri, sup;
        
        System.out.println("Introdueix quant medeix la base del isosceles");
        int base = in.nextInt();
        System.out.println("Introdueix quant medeix un dels costats del triangle");
        int costat = in.nextInt();
        System.out.println("Introdueix quant medeix la altura del triangle");
        int alt = in.nextInt();
        
        peri = costat * 2 + base;
        sup = base * alt / 2;
        
        System.out.println("El perimetre del triangle es: " + peri);
        System.out.println("La superficie del triangle es: " + sup);
        
    }
    
    public static void cercle(){
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        
        double peri, sup;
        
        
        System.out.println("Introdueix quant medeix el radi del cercle");
        int radi = in.nextInt();
  
        peri = 2 * Math.PI * radi;
        sup = Math.PI * Math.pow(radi, 2);
        
        System.out.println("El perimetre del cercle es: " + peri);
        System.out.println("La superficie del cercle es: " + sup);
        
    }
    
    
    
}
