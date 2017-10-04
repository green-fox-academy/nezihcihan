import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PositionedImage {

    private static int WITDH = 72;
    private static int HEIGHT = 72;

    BufferedImage image;
    int posX, posY;

    public PositionedImage(String filename, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX * WITDH, posY * HEIGHT, null);
        }
    }
}
