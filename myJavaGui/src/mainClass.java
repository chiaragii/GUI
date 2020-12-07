import javax.swing.*;
import java.awt.*;

public class mainClass {

    public static void pausa(int secondi)
    {
        try
        {
            Thread.sleep(1000*secondi);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        JFrame finestra = new JFrame("La mia prima finestra con JAVA!");
        finestra.setBounds(500, 500, 600, 300);

        //finestra.getContentPane().setBackground(Color.CYAN);
        Container contenuto = finestra.getContentPane();
        contenuto.setBackground(Color.CYAN);
        System.out.println(contenuto);

        JLabel label1 = new JLabel("Il mio primo applicativo SWING!");
        label1.setText("Sono cambiata");
        label1.setForeground(Color.ORANGE);
        finestra.add(label1);


        //this code is not threadsafe though, but this code is very linear even thought it is not multi thread
        pausa(2);
        finestra.setVisible(true);

        finestra.setBackground(Color.CYAN);//non cambia niente, perchè jframe è solo la cornice di cio che al suo interno
        // puo essere posto

        label1.setOpaque(true);
        label1.setBackground(Color.BLUE); //Non fa niente, perchè di default il colore di sfondo della etichetta è
        // trasparente, vogliamo renderlo opaco

        JLabel label2 = new JLabel("Seconda etichetta");
        finestra.add(label2); // non cambia nulla! ma se allargo lo schermo la vedo
        label2.setOpaque(true);
        label2.setBackground(Color.RED);

        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //non rimane nulla sospeso in gestione attività
    }
}
