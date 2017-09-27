import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    Animal testObject;
    int expectedOutput1 = 49;
    int expectedOutput2 = 49;
    int expectedOutput3 = 51;

    @Before
    public void setUp() throws Exception {
        testObject = new Animal();
    }

    @After
    public void tearDown() throws Exception {
        testObject = null;
    }

    @Test
    public void eat() throws Exception {
        assertEquals(expectedOutput1,testObject.eat());
    }

    @Test
    public void drink() throws Exception {
        assertEquals(expectedOutput2,testObject.drink());
    }
    @Test
    public void play() throws Exception {
        assertEquals(expectedOutput3,testObject.play());
    }

}