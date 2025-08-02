import javax.swing.*;
import java.awt.event.*;

public class AddNumbers implements ActionListener {
    
    JTextField t1, t2, result;
    JButton addBtn;

    AddNumbers() {
        JFrame f = new JFrame("Add Two Numbers");

        t1 = new JTextField();
        t1.setBounds(50, 30, 100, 25);

        t2 = new JTextField();
        t2.setBounds(50, 70, 100, 25);

        result = new JTextField();
        result.setBounds(50, 150, 100, 25);
        result.setEditable(false);

        addBtn = new JButton("Add");
        addBtn.setBounds(50, 110, 100, 30);
        addBtn.addActionListener(this);

        f.add(t1);
        f.add(t2);
        f.add(addBtn);
        f.add(result);

        f.setSize(250, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int sum = a + b;
        result.setText(String.valueOf(sum));
    }

    public static void main(String[] args) {
        new AddNumbers();
    }
}
