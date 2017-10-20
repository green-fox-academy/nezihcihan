package parkinglot;
import java.util.*;

public class ParkingLot {
    ArrayList<Car> carList;
    ArrayList<Car.Type> carType;
    ArrayList<Car.Color> carColor;

    public ParkingLot(int quantity) {
        carList = new ArrayList<>();
        carType = new ArrayList<>();
        carColor = new ArrayList<>();

        for (int i = 1; i <= quantity ; i++) {
            carList.add(new Car(Car.Type.getRandomType(), Car.Color.getRandomColor()));
        }
        for (Car c: carList) {
            carType.add(c.getType());
        }
        for (Car c: carList) {
            carColor.add(c.getColor());
        }
    }

    public void showAllCars()  {
        for (int i = 0; i < carList.size(); i++) {
            System.out.println("" + (i + 1) + ". " + carList.get(i));
        }
    }
    public void countSameTypes(){
        System.out.println("\n===SAME TYPED CAR LIST:===");
        Set<Car.Type> type = new HashSet<>(carType);
        for (Car.Type t : type) {
            System.out.println(t + ": " + Collections.frequency(carType, t));
        }
    }
    public void countSameColors() {
        System.out.println("\n===SAME COLORED CAR LIST:===");
        Set<Car.Color> color = new HashSet<>(carColor);
        for (Car.Color c : color) {
            System.out.println(c + ": " + Collections.frequency(carColor, c));
        }
    }
    public void mostFrequentCar() {
        HashMap<String, Integer> carMap = new HashMap<>();
        for (int i = 0; i < carList.size(); i++) {
            String car = carList.get(i).color.toString() + " " + carList.get(i).type.toString();
            if (carMap.containsKey(car)) {
                int counter = carMap.get(car);
                carMap.put(car, ++counter);
            }
            else {
                carMap.put(car, 1);
            }
        }
        Map.Entry<String, Integer> mostCommon = null;
        for (Map.Entry<String, Integer> car : carMap.entrySet()) {
            if ((mostCommon == null) || car.getValue() > mostCommon.getValue()) {
                mostCommon= car;
            }
        }
        System.out.println("\n=== MOST FREQUENT CAR ===\n" + mostCommon.getKey());
    }
}