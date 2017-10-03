import javax.imageio.IIOImage;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameObject {
    //Constant variables
    private static final int WIDTH = 72;
    private static final int HEIGHT = 72;
    // Fields
    BufferedImage image;
    int posX;
    int posY;
    //Constructors
    public GameObject() {}
    public GameObject(BufferedImage image, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.image = image;
    }



}
