import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
    String fruit = "apples";
    String expected = fruit;
    Apples appleClass = new Apples();
    String output = appleClass.getApple();

    @Test
    public void testGetApple() throws Exception {
        assertEquals(expected, output);
    }
}