import java.util.Scanner;

public class CountFromTo {
    // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
// If it is bigger it should count from the first number to the second by one
// example:
// first number: 3, second number: 6, should print:
// 3
// 4
// 5
    public static void main(String[] args) {
        System.out.println("Enter two numbers!\n");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num2 > num1){
            System.out.println("The second number should be bigger\n");
            System.out.println("First number: " + num1 + "\nSecond number: " + num2);
        }
        else{
            System.out.println("The second number should be smaller!\n");
        }

    }
}
