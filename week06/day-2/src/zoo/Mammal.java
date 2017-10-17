package zoo;

public class Mammal extends Animal {

    public Mammal(String name) {
        this.name = name;
    }

    @Override
    public void greet() {

    }

    @Override
    public String wantChild() {
        String m ="want a child from my uterus!";
        return m;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat() {

    }
}
