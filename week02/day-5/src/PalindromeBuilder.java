import java.util.Scanner;
public class PalindromeBuilder {
    public static void main(String[] args) {
        System.out.println("Enter a word!");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        char[] wordArray = word.toCharArray();
        char[] otherArray = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            otherArray[i] = wordArray[word.length() - 1 - i];
        }
        System.out.print(wordArray);
        System.out.println(otherArray);
    }
}
