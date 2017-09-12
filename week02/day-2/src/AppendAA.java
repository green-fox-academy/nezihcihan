// - Create an array variable named `nimals`
//   with the following content: `["kuty", "macsk", "cic"]`
// - Add all elements an `"a"` at the end
public class AppendAA {
    public static void main(String[] args) {
        String[] animals = {"kuty", "macsk", "cic"};
        for(int i = 0; i < animals.length; i++) {
            animals[i] = animals[i] + "A";
        }
        for (int j = 0; j < animals.length; j++){
            System.out.println(animals[j]);
        }
    }
}
