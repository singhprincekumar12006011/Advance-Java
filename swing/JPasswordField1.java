import javax.swing.*;
/**
 * JPasswordField
 */
public class JPasswordField1 {

    public static void main(String[] args) {
        JFrame f = new JFrame("Password");

        JLabel l = new JLabel("Password");
        JPasswordField pf = new JPasswordField();
        l.setBounds(20,100,80,30);
        pf.setBounds(100,100,80,30);
        f.add(l);
        f.add(pf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}