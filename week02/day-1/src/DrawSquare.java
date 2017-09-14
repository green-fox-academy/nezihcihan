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
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++){
                if( i > 0 && j > 0 & i < 5 && j < 5){
                    System.out.print(" ");
                }
                else {
                    System.out.print("%");
                }
            }
            System.out.println(" ");
        }
    }
}
