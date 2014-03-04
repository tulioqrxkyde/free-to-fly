package javaprogramming;

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
 * @version 1.0
 */
public class Relogio extends JFrame {

    JLabel horario;

    /**
     * Construtor default - define os componentes e inicializa o frame.
     */
    Relogio() {
        super("Meu relógio");
        super.setSize(270, 70);
        super.setLocationRelativeTo(null);
        super.setLayout(new FlowLayout());

        this.horario = new JLabel();
        super.add(horario);
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
     * Método de exibição do horário.
     */
    private void showTime() {
        Calendar calendario = Calendar.getInstance();
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