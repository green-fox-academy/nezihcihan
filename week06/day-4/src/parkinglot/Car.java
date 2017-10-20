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
        LIGHTBLUE, GREEN, BROWN, DARKBLUE, PURPLE;
        public static Color getRandomColor() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }
    public Type type;
    public Color color;

    public Car(Type type, Color color) {
        this.type = type;
        this.color = color;
    }
    public Type getType() {

        return type;
    }

    public Color getColor() {

        return color;
    }
    @Override
    public String toString() {

        return getType() + ": " + getColor();
    }
}

