import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs the farmer has
        // It should print how many legs all the animals have
        System.out.print("Enter the number of chicken and pigs:\n");
        Scanner input = new Scanner(System.in);
        int chicken = input.nextInt();
        int pigs = input.nextInt();
        int legs = ((chicken*2)+(pigs*4));
        System.out.println("Total Legs are: " + legs);
    }
}