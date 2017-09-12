import java.util.Scanner;
public class Sum {
    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter
    public static void main(String[] args) {
        total();
    }
    public static int total() {
        System.out.println("enter three numbers");
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int thirdNum = input.nextInt();
        int inTotal = firstNum + secondNum + thirdNum;
        System.out.println(inTotal);
        return inTotal;
    }
}
