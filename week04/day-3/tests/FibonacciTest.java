import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    Fibonacci testObject;
    int expectedResult;

    @Before
    public void setUp() throws Exception {
        testObject = new Fibonacci();
        expectedResult = 55;
    }

    @After
    public void tearDown() throws Exception {
        testObject = null;
    }

    @Test
    public void fibonacciTest() throws Exception {
        assertEquals(expectedResult,testObject.fibonacci(10));
    }
}