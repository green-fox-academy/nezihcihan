import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GetIndexTest {
    ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(2));
    GetIndex valami = new GetIndex();

    @Test
    public void getIndex1() throws Exception {
        assertEquals(-1,valami.getIndex(myList,1));
    }

    @Test
    public void getIndex2() throws Exception {
        assertEquals(0,valami.getIndex(myList, 2));
    }
}