//Create a function that takes a list of numbers as a parameter
//Returns a list of numbers where every number in the list occurs only once
//input: [1, 11, 34, 11, 52, 61, 1, 34]/////output: [1, 11, 34, 52, 61]
import java.util.ArrayList;
import java.util.Scanner;
public class Unique {
    public static void main(String[] args) {
        uniqFunction(userInput());
    }
    /** METHOD FOR USER INPUT -- INITIALIZE  AN ARRAY LIST FOR INTEGERS **/
    public static ArrayList<Integer> userInput(){
        System.out.println("Enter your numbers, when you finish TYPE \"F\" and Press Enter.");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(input.hasNextInt()){
            list.add(input.nextInt());
        }
        return list;
    }
    /** METHOD - Bubblesort for ArrayList &&& Removes Repetition of List **/
    public static void uniqFunction(ArrayList<Integer>list) {
        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.size()-1; i++) {
                Integer temp;
                if (list.get(i) > list.get(i + 1)) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
                if (list.get(i).equals(list.get(i + 1))) {
                    list.remove(i + 1);
                }
            }
        }
        for (int k = 0; k < list.size(); k++) {
            System.out.print(list.get(k) + " ");
        }
    }
}

