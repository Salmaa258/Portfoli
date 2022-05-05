
package DPT;

import java.util.Scanner;


public class DPT {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int metros, velmax, vel, segs, km, min, hora, multaR, multa;

        System.out.println("Introduce la distancia en metros:");
        metros = in.nextInt();
        
        System.out.println("Introduce la velocidad máxima permitida en km/h:");
        velmax = in.nextInt();
        
        System.out.println("Introduce los segundos que ha tardado el "
                + "coche en " + "recorrer el tramo:");
        segs = in.nextInt();
        
        
        km = metros / 1000;
        
        min = segs / 60;
        
        hora = min / 60;
        
        vel = km / hora;
        
        multaR = vel * 20 / 100;
        
        multa = vel - multaR;
        
        if (vel < velmax){
            System.out.println("OK");
        } else if ((vel < multa) && (vel > velmax)){
            System.out.println("MULTA");
        } else if ((vel > multa) && (vel > velmax)){
            System.out.println("PUNTOS");
        } 
        
     }  

}
