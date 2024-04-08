import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingPaint {

    JButton clearBtn, blackBtn, blueBtn, greenBtn, redBtn, eraserBtn, emptyBtn;
    DrawArea drawArea;
    ActionListener actionListener = new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == clearBtn) {
                drawArea.clear();
            } else if (e.getSource() == blackBtn) {
                drawArea.black();
            } else if (e.getSource() == blueBtn) {
                drawArea.blue();
            } else if (e.getSource() == greenBtn) {
                drawArea.green();
            } else if (e.getSource() == redBtn) {
                drawArea.red();
            } else if (e.getSource() == eraserBtn) {
                drawArea.eraser();
            }
        }
    };

    public static void main(String[] args) {
        new SwingPaint().show();
    }

    public void show() {
        // создаем основной кадр
        JFrame frame = new JFrame("Swing Paint");
        Container content = frame.getContentPane();
        // устанавливаем макет на панели
        content.setLayout(new BorderLayout());
        // создаем область рисования
        drawArea = new DrawArea();

        // добавляем на панель
        content.add(drawArea, BorderLayout.CENTER);

        // создаем элементы управления для применения цветов и вызова функции очистки
        JPanel controls = new JPanel();

        clearBtn = new JButton("Clear");
        clearBtn.addActionListener(actionListener);
        blackBtn = new JButton("Black");
        blackBtn.addActionListener(actionListener);
        blueBtn = new JButton("Blue");
        blueBtn.addActionListener(actionListener);
        greenBtn = new JButton("Green");
        greenBtn.addActionListener(actionListener);
        redBtn = new JButton("Red");
        redBtn.addActionListener(actionListener);
        eraserBtn = new JButton("Eraser");
        eraserBtn.addActionListener(actionListener);

        emptyBtn = new JButton();
        emptyBtn.setOpaque(false);
        emptyBtn.setContentAreaFilled(false);
        emptyBtn.setBorderPainted(false);

        // добавляем на панель
        controls.add(blackBtn);

        controls.add(redBtn);
        controls.add(greenBtn);
        controls.add(blueBtn);

        controls.add(emptyBtn);

        controls.add(eraserBtn);
        controls.add(clearBtn);

        // добавляем на панель
        content.add(controls, BorderLayout.NORTH);

        frame.setSize(1920, 1280);
        // можем закрыть фрейм
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // показываем результат рисования свинга
        frame.setVisible(true);
    }

}