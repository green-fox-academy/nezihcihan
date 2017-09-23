import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Create a method that decrypts reversed-order.txt
public class ReversedOrder {
    public static void main(String[] args) {
        System.out.println(reverseOrder("reversed-order.txt"));
    }
    public static ArrayList<String> reverseOrder(String fileName) {
        ArrayList<String> reversed = null;
        try {
            Path filePath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(filePath);
            ArrayList<String> newList = new ArrayList<>();
            reversed = new ArrayList<>();
            for (String line : lines) {
                newList.add(line);
                System.out.println(); // prints the line
            }
            for (int i = newList.size() - 1; 0 <= i; i--) {
                reversed.add(newList.get(i));
            }

        } catch (Exception e) {
            System.out.println("Unable to read the file!");
        }
        return reversed;
    }
}