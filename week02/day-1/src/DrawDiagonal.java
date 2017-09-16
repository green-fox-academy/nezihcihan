// Write a program that reads a number from the standard input,
// then draws a square like this:
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
// The square should have as many lines as the number was
import java.util.Scanner;
public class DrawDiagonal {
    public static void main(String[] args) {
        drawDiagonal(userInput());
    }

    /**Method for User Input**/
    public static int userInput(){
        System.out.println("enter the line numbers for your diagonal.\n");
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        return lines;
    }

    /**Method for Drawing Diagonal**/
    public static void drawDiagonal(int lines){
        for (int row = 0; row < lines ; row++) {
            for (int col = 0; col < lines; col++) {
                if (row > 0 && row < lines - 1 && col > 0 && col < lines - 1 && row != col) {
                    System.out.print(" ");
                } else {
                    System.out.print("%");
                }
            }
            System.out.println();
        }
    }
}
