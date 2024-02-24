import javax.swing.*;
class frameEx {
    public static void main(String[] args)
    {
        //creating instance of JFrame
        JFrame f = new JFrame();

        //creating instance of Jbutton
        JButton jb = new JButton("click");
        jb.setBounds(130,100,100,40);
        f.add(jb);
        f.setSize(600,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}