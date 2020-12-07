import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    MyFrame()
    {
        ImageIcon icon = new ImageIcon("download.png");
        ImageIcon icon2 = new ImageIcon("download.jpg");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(0, 250, 300, 300);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(0, 0, 250, 300);
        button.addActionListener(this);
        button.setText("I'm a button");
        button.setFocusable(false);//gets ride of the border of the text
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setIconTextGap(-1);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.GREEN);
        button.setBorder(BorderFactory.createEtchedBorder());
       // button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
           //System.out.println("poo");
            //button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
