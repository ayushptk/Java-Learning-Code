import javax.swing.*;

public class NoLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("No Layout");
        frame.setSize(300, 200);
        frame.setLayout(null);

        JLabel label = new JLabel("Hello, I am Loshan Parajuli");
        label.setBounds(80, 70, 150, 30);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
