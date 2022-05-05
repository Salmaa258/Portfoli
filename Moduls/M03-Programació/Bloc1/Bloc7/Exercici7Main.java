package Bloc7;

import java.util.Scanner;

public class Exercici7Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);

        Exercici7p1[] Empleats = new Exercici7p1[5];
        Exercici7p2[] Departament = new Exercici7p2[4];

        System.out.println("Introdueix un departament [Dept1, Dept2, Dept3, Dept4]");
        String dep = in.nextLine();

        empleaEmpleats(Empleats);
        emplenaDepartaments(Departament);
        trobaDepartament(Empleats, Departament, dep);

        //Nou telefon
        System.out.println("Nou telefon: ");
        String tel = in.nextLine();
        Empleats[0].setTelefon(tel);
        System.out.println(Empleats[0].toString());

    }

    public static void trobaDepartament(Exercici7p1[] emp,
            Exercici7p2[] deps, String dep) {
        int hores = 1;
        double sou = 1;
        for (int i = 0; i < deps.length; i++) {
            if (deps[i].getNomDepartament().equals(dep)) {
                hores = deps[i].getHores();
                sou = deps[i].getSou();
            }
        }
        int treballador = 0;
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getDepartament().equals(dep)) {
                treballador++;
            }
        }

        System.out.println("Departament: " + dep);
        System.out.println("Treballadors: " + treballador);
        System.out.println("sou: " + sou * treballador);
        System.out.println("Hores: " + hores * treballador);

    }

    public static void empleaEmpleats(Exercici7p1[] Empleats) {
        Empleats[0] = new Exercici7p1("Pep", 25, "671111111", "Dept1");
        Empleats[1] = new Exercici7p1("Pepa", 56, "672222222", "Dept2");
        Empleats[2] = new Exercici7p1("Pau", 19, "673333333", "Dept3");
        Empleats[3] = new Exercici7p1("Paula", 43, "674444444", "Dept4");
        Empleats[4] = new Exercici7p1("Paola", 78, "675555555", "Dept2");
    }

    public static void emplenaDepartaments(Exercici7p2[] Departament) {
        Departament[0] = new Exercici7p2("Dept1", 34, 1900);
        Departament[1] = new Exercici7p2("Dept2", 36, 2000);
        Departament[2] = new Exercici7p2("Dept3", 35, 1700);
        Departament[3] = new Exercici7p2("Dept4", 38, 2100);
    }

}
