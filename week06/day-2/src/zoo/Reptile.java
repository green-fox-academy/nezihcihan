package zoo;

public class Reptile extends Animal {
    public Reptile(String name) {
        this.name = name;
    }

    @Override
    public void greet() {

    }

    @Override
    public String wantChild() {
        String r ="want a child from an egg!";
        return r;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat() {

    }
}
