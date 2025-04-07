package wk_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeDrawing extends JPanel implements ActionListener {
    private static final int CIRCLE = 0;
    private static final int SQUARE = 1;
    private static final int TRIANGLE = 2;

    private int currentShape = CIRCLE;
    private Timer timer;

    public ShapeDrawing() {
        timer = new Timer(1000, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        switch (currentShape) {
            case CIRCLE:
                drawCircle(g);
                break;
            case SQUARE:
                drawSquare(g);
                break;
            case TRIANGLE:
                drawTriangle(g);
                break;
        }
    }

    private void drawCircle(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(50, 50, 100, 100);
    }

    private void drawSquare(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(50, 50, 100, 100);
    }

    private void drawTriangle(Graphics g) {
        g.setColor(Color.BLUE);
        int[] xPoints = {50, 150, 100};
        int[] yPoints = {150, 150, 50};
        g.fillPolygon(xPoints, yPoints, 3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentShape = (currentShape + 1) % 3;
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Drawing");
        ShapeDrawing shapeDrawing = new ShapeDrawing();
        frame.add(shapeDrawing);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
