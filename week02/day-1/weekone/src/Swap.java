public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        // Swap the values of the wariablesprivate static void swap(int num1, int num2) {
            int temp = a;
            a = b;
            b = temp;
            System.out.println("After Swapping");
            System.out.println("Value of a is :" + a);
            System.out.println("Value of b is :" +b);
        }
}
