public class Station {

    int gasAmount;
    public Station(int gasAmount){
        this.gasAmount = gasAmount;
    }

    public int [] refill(Car anyCar){
         int[] gasAmountInCarandStaion = new int [2];
         gasAmountInCarandStaion[0] = gasAmount - anyCar.capacity;
         anyCar.gasAmount += 100;
         gasAmountInCarandStaion[1] = anyCar.gasAmount;
         return gasAmountInCarandStaion;

    }
    public static void main(String[] args) {

    }
}
