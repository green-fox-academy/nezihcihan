public class Animal {
    int hunger = 50;
    int thirst = 50;

    public int eat() {

        hunger = hunger - 1;
        return hunger;
    }
    public int drink() {

        thirst = thirst - 1;
        return thirst;
    }
    public int play() {

        hunger = hunger + 1;
        return hunger;
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
