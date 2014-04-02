/***********************************************************************
 * Compilation: javac RandomNumber.java
 * Execution: java RandomNumber or java -cp . RandomNumber
 *
 ***********************************************************************/
package freetofly;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tulio.xcrtf
 */
public class RandomNumber {

    /* 0 - 1000, o valor � dado a valor m�ximo +1,
     * caso queira alterar troque o valor 1001 para o desejado */
    static final int N_RANDOM = 1001;

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Random r = new Random();
        int numero_computador = r.nextInt(N_RANDOM);
        int palpite, tentativas = 1;
        do {
            System.out.println("\nTentativa: " + tentativas);
            System.out.println("Tente adivinhar o n�mero entre 1-1000");
            palpite = new Scanner(System.in).nextInt();
            /* Incrementa o n�mero de tentativas */
            tentativas++;
            /* Acessa o m�todo comparar e exibe seu retorno */
            System.out.print(comparar(palpite, numero_computador));
            /* Caso o n�mero gerado aleat�riamente e o palpite sejam iguais o loop � encerrado */
        } while (palpite != numero_computador);
        System.out.println();
    }

    public static String comparar(int palpite, int numero_computador) {
        if (palpite > numero_computador) {
            return "O n�mero � menor do que seu palpite.";
        } else if (palpite < numero_computador) {
            return "O n�mero � maior do que seu palpite.";
        } else {
            return "Parab�ns voc� acertou!";
        }
    }
}