
import javax.swing.*;
import java.awt.*;
class Jlabel{
    public static void main(String[] Prince) {
        //creating JFrame 
        JFrame  f = new JFrame("JLabel");

        //creating JLabel
        JLabel l = new JLabel("Label Example..");
        l.setBounds(50,50,100,30);
        f.add(l);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}