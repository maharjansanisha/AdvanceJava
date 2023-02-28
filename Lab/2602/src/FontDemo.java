import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FontDemo extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Set the font and color
        Font font = new Font("Arial", Font.BOLD, 36);
        g.setFont(font);
        g.setColor(Color.BLUE);
        // Draw text
        g.drawString("This is Arial.", 50, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Font Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.add(new FontDemo());
        frame.setVisible(true);
    }
}
