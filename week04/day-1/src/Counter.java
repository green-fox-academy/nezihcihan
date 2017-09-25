public class Counter {
    int value;
    int reset;

    public Counter(){
        this.value = 0;
        this.reset = this.value; // in order to set the values to initiation
                                 // we match the reset value to start value with "this" reference.
    }
    public Counter(int value) {
        this.value = value;
        this.reset = this.value;
    }
    //Calc Methods//
    public void add(int number) {
        value = value + number;
    }
    public void add() {
        value = value + 1;
    }
    public int get() {
        return value;
    }
    public void reset() {
        value = reset;
    }
}
