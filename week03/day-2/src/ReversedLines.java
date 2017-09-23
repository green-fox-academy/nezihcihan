import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        System.out.println(reverse("reversed-lines.txt"));
    }
    public static ArrayList<String> reverse (String fileName) {
        ArrayList<String> newList = new ArrayList<>();
        try {
            Path filePath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(filePath);

            for (String line : lines) {
                String reverse = new StringBuffer(line).reverse().toString();
                newList.add(reverse);

            }
        } catch (Exception e) {
            System.out.println("Unable to read the file!");
        }
        return newList;
    }
}