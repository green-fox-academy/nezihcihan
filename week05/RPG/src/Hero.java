import java.awt.*;

public class Hero extends Character {
    int moveCount;

    public Hero() {
        super("assets/hero-down.png",0,0);
        this.hp = 20 + 3 * d6;
        this.dp = 2 * d6;
        this. sp = 5+ d6;
        moveCount = 0;
    }
    public void moveUp() {
        this.posY -= TILESIZE;
        setImage("assets/hero-up.png");
        moveCount++;
    }
    public void moveDown() {
        this.posY += TILESIZE;
        setImage("assets/hero-down.png");
        moveCount++;
    }

    public void moveLeft() {
        this.posX -= TILESIZE;
        setImage("assets/hero-left.png");
        moveCount++;
    }

    public void moveRight() {
        this.posX += TILESIZE;
        setImage("assets/hero-Right.png");
        moveCount++;
    }
}
