/***********************************************************************
 * Compilation: javac BergPost.java
 * Execution: java BergPost or java -cp . BergPost
 *
 * Code for post of Teacher Berg, in date 22/03/2014 - 23H(+-).
 * 
 * Berg Words: To no loop: Sem sono, cansado, sem juízo.. 
 * Daí, tento assistir tV pra tentar rir.. procuro procuro procuro, 
 * e não acho nada na Rede Aberta que, de fato, contribua para algo 
 * essa hora...
 *
 ***********************************************************************/
package freetofly;

/**
 *
 * @author tulio.xcrtf
 */
public class BergPost {

    private static final String name = "Berg";

    public static void main(String[] args) {
        turnOnTv();
    }

    public static void turnOnTv() {
        boolean loop = true, sleep = !loop, tired = !sleep, senses = !tired;
        changeChannel(loop);
    }

    public static void changeChannel(final boolean loop) {
        boolean funny = false;
        for (int channel = 1; loop; channel++) {
            if (funny) {
                break;
            } else {
                System.out.println("Canal não divertido.");
            }
        }
        System.out.println("Canal divertido !!!! ^_^"
                + " Canal contribuiu com o " + name);
    }
}