
public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        int dailyHours = 6;
        int weeklyHours = 6 * 5; //for 5 days
        // The semester is 17 weeks long
        int weeks = 17;
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        int totalHours = weeklyHours*weeks;
        System.out.println("Total hours for 17 weeks " + totalHours + " hours");

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        System.out.println("Average is " +  totalHours / 52 + "hours");
    }
}

