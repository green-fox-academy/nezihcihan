package gardenapp;
import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> garden;
    public Garden() {
        this.garden= new ArrayList<>();
    }
    public void addPlant(Plant plant) {

        garden.add(plant);
    }
    public void giveWater(float water) {
        int counter = 0;
        for (Plant sample : garden) {
            if (sample.waterNeed()) {
                counter++;
            }
            else{
                return;
            }
        }
        for (Plant sample : garden){
            if (sample.waterNeed()) {
                sample.waterAmount +=
                water/counter*sample.absorbPercent;
            }
        }
        System.out.println("\nWatering with : " + water + " \n");
    }
}
