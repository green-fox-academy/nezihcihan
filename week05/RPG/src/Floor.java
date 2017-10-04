import java.awt.*;

public class Floor {
    public static int TILESIZE = 72;
    int[][] board = new int[][] {
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
    public void fillFloor(Graphics graphics) {
        for (int col = 0; col < 10; col++) {
            for (int row = 0; row < 10; row++) {
                PositionedImage floor = new PositionedImage("assets/floor.png", row * TILESIZE , col *TILESIZE);
                PositionedImage wall = new PositionedImage("assets/wall.png", row * TILESIZE, col * TILESIZE);
                if (board[col][row] == 0) {
                    floor.draw(graphics);
                } else {
                    wall.draw(graphics);
                }
            }
        }
    }
    boolean isWall(int x, int y) {
        if ((board[y][x]) == 1) {
            return true;
        } else {
            return false;
        }
    }

}
