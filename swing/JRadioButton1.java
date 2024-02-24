
import javax.swing.*;

import java.awt.Label;
import java.awt.event.*;
public class JRadioButton1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("JRadioButton");
        JRadioButton rb1 = new JRadioButton("Married");
        rb1.setBounds(20,30,100,30);
        JRadioButton rb2 = new JRadioButton("Un-Married");
        rb2.setBounds(20,50,100,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        JLabel lb = new JLabel();
        lb.setBounds(20,140,150,30);
        JButton b = new JButton("Marrital Status");
        b.setBounds(20,200,200,30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(rb1.isSelected())
                {
                    lb.setText("You are married");
                }
                if(rb2.isSelected())
                {
                    lb.setText("You are un-married");
                }
            }
        });
        f.add(rb1);
        f.add(rb2);
        f.add(lb);
        f.add(b);
        f.setSize(400,400);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
