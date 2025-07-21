import javax.swing.*;

public class MenuDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Menu Demo");

        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem i1 = new JMenuItem("Open");
        JMenuItem i2 = new JMenuItem("Save");
        JMenuItem i3 = new JMenuItem("Exit");

        menu.add(i1); menu.add(i2); menu.add(i3);
        mb.add(menu);

        f.setJMenuBar(mb);
        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
