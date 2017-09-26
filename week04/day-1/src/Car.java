public class Car {
    int gasAmount;
    int capacity;

    public Car() {
        this.gasAmount = 0;
        this.capacity = 100;
    }

    public static void main(String[] args) {
        Car ford = new Car();
        Station shell = new Station(500);
        int[] gasAmountInCarAndStation = shell.refill(ford);
        System.out.println("Gas amount in Shell is " + gasAmountInCarAndStation[0]);
        System.out.println("Gas in Ford car is  " + gasAmountInCarAndStation[1]);
    }

}
