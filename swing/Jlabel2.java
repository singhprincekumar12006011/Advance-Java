
import javax.swing.*;
public class Jlabel2 {
    public static void main(String[] Prince)
    {
        //creating JFramex
        JFrame f = new JFrame("Java Frame");

        // creating JLabel 
        JLabel l = new JLabel("Java Label");
        l.setBounds(50,50,100,30);
        f.add(l);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
