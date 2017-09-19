import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        reverse("reversed-lines.txt");
    }
    public static void reverse (String fileName) {

        try {
            Path filePath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(filePath);
            ArrayList<String> newList = new ArrayList<>();
            for (String line : lines) {
                String reverse = new StringBuffer(line).reverse().toString();
                newList.add(reverse);
                System.out.println(reverse); // prints the line
            }
        } catch (Exception e) {
            System.out.println("Unable to read the file!");
        }
    }
}