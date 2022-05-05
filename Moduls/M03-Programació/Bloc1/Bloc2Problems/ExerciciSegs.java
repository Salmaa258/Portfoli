package Bloc2Problems;

import java.util.Scanner;

public class ExerciciSegs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int any, dia, diaS, hora, horaS, min, minS, seg, segons,
                segonsS;

        System.out.println("Escriu un valor en segons:");
        seg = in.nextInt();

        segons = seg;

        min = seg / 60;
        segonsS = seg % 60;

        hora = min / 60;
        minS = min % 60;

        dia = hora / 24;
        horaS = hora % 60;

        any = dia / 365;
        diaS = dia % 365;

        System.out.printf("%d segons equivalen a %d "
                + "anys, %d dies, %d hores, %d minuts "
                + "i %d segons ", segons,
                any, diaS, horaS, minS, segonsS);
    }

}
