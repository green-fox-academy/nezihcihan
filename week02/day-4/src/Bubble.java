//Create a function that takes a list of numbers as parameter
//Returns a list where the elements are sorted in ascending numerical order
//Make a second boolean parameter, if it's true sort that list descending
//input [34, 12, 24, 9, 5] //output [5, 9, 12, 24, 34]
import java.util.ArrayList;
import java.util.Scanner;
public class Bubble {
    public static void main(String[] args) {
        bubleSort(userInput());
    }
    /***** METHOD for BUBBLE SORT *****/
    public static void bubleSort(int[] list) {
        for (int j = 0; j < list.length; j++) { //CREATES A RECURSIVE LOOP TO COMPARE EACH ELEMENT OF ARRAY//
            for (int i = 0; i < list.length - 1; i++) { //ONLY SWAPS FIRST ELEMENT OF ARRAY AND SENDS TO THE END OF ARRAY IF THE NUMBER IS BIGGER THAN THE RIGHT NEXT TO IT.
                int temp;
                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
        System.out.println("Here is your Bubble sorted list:");
        for (int j = 0; j < list.length; j++) {
            System.out.print( + list[j] + ", ");
        }
    }
    /***** METHOD FOR USER INPUT *****/
    public static int[] userInput(){
        System.out.println("Enter your number and PRESS X when you are done.");
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            numberList.add(input.nextInt());
        }
        int[] list = new int[numberList.size()];
        for (int i = 0; i < numberList.size(); i++) {
            list[i] = numberList.get(i);
        }
        return list;
    }
}
