import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        // - Create a function called `factorio`
        //   that returns it's input's factorial



        factorio();

    }
    public static int factorio() {
        System.out.println("enter a number");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        System.out.println("number of your factorial is " + fact);
        return fact;
    }
}
