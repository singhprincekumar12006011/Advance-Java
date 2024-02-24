
import javax.swing.*;
public class JButton1 {
    public static void main(String[] args) {
        //creating JFrame 
        JFrame f = new JFrame("JButton");
        //creating JButton
        JButton b = new JButton("Click Here");
        b.setBounds(80,100,95,30);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
