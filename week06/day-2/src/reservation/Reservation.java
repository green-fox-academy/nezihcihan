package reservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Reservation implements Reservationy {
    ArrayList<String> daysOfTheWeek = new ArrayList<>(Arrays.asList("MON","TUE","WED","THU","FRI","SAT","SUN"));

    @Override
    public String getDowBooking() {
        int randomDay = (int) ((Math.random() * 7) + 1);
        String day = daysOfTheWeek.get(randomDay-1);
        return day;
    }
    @Override
    public String getCodeBooking() {
        String codeChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        while (sb.length() < 9) {
            int index = (int) (rnd.nextFloat() * codeChars.length());
            sb.append(codeChars.charAt(index));
        }
        String code = sb.toString();
        return code;
    }
    @Override
    public void printAll(int number) {
        for (int i = 0; i < number ; i++) {
            System.out.println("Booking# " + getCodeBooking() + " for " + getDowBooking() + ".");
        }
    }
    @Override
    public String printString(int number) {
        String s = "";
        for (int i = 0; i < number ; i++) {
            s =String.format("Booking#%s", getCodeBooking() , "for %s " , getDowBooking() + ".");
        }
        return s;
    }
}
