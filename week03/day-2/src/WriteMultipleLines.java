// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number parameter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class WriteMultipleLines {
    public static void main(String[] args) {
        List<String> content = new ArrayList();
        content.add("Orange");
        try { // Required by Files.write(filePath, content)
            // Creates a new file if not exists and overwrites it's content
            // The elements of the content lists will become the lines of the file
            for (int i = 0; i < 4 ; i++) {
                Path filePath = Paths.get("myFile.txt");
                Files.write(filePath, content, StandardOpenOption.APPEND);
            }
        } catch (Exception e) {
            System.out.println("Could not write the file!");
        }

    }

}