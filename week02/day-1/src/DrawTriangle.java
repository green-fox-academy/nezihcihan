import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        // The triangle should have as many lines as the number was
        System.out.println("Enter a number for your triangle!\n");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(int i = 0; i <= a; i++) {
            for (int j = 0; j <= a; j++) {
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }
}

