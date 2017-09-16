import java.util.Scanner;
// Write a program that reads a number from the standard input, then draws a
// square like this:
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
// The square should have as many lines as the number was
public class DrawSquare {
    public static void main(String[] args) {

    drawRectangle(userInput());

    }
    /**Method for getting user input**/
    public static int userInput(){
        System.out.println("Enter the lines of your for rectangle");
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        return lines;
    }
    /** Method for Rectangle Drawing **/
    public static void drawRectangle(int lines){
        for (int row = 0; row < lines; row++) {
            for (int col = 0; col < lines-1; col++){
                if( row > 0 && col > 0 && row < lines-1 && col < lines-2){
                    System.out.print(" ");
                }
                else {
                    System.out.print("%");
                }
            }
            System.out.println();
        }
    }
}
