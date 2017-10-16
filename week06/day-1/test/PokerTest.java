import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class PokerTest {

    Poker pokerTest = new Poker();
    @Test
    public void test1() {
        assertTrue(pokerTest.colors.contains("C"));
    }
    @Test
    public void test2() {
        assertTrue(pokerTest.values.contains("2"));
    }
    @Test
    public void test3() {
        assertEquals(14,pokerTest.biggestCards(pokerTest.cards));
    }
    @Test
    public void test4() {
        assertEquals(11,pokerTest.biggestCards(pokerTest.cards2));
    }
    @Test
    public void test5() {
        assertEquals(13,pokerTest.compareCards(pokerTest.cards,pokerTest.cards2));
    }





}