import java.awt.*;

public class Floor {

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
                PositionedImage floor = new PositionedImage("assets/floor.png", row, col);
                PositionedImage wall = new PositionedImage("assets/wall.png", row, col);
                if (board[col][row] == 0) {
                    floor.draw(graphics);
                } else {
                    wall.draw(graphics);
                }
            }
        }
    }
}
