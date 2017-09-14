// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
// The diamond should have as many lines as the number was
public class DrawDiamond {
    public static void main(String[] args) {
        for (int i = 1; i < 8; i += 2) {
            for (int j = 0; j < 7 - i / 2; j++)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
        for (int i = 5; i > 0; i -= 2) {
            for (int j = 0; j < 7 - i / 2; j++)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
