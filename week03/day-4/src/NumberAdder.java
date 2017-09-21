// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class NumberAdder {
    public static void main(String[] args) {
        System.out.println(adder(5));
    }
    public static int adder(int n) {
        if (n  == 1) {
            return n;
        }
        else {
            return n + adder(n - 1);
        }
    }
}