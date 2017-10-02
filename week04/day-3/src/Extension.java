import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {

        return a + b;
    }
    int maxOfThree(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > c && b > a){
            return b;
        }
        else {
            return c;
        }
    }
    int median(List<Integer> pool) {
        int median = 0;
        for (Integer adder : pool) {
            median += adder;
        }
        return median / pool.size();
    }

    boolean isVowel(char c) {
        ArrayList<Character> vowelList = new ArrayList<>(Arrays.asList('a', 'u', 'o', 'e', 'i'));
        return vowelList.contains(c);
    }

    String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                teve = String.join(c + "v" + c, teve.split(""+ c));
                i+=6;
                length+=2;
            }
            if (isVowel(hungarian.charAt(hungarian.length()-1))) {
                teve += "v" + hungarian.charAt(hungarian.length()-1);
            }
        }

        return teve;
    }
    public static void main(String[] args) {
        Extension object = new Extension();
        System.out.println(object.translate("ape"));
    }
}