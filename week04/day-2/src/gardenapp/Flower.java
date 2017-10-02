package gardenapp;

public class Flower extends Plant {
    public Flower(String color) {
        this.color = color;
        waterAmount =0;
        absorbPercent = 0.75f;
    }
    public void showWaterNeed() {
        if (waterAmount < 5) {
            System.out.println(color +
            " Flower needs water.");
        }
        else {
            System.out.println(color +
            " Flower does not need water.");
        }
    }
    public boolean waterNeed() {
        return waterAmount < 5;
    }
}