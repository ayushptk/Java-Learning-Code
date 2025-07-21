import javax.swing.*;

public class CheckRadioDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Checkbox & RadioButton");

        JCheckBox cb1 = new JCheckBox("Java");
        cb1.setBounds(50, 50, 100, 30);
       

        JRadioButton rb1 = new JRadioButton("Male");
        rb1.setBounds(200, 50, 100, 30);
      

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
       

        f.add(cb1); 
        f.add(rb1); 

        f.setSize(400, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
