import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutDemo {
    static JButton prev, next;
    static CardLayout cl;
    static JPanel p;
    static JComboBox<String> jcb;

    public static void main(String prince[]) {
        JFrame f = new JFrame("My Cards");
        f.setSize(800, 700);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel();
        cl = new CardLayout();
        p.setLayout(cl);
        f.add(p);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.RED);
        p.add(p1, "Red");

        JPanel p2 = new JPanel();
        p2.setBackground(Color.GREEN);
        p.add(p2, "Green");

        JPanel p3 = new JPanel();
        p3.setBackground(Color.CYAN);
        p.add(p3, "Cyan");

        JPanel p4 = new JPanel();
        p4.setBackground(Color.YELLOW);
        p.add(p4, "Yellow");

        JPanel p5 = new JPanel();
        p5.setBackground(Color.MAGENTA);
        p.add(p5, "Magenta");

        JPanel buttons = new JPanel();
        prev = new JButton("Preview");
        next = new JButton("Next");
        buttons.add(prev);
        buttons.add(next);
        f.add(buttons, BorderLayout.SOUTH);

        String color[] = { "Red", "Green", "Blue", "Yellow", "Magenta", "Cyan" };
        jcb = new JComboBox<String>(color);
        buttons.add(jcb);

        MyListener ml = new MyListener();
        prev.addActionListener(ml);
        next.addActionListener(ml);
        jcb.addActionListener(ml);

        f.setVisible(true);
    }
}

class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == CardLayoutDemo.prev) {
            CardLayoutDemo.cl.previous(CardLayoutDemo.p);
        } else if (e.getSource() == CardLayoutDemo.next) {
            CardLayoutDemo.cl.next(CardLayoutDemo.p);
        } else if (e.getSource() == CardLayoutDemo.jcb) {
            String selected = (String) CardLayoutDemo.jcb.getSelectedItem();
            CardLayoutDemo.cl.show(CardLayoutDemo.p, selected);
        }
    }
}
