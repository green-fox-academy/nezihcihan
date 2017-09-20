import javafx.scene.control.ColorPicker;

import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics){
      // create a square drawing function that takes 2 parameters:
      // the square size, and the fill color,
      // and draws a square of that size and color to the center of the canvas.
      // create a loop that fills the canvas with rainbow colored squares.
        //drawSquare(graphics,50,"BLACK");
        String []color = {"Color.GREEN", "ORANGE", "YELLOW", "RED"};

        for (int y = 0; y < 4 ; y++) {
            for (int x = 0; x < 4 ; x++) {
                graphics.fillRect(x*80,y*80,80,80);
                graphics.setColor(Color.getColor(color[y]));
            }
        }



        //}
    }
    public static void drawSquare(Graphics graphics,int size, String color){

        graphics.fillRect(135-size,146-size,size,size);
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
