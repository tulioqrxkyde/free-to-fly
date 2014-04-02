
package anivtulio;

import javax.swing.JOptionPane;

public class AnivTulio {

    public static void main(String[] args) {
       
        JOptionPane.showMessageDialog(null,"Que a felicidade Adote seu coração. ");
        JOptionPane.showMessageDialog(null,"Que o carinho resida em seu caminho.");
        JOptionPane.showMessageDialog(null,"Que os amigos leais se multiplique.");
        JOptionPane.showMessageDialog(null,"E que a paz se faça presente!");
        JOptionPane.showMessageDialog(null,"Parabéns");
        JOptionPane.showMessageDialog(null,"Feliz Aniversário");
        
        boolean Tulio=true;     
        
        float sucesso = 0;
        float felicidades = 0;
        float resumindoTudodeBom = 0;
        
        do{
            sucesso++;
            felicidades++;
            resumindoTudodeBom++;
            JOptionPane.showMessageDialog(null,"Este são os Sinceros votos de Sucesso, Felicidade e Tudo de Bom para Você: Túlio Vidal");
        }while (Tulio);
        //Não é preciso procurar Bugs neste código, eles te acham! Loop Infinito.    
    }
}
