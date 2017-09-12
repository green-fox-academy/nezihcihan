// - Create an array variable named `nimals`
//   with the following content: `["kuty", "macsk", "cic"]`
// - Add all elements an `"a"` at the end
public class AppendAA {
    public static void main(String[] args) {
        String[] nimals = {"kuty", "macsk", "cic"};
        for(int i = 0; i < nimals.length; i++) {
            nimals[i] = nimals[i] + "A";
        }
        for (int j = 0; j < nimals.length; j++){
            System.out.println(nimals[j]);
        }
    }
}
