package zoo;

abstract public class Animal {
    protected String name;
    protected int age;
    protected String gender;

    public abstract void greet();
    public abstract String wantChild();
    public abstract String getName();
    public abstract void eat();
}
