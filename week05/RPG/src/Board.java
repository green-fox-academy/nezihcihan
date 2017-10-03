import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Board extends JComponent implements KeyListener {
    String heroImage = "assets/hero-down.png";
    int heroX;
    int heroY;
    int[][] board = new int[][]{
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
            {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
            {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 1, 0, 0, 0}
    };

    public Board() {
        heroX = 0;
        heroY = 0;

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        //graphics.fillRect(PosX, PosY, 100, 100);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        for (int col = 0; col< 10 ; col++) {
            for (int row = 0; row < 10 ; row++) {
                    PositionedImage floor = new PositionedImage("assets/floor.png", row, col);
                    PositionedImage wall = new PositionedImage("assets/wall.png", row, col);
                if (board[row][col] == 0) {
                    floor.draw(graphics);
                } else if (board[row][col] == 1) {
                    wall.draw(graphics);
                }
            }
        }
        PositionedImage hero = new PositionedImage(heroImage, heroX, heroY);
        hero.draw(graphics);

    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }
    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            heroImage = "assets/hero-up.png";
            if (heroY != 0 && board[heroY - 1][heroX] != 1) {
                heroY -= 1;
            }
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN) {

            heroImage = "assets/hero-down.png";
            if (heroY != 9 && board[heroY + 1][heroX] != 1) {
                heroY += 1;
            }
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT) {

            heroImage = "assets/hero-left.png";
            if (heroX != 0 && board[heroY][heroX - 1] != 1) {
                heroX -= 1;
            }
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT ) {
            heroImage = "assets/hero-right.png";
            if (heroY != 9 && board[heroY][heroX + 1] != 1) {
                heroX += 1;
            }
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}
