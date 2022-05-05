
package Bloc7;

import java.util.Scanner;

public class Exercici1 {
   
    private String titol;
    private String tipus;
    private String director;
    
    public Exercici1() {
        this.titol = "";
        this.tipus = "";
        this.director = "";
    }
    
    public Exercici1(String tit, String tipus, String dire) {
        this.titol = tit;
        this.tipus = tipus;
        this.director = dire;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    public void imprimeix() {
        System.out.println("Titol: " + this.titol );
        System.out.println("Tipus: " + this.tipus );
        System.out.println("Director: " + this.director );
       
    }
    
    
    
    
    
    
    
    
    
    
}
