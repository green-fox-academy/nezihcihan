import java.util.ArrayList;

public class GetIndex {


    public int getIndex(ArrayList<Integer> myList, int i) {
        for (int j = 0; j < myList.size(); j++) {
            if (myList.get(j) == i) {
                return j;
            }
        }
        return -1;
    }
}
