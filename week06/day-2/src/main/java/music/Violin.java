package main.java.music;

public class Violin extends StringedInstrument {
    public Violin() {
        this.numberOfStrings =4;
        this.name = "Screech";
    }
    public Violin(int numberOfStrings) {
        this.name = "Screech";
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    String sound() {
        return name;
    }

    @Override
    void play() {
        System.out.println("Violin, a " + numberOfStrings + "-stringed instrument that " + sound() + "es.");
    }
}
