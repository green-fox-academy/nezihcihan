package parkinglot;
import java.util.*;

public class Car {

    public enum Type{
        FORD, BWM, AUDI, RENAULT,MERCEDES,CITROEN,
        VOLKSWAGEN,JEEP,HYUNDAI,KIA, FERRARI;

        public static Type getRandomType() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }
    public enum Color{
        BLACK, WHITE, GREY, BLUE, RED, YELLOW,
        LIGHTBLUE, GREEN, BROWN, PINK, PURPLE;
        public static Color getRandomColor() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }
    private Type type;
    private Color color;

    ArrayList<Car> carList;
    ArrayList<Car.Type> carType;
    ArrayList<Car.Color> carColor;

    public Car(Type type, Color color) {
        this.type = type;
        this.color = color;
    }
    public Car(int quantity) {
        carList = new ArrayList<>();
        carType = new ArrayList<>();
        carColor = new ArrayList<>();
        for (int i = 1; i <= quantity ; i++) {
            carList.add(new Car(Type.getRandomType(), Color.getRandomColor()));
        }
        for (Car c: carList) {
            carType.add(c.getType());
        }
        for (Car c: carList) {
            carColor.add(c.getColor());
        }
    }
    public Type getType() {

        return type;
    }

    public Color getColor() {

        return color;
    }
    public void showAllCars()  {
        for (int i = 0; i < carList.size(); i++) {
            System.out.println("" + (i + 1) + ". " + carList.get(i));
        }
    }
    public void countSameTypes(){
        System.out.println("\n===SAME TYPED CAR LIST:===");
        Set<Type> type = new HashSet<>(carType);
        for (Type t : type) {
            System.out.println(t + ": " + Collections.frequency(carType, t));
        }
    }
    public void countSameColors() {
        System.out.println("\n===SAME COLORED CAR LIST:===");
        Set<Color> color = new HashSet<>(carColor);
        for (Color c : color) {
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
        System.out.println("=== MOST FREQUENT CAR ===\n" + mostCommon.getKey());
    }
    @Override
    public String toString() {
        return getType() + ": " + getColor();
    }
}

