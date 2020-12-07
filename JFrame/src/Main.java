import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        //JFrame = a GUI window to add components to

        /*JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("JFrame title goes here");//sets the title of frame
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //exit out of application
        frame.setResizable(false);//prevent frame from being resized
        frame.setSize(420, 420); //sets the x and y dimentions of our frame
        frame.setVisible(true); //makes frame visible

        ImageIcon image = new ImageIcon("GUIicon.png");//create an image icon
        frame.setIconImage(image.getImage());//changes the logo
        frame.getContentPane().setBackground(new Color(0xFFFFFF));//change the color of background
        // 0, 0, 0 is black;
        // 255, 255, 255 is white;
        // 255, 0, 255 is red;
        // 0, 255, 0 is green;
        // 0, 0, 255 is blue;
        //0x000000 is black;
        //0xFFFFFF is white;
        //0x123456 is dark blue;*/

        MyFrame myframe = new MyFrame();

    }
}
