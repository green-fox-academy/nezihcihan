// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;
import java.util.List;
public class CountLines {
    public static void main(String[] args) throws IOException {
        countLineNumber(userInput());
    }
    /** METHOD FOR LINE COUNTING **/
    public static void countLineNumber(String name) {
        long lineCount = 0;
        try {
            Path path = Paths.get(name);
            lineCount = Files.lines(path).count();
        }

        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("File has total lines of " + lineCount);
    }
    /** METHOD FOR USER INPUT **/
    public static String userInput(){
        System.out.println("enter your file name.");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        return name;
    }

}
