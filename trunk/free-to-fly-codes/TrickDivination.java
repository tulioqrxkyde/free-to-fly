/***********************************************************************
 * Compilation: javac TrickDivination.java
 * Execution: java TrickDivination or java -cp . TrickDivination
 *
 * This algorithm previse a imagined number.
 *
 ***********************************************************************/
package freetofly;

import java.util.Scanner;

/**
 *
 * @author tulio.xcrtf
 * @version 1.0
 */
public class TrickDivination {

    static Scanner s;
    static int typeGroup = 1, number = 0;

    public static void init() {
        s = new Scanner(System.in);
        System.out.println("Pense em um n�mero entre 1-31. Ap�s pensar, digite OK. ");
        if (s.nextLine().equalsIgnoreCase("ok")) {
            showNumbers();
        }
    }

    public static void showNumbers() {
        switch (typeGroup) {
            case 2:
                System.out.println("\n" + TrickDivinationEnums.GroupTwo.returnGroupValue());
                break;
            case 3:
                System.out.println("\n" + TrickDivinationEnums.GroupThree.returnGroupValue());
                break;
            case 4:
                System.out.println("\n" + TrickDivinationEnums.GroupFour.returnGroupValue());
                break;
            case 5:
                System.out.println("\n" + TrickDivinationEnums.GroupFive.returnGroupValue());
                break;
            default:
                System.out.println("\n" + TrickDivinationEnums.GroupOne.returnGroupValue());
        }
        System.out.println("O n�mero que voc� pensou est� entre os n�meros acima? (S / N)");
        if (s.nextLine().equalsIgnoreCase("s")) {
            if (typeGroup == 1) {
                number++;
            } else if (typeGroup == 2) {
                number += 2;
            } else if (typeGroup == 3) {
                number += 4;
            } else if (typeGroup == 4) {
                number += 8;
            } else {
                number += 16;
            }
        } else if (typeGroup == 1) {
            number = 0;
        }
        typeGroup++;
        if (typeGroup < 6) {
            showNumbers();
        }
    }

    public static void main(String[] args) {
        init();
        System.out.println("O n�mero que voc� pensou foi: " + number);
    }
}