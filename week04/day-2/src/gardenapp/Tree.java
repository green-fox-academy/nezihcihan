package gardenapp;
public class Tree extends Plant {
    public Tree (String color) {
        this.color = color;
        waterAmount = 0;
        absorbPercent = 0.40f;
    }
    public void showWaterNeed() {
        if (waterAmount < 5) {
            System.out.println(color + " Tree needs water.");
        }
        else {
            System.out.println(color + " Tree does not need water.");
        }
    }
    public boolean waterNeed() {
        return waterAmount < 10;
    }
}
