
package Funcions2;

import java.util.Random;
import java.util.Scanner;

public class Ex3_Penjat {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String Psecreta = obtenirparaula();
        char[] asteriscos = asteriscos(Psecreta);
        boolean fin = false;
        int intents = 8;
        
        do{
            
            System.out.println(asteriscos);
            System.out.print("Introdueix lletra:");
            char lletra = in.next().charAt(0);
            
            
            boolean bien = false;
            
            
            for (int i = 0; i < Psecreta.length() ; i++){
                if(Psecreta.charAt(i) == lletra){
                    asteriscos[i] = lletra;
                    bien = true;
                }
            }
            
            if (bien == false){
                intents--;
 
            }
            
            switch (intents) {
                    case 8:
                        System.out.println("         ____");
                        System.out.println("        |");
                        System.out.println("        |");
                        System.out.println("        |");
                        System.out.println("        |");
                        System.out.println("        |");
                        System.out.println("       _|_");
                        System.out.println("      |   |______");
                        System.out.println("      |          |");
                        System.out.println("      |__________|" + "\n");
                        System.out.println("Lletres: " + lletra);
                        asteriscos(Psecreta);
                        System.out.println("");
                        break;
                    case 7:
                        System.out.println("         ____");
                        System.out.println("        |    |");
                        System.out.println("        |");
                        System.out.println("        |");
                        System.out.println("        |");
                        System.out.println("        |");
                        System.out.println("       _|_");
                        System.out.println("      |   |______");
                        System.out.println("      |          |");
                        System.out.println("      |__________|" + "\n");
                        System.out.println("Lletres: " + lletra);
                        asteriscos(Psecreta);
                        System.out.println("");
                        
                        break;
                    case 6:
                        System.out.println("         ____");
                        System.out.println("        |    |");
                        System.out.println("        |    o");
                        System.out.println("        |");
                        System.out.println("        |");
                        System.out.println("        |");
                        System.out.println("       _|_");
                        System.out.println("      |   |______");
                        System.out.println("      |          |");
                        System.out.println("      |__________|" + "\n");
                        System.out.println("Lletres: " + lletra);
                        asteriscos(Psecreta);
                        System.out.println("");
                        
                        break;
                    case 5:
                        System.out.println("         ____");
                        System.out.println("        |    |");
                        System.out.println("        |    o");
                        System.out.println("        |    |");
                        System.out.println("        |");
                        System.out.println("        |");
                        System.out.println("       _|_");
                        System.out.println("      |   |______");
                        System.out.println("      |          |");
                        System.out.println("      |__________|" + "\n");
                        System.out.println("Lletres: " + lletra);
                        asteriscos(Psecreta);
                        System.out.println("");
                        
                        break;
                    case 4:
                        System.out.println("         ____");
                        System.out.println("        |    |");
                        System.out.println("        |    o");
                        System.out.println("        |   /|");
                        System.out.println("        |");
                        System.out.println("        |");
                        System.out.println("       _|_");
                        System.out.println("      |   |______");
                        System.out.println("      |          |");
                        System.out.println("      |__________|" + "\n");
                        System.out.println("Lletres: " + lletra);
                        asteriscos(Psecreta);
                        System.out.println("");
                        
                        break; 
                    case 3:
                        System.out.println("         ____");
                        System.out.println("        |    |");
                        System.out.println("        |    o");
                        System.out.println("        |   /|\'");
                        System.out.println("        |");
                        System.out.println("        |");
                        System.out.println("       _|_");
                        System.out.println("      |   |______");
                        System.out.println("      |          |");
                        System.out.println("      |__________|" + "\n");
                        System.out.println("Lletres: " + lletra);
                        asteriscos(Psecreta);
                        System.out.println("");
                        
                        break;
                    case 2:
                        System.out.println("         ____");
                        System.out.println("        |    |");
                        System.out.println("        |    o");
                        System.out.println("        |   /|\'");
                        System.out.println("        |    |");
                        System.out.println("        |");
                        System.out.println("       _|_");
                        System.out.println("      |   |______");
                        System.out.println("      |          |");
                        System.out.println("      |__________|" + "\n");
                        System.out.println("Lletres: " + lletra);
                        asteriscos(Psecreta);
                        System.out.println("");
                       
                        break;  
                    case 1:
                        System.out.println("         ____");
                        System.out.println("        |    |");
                        System.out.println("        |    o");
                        System.out.println("        |   /|\'");
                        System.out.println("        |    |");
                        System.out.println("        |   / ");
                        System.out.println("       _|_");
                        System.out.println("      |   |______");
                        System.out.println("      |          |");
                        System.out.println("      |__________|" + "\n");
                        System.out.println("Lletres: " + lletra);
                        asteriscos(Psecreta);
                        System.out.println("");
                        
                        break; 
                    case 0:
                        System.out.println("         ____");
                        System.out.println("        |    |");
                        System.out.println("        |    o");
                        System.out.println("        |   /|\'");
                        System.out.println("        |    |");
                        System.out.println("        |   / \'");
                        System.out.println("       _|_");
                        System.out.println("      |   |______");
                        System.out.println("      |          |");
                        System.out.println("      |__________|" + "\n");
                        System.out.println("");
                        System.out.println("OOOOOoooohhhh! Has perdut!!");
                        System.out.println("La paraula secreta era: " + Psecreta);
                        fin = true;
                        break;    
                    default:
                        break;
                }
            
            
            
            if(bien == true){
                boolean guanyat = !yaono(asteriscos);
                if(guanyat){
                    System.out.println("Has guanyat!!!!");
                    System.out.println("La paraula secreta era: " + Psecreta);
                    fin = true;
                }
            }

        }while(fin == false);
        
        
    }
    
    public static String obtenirparaula(){
        //creación de array de palabras
        String [] palabras = {"hola", "adios", "patata"};
        
        //declaramos una palabra random según su numero de posición
        Random r = new Random();
        int numero = r.nextInt(palabras.length);
        
        return palabras[numero];
    }
    
    public static char[] asteriscos(String palabra){
        int numletras = palabra.length();
        
        char [] asteriscos = new char[numletras];
        
        System.out.print("Paraula: ");
        for(int i = 0; i < asteriscos.length; i++){
            asteriscos[i] = '*';
        }
        
        return asteriscos;
    }
    
    public static boolean yaono(char[] array){
        for (char l:array){
            if(l=='*'){
                return true;
            }
        }
        return false;
    }
    
}
