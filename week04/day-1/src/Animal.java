public class Animal {
    int hunger = 50;
    int thirst = 50;

    public void eat() {
        hunger = hunger - 1;
    }
    public void drink() {
        thirst = thirst - 1;
    }
    public void play() {
        thirst = thirst + 1;
        hunger = hunger + 1;
    }
    public static void main(String[] args) {
        Animal doggy = new Animal();
        doggy.eat();
        doggy.drink();
        doggy.play();
        doggy.eat();
        doggy.drink();
        doggy.eat();
        doggy.drink();
        doggy.eat();
        doggy.eat();
        doggy.eat();
        doggy.drink();
        System.out.println("Hunger: " + doggy.hunger + ", Thirst: " +  doggy.thirst);
    }
}
