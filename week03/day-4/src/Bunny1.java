// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
public class Bunny1 {
    public static void main(String[] args) {
        System.out.println(ears(56));
    }
    public static int ears(int  n) {
        if(n == 0) {
            return 0;
        }
        else {
            return 2 + ears(n-1);
        }
    }
}