
import java.awt.event.*;
import javax.swing.*;

public class aActionListener1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener Example");
        JButton button = new JButton("Click me!");
        button.setBounds(150, 150, 100, 30); // Adjusted button size

        // Creating actionListener
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Display message on the window
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        frame.add(button);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

