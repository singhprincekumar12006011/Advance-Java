
import javax.swing.*;
public class Button1 {
    public static void main(String[] args)
    {

        //creating instance of JFrame
        JFrame f = new JFrame();

        // creating instatnce of JButton
        JButton b = new JButton("click");
        //set the size of jbutton.
        b.setBounds(130, 100, 100, 40);
        JButton b1 = new JButton("Tanu");
        b1.setBounds(130, 200, 100, 40);


        //adding button in JFrame
        f.add(b);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);


        //creating another jbutton
        
        f.add(b1);


    }
}
