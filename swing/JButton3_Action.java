
import javax.swing.*;
import java.awt.event.*;
public class JButton3_Action {
    public static void main(String[] args) {
        JFrame f = new JFrame("JFrame");
        JButton b = new JButton("Click here");
        JTextField tf = new JTextField();
        tf.setBounds(50,50,150,20);
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("Hi, This is Prince..");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
