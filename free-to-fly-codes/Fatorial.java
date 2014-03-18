/***********************************************************************
 * Compilation: javac Fatorial.java
 * Execution: java Fatorial or java -cp . Fatorial
 *
 * Fatorial Algorithm.
 *
 ***********************************************************************/

import javax.swing.JOptionPane;

/**
 *
 * @author tulio.xcrtf
 */
public class Fatorial {

    public static void main(String[] args) {
        System.out.println("Fatorial = "
            + calcular(Long.valueOf(System.console().printf("Informe o valor: ", new Object[1]).readLine())));
    }

    /* Método recursivo do Fatorial */
    public static long calcular(long probs) {
        long result, c = probs - 1;
            if (probs <= 1) {
                return 1;
            } else {
                return probs * calcular(c);
            }
    }
}