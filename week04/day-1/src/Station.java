public class Station {

    int gasAmount;
    int capacity;

    public void refill(){
        Car myCar = new Car();
        this.gasAmount = myCar.gasAmount +100;
        this.capacity = myCar.capacity - 100;
    }
    public static void main(String[] args) {
        Station myStation = new Station();
        myStation.refill();
        System.out.println("Car gasAmount after refill: " + myStation.gasAmount);
        System.out.println("Car refill capacity after refill: " + myStation.capacity);
    }
}
