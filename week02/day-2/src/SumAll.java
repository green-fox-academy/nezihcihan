// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`
public class SumAll {
    public static void main(String[] args) {
        int [] ai = {3, 4, 5, 6, 7};
        int start = 0;
        for(int i = 0; i < ai.length; i++) {
            start += ai[i];
        }
        System.out.println("Sum of ai array is " + start + ".");
    }
}
