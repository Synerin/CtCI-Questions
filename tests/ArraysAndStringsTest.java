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
    public void checkPermutationTest() {
        assertTrue(test.checkPermutation("abc", "bca"));
        assertTrue(test.checkPermutation("abc", "abc"));
        assertFalse(test.checkPermutation("abc ", "cba"));
        assertTrue(test.checkPermutation("abc  ", " abc "));
    }

    @Test
    public void URLifyTest() {
        char[] test1, test2;

        test1 = "Mr John Smith   ".toCharArray();
        test2 = "Mr%20John%20Smith".toCharArray();
        assertEquals(test.URLify(test1, 13), test2);

        test1 = " ".toCharArray();
        test2 = new char[] {'\0'};
        assertEquals(test.URLify(test1, 0), test2);

        test1 = "Hello".toCharArray();
        test2 = test1;
        assertEquals(test.URLify(test1, 5), test2);

        test1 = "a   b".toCharArray();
        test2 = "a%20%20%20b".toCharArray();
        assertEquals(test.URLify(test1, 11), test2);
    }
}