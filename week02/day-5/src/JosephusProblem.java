import java.util.ArrayList;
public class JosephusProblem {
    public static void main(String[] args) {
        int numOfPeople = 7;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < numOfPeople ; i++) {
            list.add("" + (1 + i));
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        while (list.size() > 1) {
            if(list.size() % 2 != 0) {
                for (int j = 0; j < list.size(); j= j+2) {
                    list.remove(j+1);
                }
                //for (int i = 0; i < list.size() ; i = i + 2) {
                //    list.remove(i);
                //}
            }
            /**else {
                for (int i = 1; i < list.size() ; i = i +2) {
                    list.remove(i);
                }
            }**/
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
