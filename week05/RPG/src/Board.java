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


    int tileSize;
    Floor tiles = new Floor();

    Hero hero = new Hero(0,0);
    Skeleton skeleton1;
    Skeleton skeleton2;
    Skeleton skeleton3;
    Boss boss;

    public Board() {
        tileSize = 72;
        skeleton1= new Skeleton();
        skeleton2= new Skeleton();
        skeleton3= new Skeleton();
        boss = new Boss();

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 850));
        setVisible(true);
    }
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        //graphics.fillRect(PosX, PosY, 100, 100);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        tiles.fillFloor(graphics);


        hero.draw(graphics);

        skeleton1.draw(graphics);

        skeleton2.draw(graphics);

        skeleton3.draw(graphics);
        boss.draw(graphics);

        graphics.setColor(Color.WHITE);
        graphics.fillRect(0,720,720,130);
        Font myFont = new Font("LucidaSans", Font.PLAIN, 70);
        graphics.setColor(Color.BLACK);
        graphics.setFont (myFont);
        graphics.drawString("ANYTHING",0,100);
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
        int x = hero.posX / tileSize;
        int y = hero.posY / tileSize;
        if (e.getKeyCode() == KeyEvent.VK_UP && hero.posY >= tileSize && !tiles.isWall(x, y - 1)) {
            hero.moveUp();

        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN && hero.posY < tileSize * 9 && !tiles
                .isWall(x, y + 1)) {
            hero.moveDown();

        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT  && hero.posX >= tileSize && !tiles.isWall(x - 1, y)) {
            hero.moveLeft();

        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT && hero.posX < tileSize * 9 && !tiles.isWall(x + 1, y)) {
            hero.moveRight();

        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}
