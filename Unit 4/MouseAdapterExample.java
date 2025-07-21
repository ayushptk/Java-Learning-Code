import java.awt.*;
import java.awt.event.*;

public class MouseAdapterExample extends Frame {
    MouseAdapterExample() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked by Ayush Pathak");
            }
        });

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}
