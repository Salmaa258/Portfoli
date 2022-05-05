
package Bloc7;

public class Exercici2 {
    
    private String ISBN;
    private String titol;
    private String autor;
    private String editorial;
    private int numLlibres;
    private int preu;
    
    
    public Exercici2(){
        this.ISBN = "";    
        this.titol = "";
        this.autor = "";
        this.editorial = "";
        this.numLlibres = 0;
        this.preu = 0;
    }
    
    public Exercici2(String isbn, String tit, String auto, String edito, int numLlibres, int preu){
        this.ISBN = isbn;    
        this.titol = tit;
        this.autor = auto;
        this.editorial = edito;
        this.numLlibres = numLlibres;
        this.preu = preu;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumLlibres() {
        return numLlibres;
    }

    public void setNumLlibres(int numLlibres) {
        this.numLlibres = numLlibres;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }
    
    public void imprimeix(){
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Titol: " + this.titol);
        System.out.println("Autor: " + this.autor);
        System.out.println("Editorial: " + this.editorial);
        System.out.println("numLlibres: " + this.numLlibres);
        System.out.println("Preu: " + this.preu);
    }
    
    
    
    public void demana(){
    
    }
    
    
    
}
