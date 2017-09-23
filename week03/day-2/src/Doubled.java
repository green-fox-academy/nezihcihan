import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class Doubled {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        System.out.println(decripts("duplicated-chars.txt"));
    }
    public static ArrayList<String> decripts(String file){
        ArrayList<Character> charList = new ArrayList<>();
        String last = "";
        ArrayList<String> decriptedList = new ArrayList<>();
        try {
            Path filePath = Paths.get(file);
            List<String> insideFile = Files.readAllLines(filePath);
            for (String line : insideFile) {
                for (int j = 0; j < line.length() ; j += 2) {
                    charList.add(line.charAt(j));
                }
            }
            for (int k = 0; k < charList.size(); k++) {
                last = last + charList.get(k);
            }
            decriptedList.add(last);
        }
        catch (Exception e) {
            System.out.println("Unable to read the file!");
        }
        return decriptedList;
    }
}
