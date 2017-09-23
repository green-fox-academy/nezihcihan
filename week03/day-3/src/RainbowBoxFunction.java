import javafx.scene.control.ColorPicker;

import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.isDefaultLookAndFeelDecorated;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics){
      // create a square drawing function that takes 2 parameters:
      // the square size, and the fill color,
      // and draws a square of that size and color to the center of the canvas.
      // create a loop that fills the canvas with rainbow colored squares.
      // red, orange, yellow, green, blue, indigo, violet
        rainbow(graphics,300);
    }
    public static void rainbow(Graphics graphics, int size){
        for (int x = 1; x <8; x++) {
            Color[] ballColors = {Color.YELLOW, Color.RED, Color.GREEN, Color.YELLOW, Color.BLUE, Color.ORANGE,Color.RED};
            graphics.fillRect(x*10,x*10,size-x*20,size-x*20);
            graphics.setColor(ballColors[x-1]);
        }
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
