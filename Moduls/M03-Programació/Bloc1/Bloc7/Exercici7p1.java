package Bloc7;

import java.util.Scanner;

public class Exercici7p1 {

    private String nom;
    private int edad;
    private String telefon;
    private String departament;

    public Exercici7p1() {
        this.nom = "";
        this.edad = 0;
        this.telefon = "";
        this.departament = "";

    }

    public Exercici7p1(String nom, int edad, String telefon, String departament) {
        this.nom = nom;
        this.edad = edad;
        this.telefon = telefon;
        this.departament = departament;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {

        Scanner in = new Scanner(System.in);
        
        telefon = telefon.replace("-", "");
        telefon = telefon.replace(".", "");
        telefon = telefon.replace(" ", "");
        while (!checktelefon(telefon)) {
            System.out.println("Introdueix un nou telefon");
            telefon = in.nextLine();
        }

        this.telefon = telefon;
    }

    public boolean checktelefon(String telefon) {
        
        if (telefon.length() != 9) {
            return false;
        }
        char[] phoneChar = telefon.toCharArray();
        for (int i = 0; i < phoneChar.length; i++){
            if (!Character.isDigit(phoneChar[i])){
                return false;
            }
        }
        return false;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

}
