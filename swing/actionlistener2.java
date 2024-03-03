
import java.awt.event.*;
import javax.swing.*;
public class actionlistener2 {
    public static void main(String[] prince){
        JFrame f = new JFrame("FramEx");
        JButton b = new JButton("Click me");
        JTextField tf = new JTextField();
        b.setBounds(150,150,80,30);
        tf.setBounds(130,110,120,30);

        //actionlistener
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("Hello, This is Prince");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
