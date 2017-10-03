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

    int heroPosX;
    int heroPosY;

    public Board() {
        heroPosX = 0;
        heroPosY = 0;

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(heroPosX, heroPosY, 100, 100);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        List<String> content = new ArrayList<>();
        Path sourcePath = Paths.get("assets/board.txt");
        try {
            content = Files.readAllLines(sourcePath);
        } catch (IOException e) {
            System.out.println("no content");
        }

        for (int row = 0; row < content.size() ; row++) {
            for (int col = 0; col < content.size() ; col++) {
                    if (content.get(col).charAt(row) == '0') {
                        PositionedImage image = new PositionedImage("assets/floor.png", row * 72, col * 72);
                        image.draw(graphics);
                    }
                    else if (content.get(col).charAt(row) == '1') {
                        PositionedImage image = new PositionedImage("assets/wall.png", row * 72, col * 72);
                        image.draw(graphics);
                    }
            }
        }
        PositionedImage hero = new PositionedImage("assets/hero-down.png", heroPosX, heroPosY);
        hero.draw(graphics);
    }
    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        // Here is how you can add a key event listener
        // The board object will be notified when hitting any key
        // with the system calling one of the below 3 methods
        frame.addKeyListener(board);
        // Notice (at the top) that we can only do this
        // because this Board class (the type of the board object) is also a KeyListener
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
        if (e.getKeyCode() == KeyEvent.VK_UP && table[heroPosY - 1] != 1) {
            heroPosY -= 1;

        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN && table[heroPosY + 1] != 1) {
            heroPosY += 1;
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT && table[heroPosY - 1] != 1) {
            heroPosX -= 1;
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT && table[heroPosY + 1] != 1) {
            heroPosX += 1;
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}
