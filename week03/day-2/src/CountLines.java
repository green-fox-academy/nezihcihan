// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;
public class CountLines {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("reversed-lines.txt"));
            int count = 0;
            while(file.hasNext()){
                count ++;
                file.nextLine();
            }
            System.out.println(count);
        }
        catch (Exception e) {
            System.out.println("Unable to read the file");
        }
    }
}
