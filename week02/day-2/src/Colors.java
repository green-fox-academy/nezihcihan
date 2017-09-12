// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"
public class Colors {
    public static void main(String[] args) {
        String arr[][] = new String[2][2];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (col == 0 && row == 0) {
                    arr[row][col] = "green";
                }
                if (col == 1 && row == 1) {
                    arr[row][col] = "red";
                }
                if (col == 2 && row == 2) {
                    arr[row][col] = "pink";
                }
                else {
                    arr[row][col] = "white";
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
