import java.util.Scanner;
public class Sum {
    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter
    public static void main(String[] args) {
        sum(6);
    }
    public static  int sum(int till){
        int sumOfAll = 0;
        for(int i =0; i < till; i++){
        sumOfAll += i;
        }
        System.out.println(sumOfAll);
        return sumOfAll;
    }
}
