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
        try { // Required by Files.readAllLines(filePath);
            // Reads the content from `myFile.txt` in the `assets`
            // folder line by line to a String List
            Path filePath = Paths.get("duplicated-chars.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size()-1 ; i++) {
                System.out.println(lines.get(i));
                for (int j = 0; j < (lines.get(i).length())-1 ; j = j + 2) {
                    newList.add(lines.get(i).charAt(j));
                }
            }

            for (int k = 0; k < newList.size()-1; k++) {
                last.add(newList.get(k).toString());
            }
            for (int i = 0; i < last.size()-1 ; i++) {
                System.out.print(last.get(i));
            }
        }
        catch (Exception e) {
            System.out.println("Unable to read the file!");
        }
        try { // Required by Files.write(filePath, content)
            // Creates a new file if not exists and overwrites it's content
            // The elements of the content lists will become the lines of the file
            Path filePath = Paths.get("duplicated-chars.txt");
            Files.write(filePath, last);
        } catch (Exception e) {
            System.out.println("Could not write the file!");
        }
        for (int i = 0; i < last.size() ; i++) {
            System.out.print(last.get(i));
        }

    }
}