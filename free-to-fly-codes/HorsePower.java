/***********************************************************************
 * Nota: Este código é baseado no estudo sobre a unidade de medida: ( HP ) by James Watt.
 * EN-US: (http://en.wikipedia.org/wiki/Horsepower).
 ***********************************************************************/
package freetofly;

import java.util.Arrays;

/**
 *
 * @author tulio.xcrtf
 */
public class HorsePower {

    private static final double TIME_WORK = 1.0; /* Tempo em Minuto(s) em trabalho ou consumo */

    private static final int NUMBER_OF_DAYS = 30; /* Quantidade em dias em que haverá trabalho ou consumo */

    private static final int HP_IN_WATTS_PER_SECOND = 746; /* Medida Elétrica - hp(E) */

    private static String[] ELETRODOMESTICS = new String[]{"AQUECEDOR DE AMBIENTE", "AR-CONDICIONADO 18.000 BTU",
        "CAFETEIRA ELÉTRICA", "LAVADORA DE ROUPAS", "PANELA ELÉTRICA", "SORVETEIRA", "TORRADEIRA", "VENTILADOR DE TETO"};
    private static int[] CONSUMES = new int[]{1550, 2100, 600, 500, 1100, 15, 800, 120}; /* Potência média em WATTS */

    public static void main(String[] args) {
        calculateHP();
    }

    private static void calculateHP() {
        double timeConsume = TIME_WORK * NUMBER_OF_DAYS / 60;
        double[] monthEletrodomestics = new double[CONSUMES.length],
                monthHP = new double[monthEletrodomestics.length];
        for (int x = 0; x < CONSUMES.length; x++) {
            monthEletrodomestics[x] = (timeConsume * CONSUMES[x] / 1000) / 1000;
            monthHP[x] = Double.valueOf(((((HP_IN_WATTS_PER_SECOND * 60 * timeConsume) / 1000) / 1000)
                    / monthEletrodomestics[x]));
        }
        System.out.println("A energia de um cavalo (HP) permite que os seguintes eletrodomésticos\n "
                + "mantenham-se ligados durante os seguintes instantes em (S):\n"
                + Arrays.toString(ELETRODOMESTICS)
                + "\n"
                + Arrays.toString(monthHP));
    }
}