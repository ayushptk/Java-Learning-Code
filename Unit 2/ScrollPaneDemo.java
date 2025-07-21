import javax.swing.*;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("JScrollPane Example");

        JTextArea area = new JTextArea(10, 30);
        area.setText("This is a sample text");

        JScrollPane sp = new JScrollPane(area);
        f.add(sp);

        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
