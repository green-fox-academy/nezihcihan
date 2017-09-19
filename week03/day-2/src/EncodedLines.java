import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
    public static void main(String[] args) {
        // Create a method that decrypts encoded-lines.txt
        try {
            Path filePath = Paths.get("encoded-lines.txt");
            List<String> lines = Files.readAllLines(filePath);
            ArrayList<Integer> newList = new ArrayList<>();
            for (String line : lines) {
                //newList.add((Integer) line)
                //System.out.println(reverse); // prints the line
            }
        } catch (Exception e) {
            System.out.println("Unable to read the file!");
        }

    }
}