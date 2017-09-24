import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

    public static void mainDraw(Graphics graphics){
      // create a function that takes 1 parameter:
      // an array of {x, y} points
      // and connects them with green lines.
      // connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
      // connect these: {{{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
      // {120, 100}, {85, 130}, {50, 100}}

        int[] leftUp = {10, 10};
        int[] rightUp = {290,10};
        int[] leftDown = {290, 290};
        int[] rightDown = {10, 290};
        ArrayList<int[]> box = new ArrayList<>(Arrays.asList(leftUp,leftDown,rightDown,rightUp));

        int[] dot1 = {50, 100};
        int[] dot2 = {70, 70};
        int[] dot3 = {80, 90};
        int[] dot4 = {50, 100};
        int[] dot5 = {100, 70};
        int[] dot6 = {120, 100};
        int[] dot7 = {85, 130};
        int[] dot8 = {50, 100};
        ArrayList<int[]> dots = new ArrayList<>(Arrays.asList(dot1,dot2,dot3,dot4,dot5,dot6,dot7,dot8));
        graphics.setColor(Color.BLACK);
        //drawDots(graphics, dots);
        drawDots(graphics, box);
    }
    public static void drawDots (Graphics graphics,ArrayList<int[]> dots){
        for (int i = 0; i < dots.size() ; i++) {

        }

    }

    //public static void dots(Graphics g,int[] a){
      //  a = new int[8];
        //g.setColor(Color.BLACK);

    //}

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


// create a 300x300 canvas.
