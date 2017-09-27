import java.util.Arrays;

public class Anagram {
    String s1;
    String s2;

    public Anagram(String s1, String s2) {
        this.s1= s1;
        this.s2 = s2;
    }
    public boolean anagramMethod() {
        //boolean status = false;
        if(s1.length() != s2.length()) {
            return false;
        }

        else {
            char[] s1Array = s1.toLowerCase().toCharArray();
            char[] s2Array = s2.toLowerCase().toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            return Arrays.equals(s1Array, s2Array);
        }

    }
}