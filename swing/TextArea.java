
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
public class TextArea {
    public static void main(String[] prince)
    {
        JFrame f = new JFrame("JTextArea");
        JLabel l1 = new JLabel();
        l1.setBounds(20, 20, 160, 30);
        l1.setForeground(Color.blue);

        JLabel l2 = new JLabel();
        l2.setBounds(80, 20, 200, 30);
        l2.setForeground(Color.blue);

        JTextArea ta = new JTextArea();
        ta.setBounds(60,60,170,60);
        ta.setForeground(Color.blue);

        JButton b = new JButton("Count");
        b.setBounds(120,120,100,30);
        b.setForeground(Color.blue);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String text = ta.getText();
                String words[] = text.split("\\s");
                l1.setText("Words:- "+ words.length);
                l2.setText("Character:- " + text.length());
            }
        });

        f.add(l1);
        f.add(l2);
        f.add(ta);
        f.add(b);
        f.setSize(400,400);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.getContentPane().setBackground(Color.gray);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
