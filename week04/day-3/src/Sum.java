import java.util.ArrayList;
import java.util.Arrays;

public class Sum {

    ArrayList<Integer> intList;//ArrayList of Integers as parameter

    public Sum (ArrayList<Integer> intList) {
        this.intList = intList;
    }

    public Integer sumMethod() {
        Integer counter = 0;
        for (Integer adder : intList) {
            counter += adder;
        }
        return counter;
    }
}

