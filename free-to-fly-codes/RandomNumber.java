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

    /* 0 - 1000, o valor é dado a valor máximo +1,
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
            System.out.println("Tente adivinhar o número entre 1-1000");
            palpite = new Scanner(System.in).nextInt();
            /* Incrementa o número de tentativas */
            tentativas++;
            /* Acessa o método comparar e exibe seu retorno */
            System.out.print(comparar(palpite, numero_computador));
            /* Caso o número gerado aleatóriamente e o palpite sejam iguais o loop é encerrado */
        } while (palpite != numero_computador);
        System.out.println();
    }

    public static String comparar(int palpite, int numero_computador) {
        if (palpite > numero_computador) {
            return "O número é menor do que seu palpite.";
        } else if (palpite < numero_computador) {
            return "O número é maior do que seu palpite.";
        } else {
            return "Parabéns você acertou!";
        }
    }
}