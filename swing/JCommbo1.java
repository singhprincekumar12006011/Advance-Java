import javax.swing.*;
import java.awt.event.*;
public class JCommbo1 {
    JFrame f;
    JCommbo1()
    {
        f = new JFrame("JComboBox");
        String color[] = {"Red", "Green","Blue","Yellow","Magenta","Cyan"};
        JComboBox cb = new JComboBox<String>(color);
        cb.setBounds(30,50,100,30);
        f.add(cb);
        f.setSize(400,400);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new JCommbo1();
    }
}
