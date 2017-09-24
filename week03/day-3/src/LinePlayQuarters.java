import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

    public static void mainDraw(Graphics graphics){
      // divide the canvas into 4 parts
      // and repeat this pattern in each quarter:
      // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]
        int a = 0;
        int b = 0;
        int w = 600;
        int h = 600;
        graphics.setColor(Color.BLACK);
        graphics.drawRect(a, b, w / 2, w / 2);
        int x = 0;
        int y = 0;
        for (int i = 0; i < 16; i++) {
            graphics.setColor(Color.PINK);
            graphics.drawLine(x, 0, 300, y);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, y, x, 300);
            x += 20;
            y += 20;
        }
        graphics.drawRect(w / 2, b, w / 2, h / 2);
        int x2 = 300;
        int y2 = 0;
        for (int i = 0; i < 16; i++) {
            graphics.setColor(Color.PINK);
            graphics.drawLine(x2, 0, 600, y2);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(300, y2, x2, 300);
            x2 += 20;
            y2 += 20;
        }
        graphics.drawRect(a, w / 2, w / 2, h / 2);
        int x3 = 0;
        int y3 = 300;
        for (int i = 0; i < 16; i++) {
            graphics.setColor(Color.PINK);
            graphics.drawLine(x3, 300, 300, y3);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, y3, x3, 600);
            x3 += 20;
            y3 += 20;
        }
        graphics.drawRect(w / 2, h / 2, w / 2, h / 2);
        int x4 = 300;
        int y4 = 300;
        for (int i = 0; i < 16; i++) {
            graphics.setColor(Color.PINK);
            graphics.drawLine(x4, 300, 600, y4);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(300, y4, x4, 600);
            x4 += 20;
            y4 += 20;
        }
        graphics.setColor(Color.BLACK);
    }



    //    Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
