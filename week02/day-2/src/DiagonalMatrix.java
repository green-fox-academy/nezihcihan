// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
public class DiagonalMatrix {
    public static void main(String[] args) {
        int [] [] arr = new int[4][4];
        for(int row = 0; row < 4; row++){
            for(int col = 0; col < 4; col++) {
                if(col == row){
                    arr[row][col] = 1;
                }
                else {
                    arr[row][col] = 0;
                }
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
