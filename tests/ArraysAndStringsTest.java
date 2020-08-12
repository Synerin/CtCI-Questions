import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysAndStringsTest {
    ArraysAndStrings test = new ArraysAndStrings();

    @Test
    public void isUniqueTest() {
        assertTrue(test.isUnique("abc"));
        assertTrue(test.isUnique("abcdefghijklmnopqrstuvwxyz"));
        assertTrue(test.isUnique(""));
        assertTrue(test.isUnique("a"));
        assertFalse(test.isUnique("aa"));
        assertFalse(test.isUnique("a b c"));
        assertTrue(test.isUnique("1234567890"));
    }

    @Test
    public void checkPermutation() {
        assertTrue(test.checkPermutation("abc", "bca"));
        assertTrue(test.checkPermutation("abc", "abc"));
        assertFalse(test.checkPermutation("abc ", "cba"));
        assertTrue(test.checkPermutation("abc  ", " abc "));
    }
}