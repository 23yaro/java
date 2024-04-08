import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JComponent;
public class DrawArea extends JComponent {

    // Изображение, на котором мы будем рисовать
    private Image image;
    // Объект Graphics2D используется для рисования
    private Graphics2D g2;
    // Координаты мыши
    private int currentX, currentY, oldX, oldY;

    public DrawArea() {
        setDoubleBuffered(false);
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                // сохраняем координаты x,y при нажатии мыши
                oldX = e.getX();
                oldY = e.getY();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                // координаты x,y при перетаскивании мышью
                currentX = e.getX();
                currentY = e.getY();

                if (g2 != null) {
                    // рисуем линию, если контекст g2 не равен нулю
                    g2.drawLine(oldX, oldY, currentX, currentY);
                    // обновляем область рисования для перерисовки
                    repaint();
                    // сохраняем текущие координаты x,y как старые x,y
                    oldX = currentX;
                    oldY = currentY;
                }
            }
        });
    }

    protected void paintComponent(Graphics g) {
        if (image == null) {
            // изображение для рисования null ==> создаем
            image = createImage(getSize().width, getSize().height);
            g2 = (Graphics2D) image.getGraphics();
            // включаем сглаживание
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            // очищаем область рисования
            clear();
        }

        g.drawImage(image, 0, 0, null);
    }

    public void clear() {
        g2.setPaint(Color.white);
        // рисуем белым по всей области рисования, чтобы очистить
        g2.fillRect(0, 0, getSize().width, getSize().height);
        g2.setPaint(Color.black);
        repaint();
    }

    public void red() {
        // применяем красный цвет к контексту g2
        g2.setPaint(Color.red);
    }

    public void black() {
        g2.setPaint(Color.black);
    }

    public void eraser() {
        g2.setPaint(Color.white);
    }

    public void green() {
        g2.setPaint(Color.green);
    }

    public void blue() {
        g2.setPaint(Color.blue);
    }

}