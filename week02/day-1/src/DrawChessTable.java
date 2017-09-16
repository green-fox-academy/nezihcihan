// Crate a program that draws a chess table like this
// % % % %
//  % % % %
// % % % %
//  % % % %
import java.util.Scanner;
public class DrawChessTable {
    public static void main(String[] args) {
    drawTable(userInput());
    }
    /**METHOD for User Input**/
    public static int userInput(){
        System.out.println("Enter the line number of your table.");
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        return lines;
    }
    /**METHOD for Drawing Table**/
    public static void drawTable(int lines){
        for (int row = 0; row < lines; row++) {
            for (int col = 0; col < lines/2; col++){
                if(row==0 || row % 2 == 0){
                    System.out.print("% ");
                }
                else{
                    System.out.print(" %");
                }
            }
            System.out.println();
        }
    }
}
