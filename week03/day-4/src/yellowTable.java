import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class yellowTable {
    public static void mainDraw(Graphics graphics){
        // reproduce this:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]

                int xCorner = 50;
                int yCorner = 50;
                int width = 600;
                int height = 600;
                graphics.setColor(Color.YELLOW);
                graphics.fillRect(xCorner, yCorner, width, height);

                lines(graphics, xCorner, yCorner, width, height);
            }
            public static void lines(Graphics graphics, int xCorner, int yCorner, int width, int height) {
                int x1,  y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6, x7, y7, x8, y8;
                if (width == 0 && height == 0) {
                    return;
                }
                else {
                    graphics.setColor(Color.black);
                    x1 = xCorner + width / 3;
                    x2 = xCorner + 2 * width / 3;
                    y1 = yCorner;
                    y2 = y1;

                    x3 = x1;
                    x4 = x2;
                    y3 = yCorner + height;
                    y4 = y3;
                    graphics.drawLine(x1, y1, x3, y3);
                    graphics.drawLine(x2, y2, x4, y4);

                    x5 = xCorner;
                    x6 = xCorner + width;
                    y5 = yCorner + height / 3;
                    y6 = y5;

                    graphics.drawLine(x5, y5, x6, y6);
                    x7 = x5;
                    x8 = x6;
                    y7 = yCorner + 2 * height / 3;
                    y8 = y7;
                    graphics.drawLine(x7, y7, x8, y8);

                    lines(graphics, xCorner + width / 3, yCorner, width / 3, height / 3);
                    lines(graphics,  xCorner, yCorner + width / 3, width / 3, height / 3);
                    lines(graphics, xCorner + width / 3, yCorner + 2 * width / 3, width / 3, height / 3);
                    lines(graphics, xCorner + 2 * width / 3, yCorner + width / 3, width / 3, height / 3);
                }
            }

    public static int factorialWithLoop(int n) {
        int factorial = 1;
        for (int i = 1; i  < n + 1; i++) {
            factorial *= i;
        }
        return factorial;
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
