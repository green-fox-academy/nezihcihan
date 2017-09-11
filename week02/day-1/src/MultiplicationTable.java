import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter a number!\n");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        number = number *15;
        System.out.println("your number multiple by 15 is " + number + ".");

    }
}
