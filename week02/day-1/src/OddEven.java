import java.util.Scanner;

public class OddEven {
    // Write a program that reads a number form the standard input,
// Than prints "Odd" if the number is odd, or "Even" it it is even.
    public static void main(String[] args) {
        System.out.println("Enter a number!\n");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 ==0) {
            System.out.println("Your number is even\n");
        }
        else {
            System.out.println("Your number is odd\n");
        }


    }

}
