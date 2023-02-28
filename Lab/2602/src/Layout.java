import javax.swing.*;
import java.awt.*;

public class Layout {

    public static void main(String[] args) {
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton centerButton = new JButton("Center");

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(northButton, BorderLayout.NORTH);
        panel.add(eastButton, BorderLayout.EAST);
        panel.add(westButton, BorderLayout.WEST);
        panel.add(southButton, BorderLayout.SOUTH);
        panel.add(centerButton, BorderLayout.CENTER);

        JOptionPane.showMessageDialog(null, panel);
    }
}
