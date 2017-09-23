import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Circle2 {
    public static void mainDraw(Graphics g) {
        int xCoor = 0;
        int yCoor = 0;
        int width = 600;
        int height = 600;
        circles(g,xCoor,yCoor,width,height);
    }

    public static void circles(Graphics g, int xCoor, int yCoor, int width, int height){
        if(width < 10 && height <10){
            return;
        }
        else {
            g.fillOval(xCoor,yCoor,width,height);
            g.drawOval(xCoor, yCoor, width, height);
            g.setColor(Color.GRAY);
            g.setColor(Color.orange);
            circles(g,xCoor + width / 16, yCoor + height / 12 * 5, width / 2, height / 2);
            g.setColor(Color.WHITE);
            circles(g,xCoor + width / 4, yCoor, width / 2, height / 2);
            g.setColor(Color.RED);
            circles(g,xCoor + width / 16 * 7, yCoor + height / 12 * 5, width / 2, height / 2);
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