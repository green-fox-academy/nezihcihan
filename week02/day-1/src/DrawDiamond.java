import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
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

        drawDiamond(userInput());

    }
    /**Method For User Input**/

    public static int userInput(){
        System.out.println("Enter the lines for your diamond.");
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        return lines;
    }
    /**Method for Diamond Drawing**/
    public static void drawDiamond(int lines){
        for (int row = 1; row <= lines/2+1; row++) {
            for (int space = lines/2+1; space > row  ; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star < row*2 ; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int k = 1;
        for (int row = lines/2; row > 0; row--) {
            for (int space = 1; space <= +k; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star < row*2 ; star++) {
                System.out.print("*");
            }
            k++;
            System.out.println();
        }
    }
}
