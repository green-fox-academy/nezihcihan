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
    String heroImage = "hero-down.png";
    int PosX;
    int PosY;
    List<String> content = new ArrayList<>();
    public Board() {
        PosX = 0;
        PosY = 0;

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(PosX, PosY, 100, 100);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

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
        PositionedImage hero = new PositionedImage("assets/"+ heroImage, PosX, PosY);
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
            PosY -= 72;
            heroImage = "hero-up.png";
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            PosY += 72;
            heroImage = "hero-down.png";
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            PosX -= 72;
            heroImage = "hero-left.png";
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT ) {
            PosX += 72;
            heroImage = "hero-right.png";
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}
