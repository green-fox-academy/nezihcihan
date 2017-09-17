import java.util.Random;
import java.util.Scanner;
public class GuessMyNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int low = 1;
        int max = 100;
        int result =r.nextInt(max - low ) + low;
        System.out.println("Guess my Number!");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        if (result > guess){
            System.out.println("too low.");
        }
        if (result < guess){
            System.out.println("too high.");
        }
        if (result == guess){
            System.out.println("you won");
        }
    }
}
