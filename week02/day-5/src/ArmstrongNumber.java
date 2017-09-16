import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num, sum = 0, temp, remainder, digits = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number.");
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            digits++;
            temp = temp/10;
        }
        temp = num;
        while (temp != 0) {
            remainder = temp%10;
            sum = sum + power(remainder, digits);
            temp = temp/10;
        }
        if (num == sum)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
    static int power(int n, int r) {
        int c, p = 1;
        for (c = 1; c <= r; c++)
            p = p * n;
        return p;
    }
}
