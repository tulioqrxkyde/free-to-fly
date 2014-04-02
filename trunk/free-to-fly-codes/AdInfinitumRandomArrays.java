/***********************************************************************
 * Compilation: javac AdInfinitumRandomArrays.java
 * Execution: java AdInfinitumRandomArrays or java -cp . AdInfinitumRandomArrays
 *
 * Copyright (c) 2014 Túlio Vidal (tulio.xcrtf)
 * 
 * Remark: This algorithm is based on the theorem of the Infinite Monkey.
 * PT-BR: (http://pt.wikipedia.org/wiki/Teorema_do_macaco_infinito)
 *                           or
 * EN-US: (http://en.wikipedia.org/wiki/Infinite_monkey_theorem)
 ***********************************************************************/
package freetofly;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author tulio.xcrtf
 * @version 1.0
 */
public class AdInfinitumRandomArrays {

    /* Tamanho máximo do length que um vetor poderá atingir */
    static final int ARRAY_SIZE = 10;
    /* Valor numérico que poderá ser gerado,
     * ex: 1000 [ Irá fazer com que haja a possibilidade de gerar números entre 0-999 ].
     */
    static final int maxValues = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Random randomLength = new Random();
        boolean identical = false;
        while (!identical) {
            identical = isIdentical(randNumbers(randomLength.nextInt(ARRAY_SIZE)),
                    randNumbers(randomLength.nextInt(ARRAY_SIZE)));
        }
        System.out.println("Identical Arrays o(^_^)o ");
    }

    /**
     * Gera números aleatórios para um vetor.
     * 
     * @param size int
     * @return int[]
     */
    private static int[] randNumbers(int size) {
        int[] vetor = new int[++size];
        Random randomValues = new Random();
        for (int x = 0; x < vetor.length; x++) {
            vetor[x] = randomValues.nextInt(maxValues);
        }
        return vetor;
    }

    /**
     * Compara o conteúdo ( comprimento e valores ) entre dois vetores.
     * 
     * @param v1 int[]
     * @param v2 int[]
     * @return boolean
     */
    private static boolean isIdentical(int[] v1, int[] v2) {
        System.out.println("Writing array1: " + Arrays.toString(v1)
                + " Writing array2: " + Arrays.toString(v2));
        if (v1.length == v2.length) {
            for (int j = 0; j < v2.length; j++) {
                if (v1[j] != v2[j]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}