import java.util.ArrayList;
import java.util.Random;

public class CowsAndBulls {
    ArrayList<Integer> fourDigitNum;

    public CowsAndBulls(){
        System.out.println("---- Generating Random Number of 4 digit ----");
        Random random = new Random();
        long fraction = (long)(1000 * random.nextDouble());
        fourDigitNum = new ArrayList<>();
        fourDigitNum.add((int)(fraction + 1000));
        System.out.println(fourDigitNum);
        System.out.println("Guess the digit");
    }
/**
    public String guess(int guessedNumber){
        if () {
            return  "You gueesed correct!";
        }
        else {
            return  "You gueesed wrong try again!";
        }
    }
**/
    public static void main(String[] args) {
        CowsAndBulls object = new CowsAndBulls();

    }
}
