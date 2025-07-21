import javax.swing.*;
import java.awt.*;         // ✅ Add this import for FlowLayout
import java.awt.event.*;


public class KeyExample extends JFrame implements KeyListener {
    JLabel label;

    KeyExample() {
        label = new JLabel("Press a key");
        add(label);
        addKeyListener(this);

        setSize(200, 100);
        setLayout(new FlowLayout()); // ✅ Now FlowLayout will work
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void keyTyped(KeyEvent e) {
        label.setText("Key: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new KeyExample();
    }
}
