import java.util.concurrent.ThreadLocalRandom;

public class Skeleton extends Character {

    public Skeleton () {
        super("assets/skeleton.png", (int) (Math.random()*9),(int) (Math.random()*9));
    }

    public void wallBlocker () {
        Board board = new Board();
        while (board.board[posX][posY] != 0) {
                this.posX = (int) (Math.random()*9);
                this.posY = (int) (Math.random()*9);
        }
    }
}
