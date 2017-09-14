import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args) {
        int[] a =new int[2];
        System.out.println("Enter 2 numbers: \n");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        if(a[0] > a[1]){
            System.out.println("Bigger num is " + a[0]);
        }
        else {
            System.out.println("Bigger num is " + a[1]);
        }
    }
}
