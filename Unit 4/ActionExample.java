import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("ActionListener");
        JButton b = new JButton("Click Me");
        b.setBounds(100, 100, 100, 40);

        b.addActionListener(e -> JOptionPane.showMessageDialog(f, "Button Clicked!"));

        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
