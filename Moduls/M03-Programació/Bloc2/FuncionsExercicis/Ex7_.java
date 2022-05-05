
package FuncionsExercicis;
import java.util.Scanner;

public class Ex7_ {
    
       public static boolean comprobarFila(int[][] m, int fila) {
        int[] sudoku = new int[9];
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[m[fila][i]-1] == 1) return false;
            sudoku[m[fila][i]-1] = 1;
        }
        return true;
    }

    public static boolean comprobarColumna(int[][] m, int columna) {
        int[] sudoku = new int[9];
        for (int j = 0; j < m.length; j++) {
            if (sudoku[m[j][columna]-1] == 1) return false;
            sudoku[m[j][columna]-1] = 1;
        }
        return true;
    }

    public static boolean comprobarRegion(int[][] m) {
        int max, x, y;
        int[] valores = {0, 3, 6, 0, 3, 6, 0, 3, 6};
        for (int l = 0; l < 9; l++) {
            x = y = valores[l];
            max = x + 3;
            int[] test = new int[9];
            for (int i = x; i < max; i++) {
                for (int j = y; j < max; j++) {
                    if (test[m[i][j]-1] == 1) return false;
                    test[m[i][j]-1] = 1;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /**
         * 1.- Comprobar filas
         * 2.- Comprobar columnas
         * 3.- Comprobar apartados
         */

        int casos = in.nextInt();
        int[][] sudoku;
        boolean correcte;

        for (int l = 0; l < casos; l++) {

            sudoku = new int[9][9];
            for (int i = 0; i < 9; i++)
                for (int j = 0; j < 9; j++)
                    sudoku[i][j] = in.nextInt();

            // COMPROBAR FILAS COLUMNAS
            correcte = true;
            for (int i = 0; i < 9; i++) {
                if (!comprobarFila(sudoku, i)) correcte = false;
                if (correcte && !comprobarColumna(sudoku, i)) correcte = false;
                if (!correcte) break;
            }

            if (correcte)
                correcte = comprobarRegion(sudoku);

            System.out.println((correcte) ? "SI" : "NO");
        }

    }


}
