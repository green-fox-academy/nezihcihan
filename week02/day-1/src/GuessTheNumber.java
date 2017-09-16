// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
// The stored number is higher
// The stored number is lower
// You found the number: 8
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        playGame(userInput());
    }
    /** Method for User input**/
    public static int userInput(){
        System.out.println("Guess the number!");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        return guess;
    }
    /**Method for playing the game**/
    public static void playGame(int guess){

        int number = 8;
        if(guess == number) {
            System.out.println("You found the number!");
        }
        else if (guess < number){
            System.out.println("The stored number is higher.");
        }
        else if (guess > number){
            System.out.println("The stored number is lower");
        }
    }
}
