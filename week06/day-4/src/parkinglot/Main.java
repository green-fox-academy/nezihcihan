package parkinglot;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> carList = new ArrayList<>();
        ArrayList<Car.Type> carType = new ArrayList<>();
        ArrayList<Car.Color> carColor = new ArrayList<>();

        for (int i = 1; i < 257 ; i++) {
            Car car = new Car(Car.Type.getRandomType(), Car.Color.getRandomColor());
            carList.add(String.valueOf("" + i + ". " +car.getType()) + ":"+ String.valueOf(car.getColor()));
            carType.add(car.getType());
            carColor.add(car.getColor());
        }
        for (String s: carList) {
            System.out.println(s);
        }
        Set<Car.Type> typeSet = new HashSet<>(carType);
        for (Car.Type temp : typeSet) {
            System.out.println(temp + ": " + Collections.frequency(carType, temp));
        }
        Set<Car.Color> colorSet = new HashSet<>(carColor);
        for (Car.Color c : colorSet) {
            System.out.println(c + ": " + Collections.frequency(carColor, c));
        }
    }
}
