import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("BorderLayout Example");

        // Add buttons to different regions
        f.add(new JButton("North"), BorderLayout.NORTH);
        f.add(new JButton("South"), BorderLayout.SOUTH);
        f.add(new JButton("East"), BorderLayout.EAST);
        f.add(new JButton("West"), BorderLayout.WEST);
        f.add(new JButton("Center"), BorderLayout.CENTER);

        // Set frame size and make it visible
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //optional
        f.setVisible(true);
    }
}
