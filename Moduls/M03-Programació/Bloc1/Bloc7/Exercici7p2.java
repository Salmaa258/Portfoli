package Bloc7;

public class Exercici7p2 {

    private String nomDepartament;
    private int hores;
    private float sou;

    public Exercici7p2() {
        this.nomDepartament = "";
        this.hores = 0;
        this.sou = 0;

    }

    public Exercici7p2(String nomDepartament, int hores, float sou) {
        this.nomDepartament = nomDepartament;
        this.hores = hores;
        this.sou = sou;
    }

    public String getNomDepartament() {
        return nomDepartament;
    }

    public void setNomDepartament(String nomDepartament) {
        this.nomDepartament = nomDepartament;
    }

    public int getHores() {
        return hores;
    }

    public void setHores(int hores) {
        this.hores = hores;
    }

    public float getSou() {
        return sou;
    }

    public void setSou(float sou) {
        this.sou = sou;
    }
    
    
    
    
    

}
