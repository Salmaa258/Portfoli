package Bloc4;

public class Exercici1 {

    private String nom;
    private String NIF;
    private String correu;
    private int despesaFeta;
    private int Descompte;

    public Exercici1() {

    }

    public Exercici1(String nom, String NIF, String correu,
            int despesaFeta, int Descompte) {
        this.nom = nom;
        this.NIF = NIF;
        this.correu = correu;
        this.despesaFeta = despesaFeta;
        this.Descompte = Descompte;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getCorreu() {
        return correu;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }

    public int getDespesaFeta() {
        return despesaFeta;
    }

    public void setDespesaFeta(int despesaFeta) {
        this.despesaFeta = despesaFeta;
    }

    public int getDescompte() {
        return Descompte;
    }

    public void setDescompte(int Descompte) {
        this.Descompte = Descompte;
    }

}
