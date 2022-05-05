
package Bloc4;

import java.util.Scanner;


public class Exercici3 {
    
    public static final int CLIENTS = 5;
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        
        Exercici1[] client = new Exercici1[CLIENTS];
        
        client[0] = new Exercici1("Joan", "123456", "joan@joan.com", 125, 10);
        client[1] = new Exercici1("Joana", "158964", "joana@joana.com", 15, 10);
        client[2] = new Exercici1("Maria", "458263", "maria@maria.com", 25, 15);
        client[3] = new Exercici1("Luci", "123444", "luci@luci.com", 54, 15);
        client[4] = new Exercici1("Mario", "166456", "mario@mario.com", 75, 20);
    
        int opcio = 0;
        while (opcio != 6) {
            opcio = menu(in);
            distribuidor(opcio, inStr, client);
        }
        
        public static void distribuidor(int opcio, Scanner in, Exercici1[] client) {
        switch (opcio) {
            case 1:
                cercaClient(client, in);
                break;
            case 2:
                despesaGlobal(client);
                break;
            case 3:
                millorClient(client);
                break;
            case 4:
                modificaCorreu(client, in);
                break;
            case 5:
                modificaDescompte(client, in);
                break;

            }
        }
        
        public static int menu (Scanner inStr){
            int opcio;
            
        } 
        
        public static void cercaClient(Exercici1[] client, Scanner in){
    
        }
        
        public static void despesaGlobal(Exercici1[] client){
    
        }
        
        public static void millorClient(Exercici1[] client){
    
        }
        
        public static void modificaCorreu(Exercici1[] client, Scanner in){
    
        }
        
        public static void modificaDescompte(Exercici1[] client, Scanner in){
    
        }
    
    }
}
