// Saturn is missing from the planetList
// Insert it into the correct position
import java.util.*;
import java.util.Collections;
public class SolarSystem {
    public static void main(String... args){
        ArrayList<String> planetList = new ArrayList<>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
        String saturn = "Saturn";
        planetList.add(saturn);
        Collections.swap(planetList, 6,7);
        Collections.swap(planetList, 5,6);
        System.out.println(planetList);
    }
}
