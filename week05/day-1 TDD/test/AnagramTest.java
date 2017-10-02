import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    Anagram valami = new Anagram();


    @Test
    public void Anagram() throws Exception {
        assertTrue(valami.checkAnagram("A","A"));
    }

    @Test
    public void Anagram1() throws Exception {
        assertFalse(valami.checkAnagram("B","A"));
    }

    @Test
    public void Anagram3() throws Exception {
        assertTrue(valami.checkAnagram("BA","AB"));
    }
}