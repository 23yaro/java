import javax.swing.*;
import java.awt.*;

public class ShapesDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Shape line = new Line(1.0,2.0);
        Shape circle = new Circle(1,2);
        Shape rectangle = new Rectangle(2.0,2.0,2.0);

        // Рисуем линию
        g.setColor(Color.GREEN);
        g.drawLine(350, 50, 450, 150);

        // Рисуем круг
        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 100, 100);

        // Рисуем квадрат
        g.setColor(Color.GREEN);
        g.fillRect(350, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ShapesDrawing());
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
