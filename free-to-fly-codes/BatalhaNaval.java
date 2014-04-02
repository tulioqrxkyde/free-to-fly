/***********************************************************************
 * Compilation: javac Fatorial.java
 * Execution: java Fatorial or java -cp . Fatorial
 *
 * Mini-Game Naval Battle.
 *
 ***********************************************************************/
package freetofly;

import java.util.Random;
import java.util.Scanner;

/**
 * Batalha Naval
 *
 * @author tulio.xcrtf
 * @version 1.0
 */
public class BatalhaNaval {

    static final int[][] BLOCOS = new int[5][5]; /* Informe o length que desejar */
    static String[][] mar = new String[blocos[0].length][blocos[1].length];
    static int navios = 0, tiros = 0;

    public static void main(String[] args) {
        /* Preenche os blocos e a array que contem as aguinhas *-* */
        for (int i = 0; i < BLOCOS[0].length; i++) {
            for (int j = 0; j < BLOCOS[0].length; j++) {
                BLOCOS[j][i] = -1;
                mar[j][i] = "~";
            }
        }
        Random rand = new Random();
        int rand1, rand2;
        for (int set = 0; set < 3;) {
            /* Gera a posi��o dos barcos */
            rand1 = rand.nextInt(BLOCOS[0].length);
            rand2 = rand.nextInt(BLOCOS[0].length);
            if (BLOCOS[rand1][rand2] != 1) {
                BLOCOS[rand1][rand2] = 1;
                set++;
            }
        }
        atirar();
    }

    /**
     * M�todo que permite "atirar", caso acerte a �guinha se tornar� um X, caso erre se tornar�
     * um asterisco *
     */
    public static void atirar() {
        while (navios < 3) {
            for (int i = 0; i < mar[0].length; i++) {
                for (int j = 0; j < mar[0].length; j++) {
                    System.out.print(mar[j][i] + "\t");
                }
                System.out.println();
            }
            System.out.println("Digite a linha e a coluna:");
            int n = new Scanner(System.in).nextInt();
            int n2 = new Scanner(System.in).nextInt();
            tiros++;
            if (!(n > -1 && n < 5) || !(n2 > -1 && n2 < 5)) {
                System.out.println("Os valores devem estar entre 0 - 4.");
                continue;
            }
            if (BLOCOS[n2][n] == 0) {
                System.out.println("Voc� j� atirou aqui!");
            } else if (BLOCOS[n2][n] == 1) {
                navios++;
                mar[n2][n] = "X";
            } else {
                BLOCOS[n2][n] = 0;
                mar[n2][n] = "*";
            }
        }
        System.out.println("Voc� conseguiu atingir todos os navios na tentativa " + tiros);
    }
}