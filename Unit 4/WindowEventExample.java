import java.awt.*;
import java.awt.event.*;

public class WindowEventExample extends Frame {
    WindowEventExample() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing soon in vs code editor");
                dispose();
            }
        });

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WindowEventExample();
    }
}

