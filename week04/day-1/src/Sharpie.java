public class Sharpie {
    String color;
    float width;
    float inkAmount;
    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }
    public void use(int decrease){
        inkAmount -= decrease;
    }
    public static void main(String[] args) {
        Sharpie mySharpie = new Sharpie("Black",25);
        mySharpie.use(19);
        System.out.println("The color is: " + mySharpie.color + " ,the width is: " + mySharpie.width +
                " ,remaining ink amount is: " + mySharpie.inkAmount);
    }
}
