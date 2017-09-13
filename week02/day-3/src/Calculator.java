import java.util.Scanner;
public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations:
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        System.out.println("Please type in the expression:");
        // Waits for the user input
        Scanner input = new Scanner(System.in);
        char cal = input.next().charAt(0);
        int firstNum = input.nextInt();
        int secNum = input.nextInt();
        if(cal == '+') {
            System.out.println("Your result: " + (firstNum + secNum));
        }
        else if(cal == '-') {
            System.out.println("Your result: " + (firstNum - secNum));
        }
        else if(cal == '*') {
            System.out.println("Your result: " + (firstNum * secNum));
        }
        else if(cal == '/') {
            System.out.println("Your result: " + (firstNum / secNum));
        }
        else {
            System.out.println("Your entries are not valid!");
        }
        // Print the result to the prompt
        // Exit
    }
}
