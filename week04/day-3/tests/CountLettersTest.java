import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {
    CountLetters testObject;
    String sample;
    HashMap<Character, Integer> expected = new HashMap<Character, Integer>();
    @Before
    public void setUp() throws Exception {
        testObject = new CountLetters();
        expected.put('d',1);
        expected.put('o',2);
        expected.put('r',1);
    }
    @After
    public void tearDown() throws Exception {
        testObject = null;
    }
    @Test
    public void countLettersMethods() throws Exception {
        assertEquals(expected,testObject.countLettersMethods("door"));
    }
}