//Create a function that takes a string and a list of string as a parameter
//Returns the index of the string in the list where the first string is part of
//Returns -1 if the string is not part any of the strings in the list
//input: "ching", ["this", "is", "what", "I'm", "searching", "in"] //output: 4
import java.util.ArrayList;
import java.util.Arrays;
public class Substrlist {
    public static void main(String[] args) {
        ArrayList<String> myString = new ArrayList<String>();
        myString.addAll(Arrays.asList("this", "is", "what", "I'm", "searching", "in"));
        String search = "ching";
        searchString(myString,search);
    }
    /** METHOD FOR SEARCHING SUBSTRING **/
    public static void searchString(ArrayList<String> myString, String search) {
        String[] indexNum = new String[myString.size()];
        System.out.print("Your searching is stored in index: ");
        for (int i = 0; i < myString.size(); i++) {
            if (myString.get(i).contains(search)) {
                indexNum[i] = "" + i;
                System.out.print(indexNum[i] + ", ");
            }
        }
    }
}
