// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
import static jdk.nashorn.internal.objects.NativeArray.lastIndexOf;
public class String1 {
    public static void main(String[] args) {
        System.out.print(change("xyz"));
    }
    public static String change(String  str) {
        if (str.length() == 0) {
            return str;
        }
        else if(str.charAt(str.length()-1) == 'x') {
            return change(str.substring(0, str.length()-1))+ "y";
        }
        else {
            return change(str.substring(0, str.length()-1)) + str.substring(str.length()-1, str.length());
        }
    }
}
