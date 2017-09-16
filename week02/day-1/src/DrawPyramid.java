import java.util.Scanner;
// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//   *
//  ***
// *****
//*******// The pyramid should have as many lines as the number was
public class DrawPyramid {
    public static void main(String[] args) {
        drawPramid(takeInput());
    }

    //Method for User Input
    public static int takeInput() {
        System.out.println("Enter a number for the lines of your pyramid.");
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        return lines;
    }

    //Method for Drawing Pyramid
    public static void drawPramid(int lines){
        for (int row = 1; row <= lines ; row++) {
            for (int space = lines;  row < space; space--) {
                System.out.print(" ");
            }
            for (int stars = 1; stars < row*2 ; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
