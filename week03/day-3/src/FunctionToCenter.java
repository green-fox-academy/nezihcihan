import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

    public static void mainDraw(Graphics graphics){
      // create a line drawing function that takes 2 parameters:
      // the x and y coordinates of the line's starting point
      // and draws a line from that point to the center of the canvas.
      // fill the canvas with lines from the edges, every 20 px, to the center.
        line(graphics,20, 25);
        /**for (int i = 0; i < 320; i +=20) {
            graphics.drawLine(i,0,160,170);
        }
        for (int i = 0; i < 320 ; i +=20) {
            graphics.drawLine(320,i,160,170);
        }
        for (int i = 320; i > 0 ; i -=20) {
            graphics.drawLine(i,320,160,170);
        }
        for (int i = 320; i > 0 ; i -=20) {
            graphics.drawLine(0,i,160,170);
        }**/
    }
    public static void line(Graphics graphics, int x, int y) {

        for (int i = x; i < 320 - (x); i += 20) {
            graphics.drawLine(i, y, 160, 160);
        }
        for (int i = y; i < 320 - (y); i += 20) {
            graphics.drawLine(320 - (x), i, 160, 160);
        }
        for (int i = 320 - x; i > 0; i -= 20) {
            graphics.drawLine(i, 320 - y, 160, 160);
        }
        for (int i = 320 - y; i > 0; i -= 20) {
            graphics.drawLine(x, i, 160, 160);
        }
    }
    public static void draw(Graphics graphics,int a, int b){
        graphics.setColor(Color.BLUE);
        graphics.drawLine(a, b,160,170);
    }

//    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
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
