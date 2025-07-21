import javax.swing.*;

public class TextFieldDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Text Fields Example");
        f.setSize(400, 300);
        f.setLayout(null);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(20, 20, 80, 30);
        JTextField tf = new JTextField();
        tf.setBounds(100, 20, 200, 30);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(20, 60, 80, 30);
        JPasswordField pf = new JPasswordField();
        pf.setBounds(100, 60, 200, 30);

        JLabel l3 = new JLabel("Address:");
        l3.setBounds(20, 100, 80, 30);
        JTextArea ta = new JTextArea();
        ta.setBounds(100, 100, 200, 100);

        f.add(l1); f.add(tf);
        f.add(l2); f.add(pf);
        f.add(l3); f.add(ta);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
