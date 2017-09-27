import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

    ArrayList<Integer> sampleList = new ArrayList<>(Arrays.asList(10,20,30));
    Sum testSum = new Sum(sampleList);
    Integer expected = 60;

    @Test
    public void sumMethodTest1() throws Exception {
        assertEquals(expected,testSum.sumMethod());
    }

}