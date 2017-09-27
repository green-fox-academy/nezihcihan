import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram testObject = new Anagram("dog","god");
    boolean expected = true;

    @Test
    public void anagramMethodTest() throws Exception {
        assertEquals(expected,testObject.anagramMethod());
    }
}