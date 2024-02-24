
import javax.swing.*;
import java.awt.event.*;
public class JButtonAction4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("JFrame");
        JButton b = new JButton("Click Here");
        //creating textfield
        JTextField tf = new JTextField();
        tf.setBounds(50,50,150,30);
        b.setBounds(50,100,90,40);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("Hello, This is Prince...");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
