package zoo;

public class Bird extends Animal {
    public Bird(String name) {
        this.name = name;
    }
    @Override
    public void greet() {

    }

    @Override
    public String wantChild() {
        String b = "want a child from an egg!";
        return b;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat() {

    }
}
