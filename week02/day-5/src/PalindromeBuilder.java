import java.util.Scanner;
public class PalindromeBuilder {
    public static void main(String[] args) {
        palindromBuilder(userInput());
    }
    
    /** METHOD FOR USER INPUT **/
    public static String userInput() {
        System.out.println("Enter a word!");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        return userInput();
    }
    /** METHOD FOR PALINDROME BUILDING **/
    public static void palindromBuilder(String word) {
        char[] wordArray = word.toCharArray();
        char[] otherArray = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            otherArray[i] = wordArray[word.length() - 1 - i];
        }
        System.out.print(wordArray);
        System.out.println(otherArray);
    }
}
