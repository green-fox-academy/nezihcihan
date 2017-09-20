import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {

    public static void mainDraw(Graphics graphics){
      // create a line drawing function that takes 2 parameters:
      // the x and y coordinates of the line's starting point
      // and draws a line from that point to the center of the canvas.
      // draw 3 lines with that function.
            drawCenter(graphics,25,25);
            drawCenter(graphics,150,50);
            drawCenter(graphics,100,65);
    }
    public static void drawCenter(Graphics graphics,int startX, int startY) {
        graphics.setColor(Color.BLUE);
        graphics.drawLine(startX, startY, 160, 171);
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
