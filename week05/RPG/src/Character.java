public class Character extends PositionedImage {

    double hp, dp, sp;
    int level;
    int d6;


    public Character(String filename, int posX, int posY) {
        super(filename,posX,posY);
        this.level = 1;
        d6 = (int) (Math.random() * 6);
    }
    public int getLevel() {
        return level;
    }
    public void moveUp() {
        this.posY -= TILESIZE;
    }
    public void moveDown() {
        this.posY += TILESIZE;
    }
    public void moveLeft() {
        this.posX -= TILESIZE;
    }
    public void moveRight() {
        this.posX += TILESIZE;
    }
}
