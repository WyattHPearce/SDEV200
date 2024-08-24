package Testing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Graphic extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set background color
        this.setBackground(Color.BLACK);

        // Set drawing color
        g.setColor(Color.GREEN);

        // Draw a rectangle
        g.fillRect(50, 50, 200, 100);

        // Draw a circle
        g.setColor(Color.RED);
        g.fillOval(100, 200, 100, 100);

        // Draw a line
        g.setColor(Color.BLUE);
        g.drawLine(50, 50, 300, 300);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Graphics");
        Graphic panel = new Graphic();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}