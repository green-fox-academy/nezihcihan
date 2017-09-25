public class Station {

    int gasAmount;
    int capacity;

    public void refill(Car car){

        this.gasAmount = car.gasAmount +100;
        this.capacity = car.capacity - 100;
    }
    public static void main(String[] args) {
        Station myStation = new Station();
        Car myCar = new Car();
        myStation.refill(myCar);
        System.out.println("Car gasAmount after refill: " + myStation.gasAmount);
        System.out.println("Car refill capacity after refill: " + myStation.capacity);
    }
}
