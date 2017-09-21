import java.util.ArrayList;

// Write a recursive function that takes one parameter: n and counts down from n.
public class Counter {
    public static void main(String[] args) {
        count(7);
    }
    public static void count(int n) {
        if (n == 0) {
            System.out.println(n);;
        } else {
            System.out.print(n);
            count(n-1);
        }
    }
}