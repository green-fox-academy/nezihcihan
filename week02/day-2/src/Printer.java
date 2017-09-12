public class Printer {
    public static void main(String[] args) {
        // - Create a function called `printer`
        //   which prints the input String parameters
        // - It can have any number of parameters
        printer("first" , "second", "third", "four", "five","six", "seven", "eight", "and so on...");
    }
    public static void printer(String ... strings) {
        for (String s : strings)
            System.out.println(s);
    }
}
