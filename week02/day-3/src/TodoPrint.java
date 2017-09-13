// Add "My  to do:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention
// Expected output:
// My to do:
//  - Buy milk
//  - Download games
//  - Diablo
import java.lang.*;
public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        String beginning = "My to do;\n";
        String mid = " - Download games\n";
        todoText = beginning + todoText + mid;
        String end = " - Diablo";
        todoText = todoText.concat(end);
        System.out.println(todoText);
    }
}