/************************************************************************
 * Compilation: javac Fibonnaci.java
 * Execution: java Fibonacci or java -cp . Fibonacci
 *
 * Show the number of Fibonacci in sequence.
 *
 * Remark --> if want, modify the value of n to exhibit more times.
 *
 ************************************************************************/
package javaprogramming;

/**
 *
 * @author tulio.xcrtf
 */
public class Fibonacci {

    public static void main(String[] args) {
        /* Non-recursive method */
        int x = 0, y = 1;
        final short n = 20;
        for (int r = 0; r < n; r++) {
            y = x + y;
            System.out.println(x);
            x = y - x;
        }
    }
}