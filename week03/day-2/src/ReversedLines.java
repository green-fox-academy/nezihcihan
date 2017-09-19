import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        try { // Required by Files.readAllLines(filePath);
                // Reads the content from `myFile.txt` in the `assets`
            // folder line by line to a String List
            Path filePath = Paths.get("reversed-lines.txt");
            List<String> lines = Files.readAllLines(filePath);
            ArrayList<String> newList = new ArrayList<>();
            String temp = "";
            for (int i = 0; i < lines.size()-1; i++) {

                for (int j = 0; j < ; j++) {

                }
            }
            System.out.println(lines); // Prints the all lines of the file
        }
        catch (Exception e) {
            System.out.println("Unable to read the file!");
        }

    }
}