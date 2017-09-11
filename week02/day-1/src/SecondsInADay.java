public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented bt the variables
        int remainingHours = (24 - currentHours);
        int remainingminutes = (60 - currentMinutes);
        int reminingSeconds = (60 - currentSeconds);
        int remainingTotalInSeconds = (remainingHours * 3600) + (remainingminutes * 60) + (reminingSeconds);
        System.out.println("You have " + remainingTotalInSeconds + " seconds remaining for today!");
    }
}