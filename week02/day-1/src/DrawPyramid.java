// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//    *
//   ***
//  *****
// ******* // The pyramid should have as many lines as the number was
public class DrawPyramid {
    public static void main(String[] args) {
        int rows = 4;
        int rowCount = 1;
        for (int i = rows; i > 0; i--) {
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print("* ");
            }
            for (int j = rowCount-1; j >= 1; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
            rowCount++;
        }
    }
}