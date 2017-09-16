//Create a function that takes a number and a list of numbers as a parameter
//Returns the indexes of the numbers in the list where the first number is part of
//Returns an empty list if the number is not part any of the numbers in the list
//input: [1, 11, 34, 52, 61], 1 //output: [0, 1, 4]
import java.util.ArrayList;
import java.util.Scanner;
public class Subint {
    public static void main(String[] args) {
            searchingFunction(userInputNumberList(),userNumberForSearch());
    }
    
    /** METHOD FOR USER INPUT LIST OF NUMBERS **/
    public static ArrayList<Integer> userInputNumberList(){
        System.out.println("Enter your number list and then PRESS X");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        while(input.hasNextInt()){
            numList.add(input.nextInt());
        }
        return numList;
    }
    /**METHOD FOR THE NUMBER TO BE SEARCHED **/
    public static String userNumberForSearch() {
        Scanner input = new Scanner(System.in);
        System.out.println("Now enter the number you want to search.");
        String wantedNumber = input.nextLine();
        return wantedNumber;
    }

    /** METHOD FOR SEARCHING NUMBER (RETURN INDEX/S of NUMBER)**/
    public static void searchingFunction(ArrayList<Integer>numList, String numToSearch ) {
        ArrayList<String> newList = new ArrayList<String>(numList.size());
        for (Integer iterator : numList) {
            newList.add(String.valueOf(iterator));
        }
        ArrayList<Integer> indexNumbers = new ArrayList<>();
        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i).contains(numToSearch)) {
                indexNumbers.add(i);
            }
        }
        System.out.println("Your number is stored in the index of " + indexNumbers);
    }
}
