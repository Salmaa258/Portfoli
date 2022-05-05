
package FuncionsExercicis;

import java.util.Scanner;

public class Ex3_Figures3D {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        
        System.out.println("Introdueix una figura [cilindre, hexaedre, tetraedre o esfera]");
        String figura = inStr.nextLine();
        
        if (null != figura)switch (figura) {
            case "cilindre":
                cilindre();
                break;
            case "hexaedre":
                hexaedre();
                break;
            case "tetraedre":
                tetraedre();
                break;
            case "esfera":
                esfera();
                break;
            default:
                break;
        }
      
        
    }
    
    public static void cilindre(){
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        
        double sup, volumen, radi;
        
        System.out.println("Introdueix quant medeix la base del cilindre");
        int base = in.nextInt();
        System.out.println("Introdueix quant medeix la altura del cilindre");
        int alt = in.nextInt();
        
        radi = base / 2;
        
        sup = 2 * Math.PI * radi;
        volumen = Math.PI * Math.pow(radi, 2) * alt;
        
        System.out.println("La superficie del cilindre es: " + sup);
        System.out.println("El volumen del cilindre es: " + volumen);
        
    }
    
    public static void hexaedre(){
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        
        double sup, volumen;
        
        System.out.println("Introdueix quant medeix la arista del hexaedre");
        int a = in.nextInt();

        sup = 6 * Math.pow(a, 2);
        volumen = Math.pow(a, 3);
        
        System.out.println("La superficie del hexaedre es: " + sup + "^2");
        System.out.println("El volumen del hexaedre es: " + volumen + "^3");
        
    }
    
    public static void tetraedre(){
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        
        double sup, volumen,sup1, sup2;
        
        System.out.println("Introdueix quant medeix un costat del tetraedre");
        int costat = in.nextInt();
        System.out.println("Introdueix quant medeix la altura del triangle");
        int alt = in.nextInt();
        
        sup = Math.pow(costat, 2) * Math.sqrt(3);
        volumen = Math.pow(costat, 3) * Math.sqrt(2) / 12;
        
        System.out.println("La superficie del tetraedre es: " + sup);
        System.out.println("El volumen del tetraedre es: " + volumen);
        
    }
    
    public static void esfera(){
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        
        double sup, volumen;
        
        System.out.println("Introdueix quant medeix el radi de la esfera");
        int radi = in.nextInt();
        
        sup = 4 * Math.PI * Math.pow(radi, 2);
        volumen = (4 / radi) * Math.PI * Math.pow(radi, 3);
        
        System.out.println("La superficie de la esfera es: " + sup);
        System.out.println("El volumen de la esfera es: " + volumen);
        
        
    }
    
    
    
    
    
    
}
