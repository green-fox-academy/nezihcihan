import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        isAnagram("dog","god");
    }
    static void isAnagram(String s1, String s2)
    {
        boolean status = true;
        if(s1.length() != s2.length())
        {
            status = false;
        }
        else
        {
            char[] s1Array = s1.toLowerCase().toCharArray();
            char[] s2Array = s2.toLowerCase().toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            status = Arrays.equals(s1Array, s2Array);
        }
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
}
