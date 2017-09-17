import java.util.Scanner;
//Create a function that takes two strings as a parameter
//Returns the starting index where the second one is starting in the first one
//Returns -1 if the second string is not in the first one
//input: "this is what I'm searching in", "searching"
//output: 17
public class Substr {
    public static void main(String[] args) {
        searchFunction(userInputString(),userInputSearch());
    }

    /** METHOD FOR USER SENTENCE INPUT **/
    public static String userInputString(){
        System.out.println("Enter your sentences.");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        return sentence;
    }
    /** METHOD FOR THE WORD TO BE SEARCHED **/
    public static String userInputSearch(){
        System.out.println("Enter your word to be searched.");
        Scanner input = new Scanner(System.in);
        String search = input.nextLine();
        return search;
    }
    /** METHOD FOR SEARCHING WORD (OUTPUTS INDEX NUM.) **/
    public static void searchFunction(String sentence, String search) {
        if (sentence.contains(search)) {
            System.out.println("Your Searching starts from index: " + sentence.indexOf(search));
        }
    }
}
