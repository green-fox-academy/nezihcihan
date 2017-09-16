// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:// Sum: 22, Average: 4.4
import java.util.ArrayList;
import java.util.Scanner;
public class ParametricAverage {
    public static void main(String[] args) {
    parametricAverage(userInput());
    }

    /**Method for User Input**/
    public static ArrayList<Integer> userInput (){
        System.out.println("Enter some numbers, when you complete your list press X");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()) {
            int numbersEntered = input.nextInt();
            arrayList.add(numbersEntered);
        }
        return arrayList;
    }

    /**Method for Calculation of Sum & Avarage of Numbers Entered **/
    public static void parametricAverage(ArrayList<Integer> arrayList){
        int sum = 0;
        for (int iteratingElement : arrayList) {
            sum += iteratingElement;
        }
        int average = sum / arrayList.size();
        System.out.println("Sum of numbers you entered is : " + sum);
        System.out.println("Average of numbers you entered is : " + average);
    }
}
