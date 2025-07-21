import javax.swing.*;

public class GroupLayoutButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GroupLayout");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click Me");

        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(button));
        layout.setVerticalGroup(layout.createSequentialGroup().addComponent(button));

        frame.add(panel);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
