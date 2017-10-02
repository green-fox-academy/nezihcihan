import java.util.Arrays;

public class Anagram {
    public static boolean checkAnagram(String a, String a1) {
        if (a.length() != a1.length()) {
            return false;
        }
        else {
            return sorting(a).equals(sorting(a1));
        }
    }
    public static String sorting(String b) {
        char[] s1Array = b.toLowerCase().toCharArray();
        Arrays.sort(s1Array);
        return Arrays.toString(s1Array);
    }
    public static void main(String[] args) {
        String a = "god";
        String b = "Dog";

        System.out.println(checkAnagram(a,b));
    }

}
