import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Circle2 {
    public static void mainDraw(Graphics graphics) {
        circleRecursion(graphics, 300, 300, 600);
    }
    public static void circleRecursion(Graphics graphics, int x, int y, int size) {
        if (size < 10) {
        }
        else {
            graphics.drawOval(x - (size / 2), y - (size / 2), size, size);
            graphics.setColor(Color.BLACK);

            circleRecursion(graphics, x, y - (size / 4), size / 2);
            graphics.setColor(Color.BLACK);

            circleRecursion(graphics, x- (int) (size / 4 * Math.cos(Math.toRadians(30))),
                   y + (int) (size / 4 * Math.sin(Math.toRadians(30))), size / 2);
            graphics.setColor(Color.BLACK);

            circleRecursion(graphics, x+ (int) (size / 4 * Math.cos(Math.toRadians(30))),
                    y + (int) (size / 4 * Math.sin(Math.toRadians(30))), size / 2);
        }
    }
    //    Don't touch the code below

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(700, 700));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}