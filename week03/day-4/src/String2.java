// Given a string, compute recursively a new string where all the 'x' chars have been removed.
public class String2 {
    public static void main(String[] args) {
        System.out.print(change("xyz"));
    }

    public static String change(String str) {
        if (str.length() == 0) {
            return str;
        } else if (str.charAt(str.length() - 1) == 'x') {
            return change(str.substring(0, str.length() - 1)) + "";
        } else {
            return change(str.substring(0, str.length() - 1)) + str.substring(str.length() - 1, str.length());
        }
    }
}