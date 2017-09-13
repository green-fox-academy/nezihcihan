// Create a function that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.
public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        reverse(reversed);
        }
    public static void reverse(String toBeReversed) {
        char[] charArray = toBeReversed.toCharArray();
        int end = charArray.length - 1;
        char temp;
        int start = 0;
        while (end > start) {
        temp = charArray[start];
        charArray[start] = charArray[end];
        charArray[end] = temp;
        end--;
        start++;
        }
        System.out.println(charArray);
    }
}