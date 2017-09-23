import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

    public static void mainDraw(Graphics graphics){
      // create a line drawing function that takes 2 parameters:
      // the x and y coordinates of the line's starting point
      // and draws a line from that point to the center of the canvas.
      // fill the canvas with lines from the edges, every 20 px, to the center.
        line(graphics,120, 20);
    }
    public static void line(Graphics graphics, int x, int y) {
        int w = 600;
        int h =600;
        for (int i = x; i < w - x; i += 20) {/**Top part**/
            graphics.setColor(Color.RED);
            graphics.drawLine(i, y, w/2, h/2);
        }
        for (int i = y; i < h- (y); i += 20) { /**left part**/
            graphics.setColor(Color.BLUE);
            graphics.drawLine(w - x, i, w/2, h/2);
        }
        for (int i = x; i <= w - x; i += 20) {/**down part**/
            graphics.setColor(Color.GREEN);
            graphics.drawLine(i, h - y, w/2, h/2);
        }
        for (int i = y; i <= h- y ; i += 20) {/** right part**/
            graphics.setColor(Color.BLACK);
            graphics.drawLine(x, i, w/2, h/2);
        }
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
