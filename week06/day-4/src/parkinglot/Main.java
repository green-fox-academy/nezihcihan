package parkinglot;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(256);
        parkingLot.countSameTypes();
        parkingLot.countSameColors();
        parkingLot.mostFrequentCar();
    }
}
