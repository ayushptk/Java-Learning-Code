import java.awt.event.*;
import javax.swing.*;

public class MouseExample extends JFrame implements MouseListener {
    JLabel label;

    MouseExample() {
        label = new JLabel("Click me");
        label.setBounds(50, 50, 200, 30);
        add(label);

        addMouseListener(this);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked by ayush");
    }

    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseExample();
    }
}
