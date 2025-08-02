import javax.swing.*;
import java.awt.event.*;

public class KeyAddSub implements KeyListener {

    JTextField t1, t2, result;
    JLabel instruction;

    KeyAddSub() {
        JFrame f = new JFrame("Add/Subtract Using Key");

        // Instruction Label
        instruction = new JLabel("Press 'a' to add, 's' to subtract");
        instruction.setBounds(30, 5, 200, 20);
        
        t1 = new JTextField("");
        t1.setBounds(50, 30, 100, 25);
        t1.addKeyListener(this);

        t2 = new JTextField("");
        t2.setBounds(50, 70, 100, 25);
        t2.addKeyListener(this);

        result = new JTextField("Result will appear here");
        result.setBounds(50, 130, 150, 25);
        result.setEditable(false);

        // Add components to frame
        f.add(instruction);
        f.add(t1);
        f.add(t2);
        f.add(result);

        f.setSize(250, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void keyPressed(KeyEvent e) {
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            char key = e.getKeyChar();

            if (key == 'a' || key == 'A') {
                result.setText("Sum = " + (a + b));
            } else if (key == 's' || key == 'S') {
                result.setText("Diff = " + (a - b));
            }
        } catch (NumberFormatException ex) {
            result.setText("Enter valid numbers");
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new KeyAddSub();
    }
}
