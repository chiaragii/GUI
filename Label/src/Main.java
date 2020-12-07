import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("download2.jpg");
        Border border = BorderFactory.createLineBorder(Color.green, 3);



        JLabel label = new JLabel();// create a new label
        label.setText("Bro, do you even code?");//sets text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//sets text LEFT, CENTER, RIGHT of imagicon
        label.setVerticalTextPosition(JLabel.TOP);//sets text TOP, CENTER, BOTTOM of icon
        label.setForeground(new Color(0x000FF00));//set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN, 20));// set font of text
        label.setIconTextGap(-25);//sets the gap if text to image
        label.setBackground(Color.black);//sets background color
        label.setOpaque(true); //displays background color
        label.setBorder(border);//sets the border to green
        label.setVerticalAlignment(JLabel.CENTER);//sets the vertical position of icon.text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text within label
        //label.setBounds(100, 100, 350, 350);//sets x and y positions within frame as well as dimentios

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();//it has to be after everything

    }
}
