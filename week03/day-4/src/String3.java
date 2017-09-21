// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
public class String3 {
    public static void main(String[] args) {
        System.out.print(change("xyz"));
    }

    public static String change(String str) {
        if (str.length() == 0) {
            return str;
        }
        else
        {
            return change(str.substring(0, str.length() - 1)) + str.substring(str.length() - 1, str.length()) + "*";
        }
    }
}