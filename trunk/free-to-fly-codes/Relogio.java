/***********************************************************************
 * Compilation: javac Relogio.java
 * Execution: java Relogio or java -cp . Relogio
 *
 ***********************************************************************/
package freetofly;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 * Relógio
 *
 * @author tulio.xcrtf
 * @version 1.1
 */
public class Relogio extends JFrame {

    JLabel horario, data;

    /**
     * Construtor default - define os componentes e inicializa o frame.
     */
    Relogio() {
        super("Meu relógio");
        super.setSize(270, 70);
        super.setLocationRelativeTo(null);
        super.setLayout(new FlowLayout());

        this.horario = new JLabel();
        this.data = new JLabel();
        super.add(horario);
        super.add(data);
        super.setVisible(true);

        Timer time = new Timer(1000, init);
        time.start();
    }
    ActionListener init = (new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            showTime();
        }
    });

    /**
     * Método de exibição do horário & data.
     */
    private void showTime() {
        Calendar calendario = Calendar.getInstance();
        data.setText(calendario.get(Calendar.DAY_OF_MONTH)+"/"
                +Integer.valueOf(calendario.get(Calendar.MONTH)+1)+"/"+calendario.get(Calendar.YEAR)); /* Especialmente para seu comentário, Johnatan */
        horario.setText(calendario.get(Calendar.HOUR_OF_DAY) + ":" + calendario.get(Calendar.MINUTE) + ":" + calendario.get(Calendar.SECOND));
    }

    /**
     * Main
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        Relogio r = new Relogio();
    }
}