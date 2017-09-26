package gardenapp;

public class GardenAppTest {
    public static void main(String[] args) {
        Garden myGarden = new Garden();

        Flower yellowFlower = new Flower("Yellow");
        Flower blueFlower = new Flower("Blue");
        Tree purpleTree = new Tree("Purple");
        Tree orangeTree = new Tree("Orange");

        myGarden.addPlant(yellowFlower);
        myGarden.addPlant(blueFlower);
        myGarden.addPlant(purpleTree);
        myGarden.addPlant(orangeTree);

        yellowFlower.showWaterNeed();
        blueFlower.showWaterNeed();
        purpleTree.showWaterNeed();
        orangeTree.showWaterNeed();

        myGarden.giveWater(40); //can be checked also for watering amount of 70.

        yellowFlower.showWaterNeed();
        blueFlower.showWaterNeed();
        purpleTree.showWaterNeed();
        orangeTree.showWaterNeed();
    }
}
