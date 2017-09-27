import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

    Extension extension = new Extension();

    @Test
    void testAdd_2and3is5() {
        assertEquals(6, extension.add(3, 3));
    }

    @Test
    void testAdd_1and4is5() {
        assertEquals(5, extension.add(1, 4));
    }

    @Test
    void testMaxOfThree_first() {
        assertEquals(9, extension.maxOfThree(5, 4, 9));
    }

    @Test
    void testMaxOfThree_third() {
        assertEquals(7, extension.maxOfThree(3, 7, 5));
    }

    @Test
    void testMedian_four() {
        assertEquals(5, extension.median(Arrays.asList(7,5,3,5)));
    }

    @Test
    void testMedian_five() {
        assertEquals(7, extension.median(Arrays.asList(1,2,3,4,5,10,20,14)));
    }

    @Test
    void testIsVowel_a() {
        assertTrue(extension.isVowel('a'));
    }

    @Test
    void testIsVowel_o() {
        assertTrue(extension.isVowel('o'));
    }

    @Test
    void testTranslate_kolbice() {
        assertEquals("avapeve", extension.translate("ape"));
    }
}