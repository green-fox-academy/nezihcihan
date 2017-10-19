package parkinglot;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car mycars = new Car(256);
        mycars.showAllCars();
        mycars.countSameTypes();
        mycars.countSameColors();
    }
}
