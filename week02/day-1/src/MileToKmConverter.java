import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        System.out.println("Enter distance in km.");
        Scanner input = new Scanner(System.in);
        int distance = input.nextInt();
        double miles = distance / 1.6;
        System.out.println("Distance in miles is " + miles + "!");
    }
}