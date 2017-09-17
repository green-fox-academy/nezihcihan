//Create a function named search palindrome following your current language's
// style guide. It should take a string, search for palindromes that at least
// 3 characters long and return a list with the found palindromes.
//input	"dog goat dad duck doodle never"
// output ["og go", "g g", " dad ", "dad", "d d", "dood", "eve"]
import java.util.Scanner;
public class PalindromeSearcher {
    public static void main(String[] args) {
    palindromeSearcher(userInput());
    }
    /** METHOD FOR USER INPUT **/
    public static String userInput(){
        System.out.println("Enter your String.");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }
    /** METHOD PALINDROME SEARCH **/
    public static void palindromeSearcher(String input){
        for (int k = 3; k < input.length(); k++) {
            for (int i = 0; i < input.length() - k; i++) {
                String sub = input.substring(i, i + k);
                String reverse = new StringBuffer(sub).reverse().toString();
                if (sub.equalsIgnoreCase(reverse)) {
                    System.out.print("\"" + reverse + "\", ");
                }
            }
        }
    }

}


