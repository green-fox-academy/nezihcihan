import java.util.Scanner;

public class OneTwoALot {
    // Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot
    public static void main(String[] args) {
        System.out.println("Enter a number!\n");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number  < 0) {
            System.out.println("Your number is not enough\n");
        }
        if (number  ==1) {
            System.out.println("Your number is 1\n");
        }
        if(number == 2){
            System.out.println("Your number is 2\n");
        }
        if(number > 2){
            System.out.println("Your number is a lot!\n");
        }



    }

}
