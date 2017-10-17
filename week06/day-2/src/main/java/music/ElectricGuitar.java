package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        this.numberOfStrings = 6;
        this.name = "Twang";
    }
    public ElectricGuitar(int numberOfStrings) {
        this.name = "Twang";
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    String sound() {
        return this.name;
    }

    @Override
    void play() {
        System.out.println("ElectricGuitar, a " + numberOfStrings + "-stringed instrument that " + sound() + "s.");

    }
}
