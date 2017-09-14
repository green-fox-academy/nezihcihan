// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
// Sum: 22, Average: 4.4
import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args) {
        int[] a =new int[5];
        System.out.println("Enter 5 numbers: \n");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
            sum += a[i];
        }
        int average = sum / a.length;
        System.out.println("Sum : " + sum + "\nAverage: " + average);
    }
}
