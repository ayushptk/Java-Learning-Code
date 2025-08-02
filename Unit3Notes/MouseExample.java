import javax.swing.*;
import java.awt.event.*;

public class MouseExample extends JFrame implements MouseListener {

    JLabel label;

    MouseExample() {
        label = new JLabel("Mouse Event Demo");
        label.setBounds(100, 100, 200, 30);
        add(label);

        addMouseListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at ");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered Window");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited Window");
    }

    public static void main(String[] args) {
        new MouseExample();
    }
}
