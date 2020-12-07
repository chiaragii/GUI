import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame()
    {

        this.setTitle("Jthis title goes here");//sets the title of this.setDefaultCloseOperation(Jthis.DO_NOTHING_ON_CLOSE); //exit out of application
        this.setResizable(false);//prevent this from being resized
        this.setSize(420, 420); //sets the x and y dimentions of our this
        this.setVisible(true); //makes this visible

        ImageIcon image = new ImageIcon("GUIicon.png");//create an image icon
        this.setIconImage(image.getImage());//changes the logo
        this.getContentPane().setBackground(new Color(0xFFFFFF));
    }

}
