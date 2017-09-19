import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        ArrayList<Character> newList = new ArrayList<>();
        ArrayList<String> last = new ArrayList<>();
        try {
            Path filePath = Paths.get("duplicated-chars.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                for (int j = 0; j < (line.length()) ; j += 2) {
                    newList.add(line.charAt(j));
                }
            }
            for (int k = 0; k < newList.size(); k++) {
                last.add(newList.get(k).toString());
            }
            for (int i = 0; i < last.size() ; i++) {
                System.out.print(last.get(i));
                if (last.get(i).contentEquals(".")) {
                    System.out.print(last.get(i) + "\n");
                }
            }

        }
        catch (Exception e) {
            System.out.println("Unable to read the file!");
        }
    }
}
