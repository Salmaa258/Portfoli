
package Bloc7;

import java.util.Scanner;


public class classCotxeMain {
    
    
    public static void main (String[] args){
        
        Scanner in = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);
        
        classCotxe[] concessionari = new classCotxe[3];
        
        for (int i = 0; i < concessionari.length; i++){
            System.out.println("Marca: ");
            String marca = in.nextLine();
            System.out.println("Model: ");
            String model = in.nextLine();
            System.out.println("Potencia: ");
            int potencia = inNum.nextInt();
            System.out.println("Es electric: ");
            boolean electric = inNum.nextBoolean();
            
            concessionari[i] = new classCotxe(marca, model, potencia, electric);
            
        }
        imprimeix(concessionari);
        System.out.println("La potencia mitjana es: " 
                + mitjanaPotencia(concessionari));
        System.out.println("Hi ha " + noElectrics(concessionari) + " vehicles no electrics");
        
        
    }
    
    public static void imprimeix (classCotxe[] taller) {
        System.out.println("Impressió de l'array");
        for (int i = 0; i < taller.length; i++){
            taller[i].imprimeix();
        }
    }
    
    public static double mitjanaPotencia(classCotxe[] taller){
        int sumaPot = 0;
        for ( int i = 0; i < taller.length; i++){
            sumaPot = sumaPot + taller[i].getPotencia(); 
        }
        double mitjana = (float)sumaPot / taller.length;
        return mitjana;
    }
    
    public static int noElectrics (classCotxe[] taller){
        int noEle = 0;
        for (int i = 0; i < taller.length; i++){
            if (taller[i].isElectric() == false){
                noEle++;
                
            }
        }
        return noEle;
    }
    
   /* public static int aumentaPotencia (int increment, classCotxe[] taller){
        for (int i = 0; i < taller.length; i++){
            taller[i].aumentaPotencia(increment);
        }
    }
    /*/
    
    
    
}
