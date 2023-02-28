import javax.swing.*;
import java.awt.*;

public class ColorDemo extends JFrame {

    public ColorDemo() {

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.setOpaque(true);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.setOpaque(true);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);
        panel3.setOpaque(true);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.WHITE);
        panel4.setOpaque(true);
       
        
        setLayout(new GridLayout(3, 1));
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorDemo();
    }
}
