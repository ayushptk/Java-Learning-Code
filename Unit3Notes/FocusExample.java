import javax.swing.*;
import java.awt.event.*;

public class FocusExample implements FocusListener {

    JTextField field1, field2;

    FocusExample() {
        JFrame frame = new JFrame("Focus Event Example");

        field1 = new JTextField("");
        field1.setBounds(50, 50, 150, 30);
        field1.addFocusListener(this);

        field2 = new JTextField("");
        field2.setBounds(50, 100, 150, 30);
        field2.addFocusListener(this);

        frame.add(field1);
        frame.add(field2);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void focusGained(FocusEvent e) {
        System.out.println("Focus gained: " + ((JTextField)e.getSource()).getText());
    }

    public void focusLost(FocusEvent e) {
        System.out.println("Focus lost: " + ((JTextField)e.getSource()).getText());
    }

    public static void main(String[] args) {
        new FocusExample();
    }
}
