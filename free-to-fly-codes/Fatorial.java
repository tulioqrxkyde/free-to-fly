/***********************************************************************
 * Compilation: javac Fatorial.java
 * Execution: java Fatorial or java -cp . Fatorial
 *
 * Fatorial Algorithm.
 *
 ***********************************************************************/
package freetofly;

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
        long c = probs - 1l;
            if (probs <= 1) {
                return 1;
            } else {
                return probs * calcular(c);
            }
    }
}