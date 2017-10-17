package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        this.name = "Duum-duum-duum";
        this.numberOfStrings = 4;
    }
    public BassGuitar(int numberOfStrings) {
        this.name = "Duum-duum-duum";
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    String sound() {
        return name;
    }

    @Override
    void play() {
        System.out.println("Bass Guitar, a " + numberOfStrings + "-stringed instrument that " + sound() + ".");
    }
}
