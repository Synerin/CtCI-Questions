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
        char[] actual, expected;

        actual = "Mr John Smith    ".toCharArray();
        expected = "Mr%20John%20Smith".toCharArray();
        assertArrayEquals(expected, test.URLify(actual, 13));

        actual = " ".toCharArray();
        expected = new char[] {'\0'};
        assertArrayEquals(expected, test.URLify(actual, 0));

        actual = "Hello".toCharArray();
        expected = actual;
        assertArrayEquals(expected, test.URLify(actual, 5));

        actual = "a   b      ".toCharArray();
        expected = "a%20%20%20b".toCharArray();
        assertArrayEquals(expected, test.URLify(actual, 2));
    }

    @Test
    public void palindromePermutationTest() {
        assertTrue(test.palindromePermutation("Tact Coa"));
        assertTrue(test.palindromePermutation("racecar"));
        assertTrue(test.palindromePermutation("r4Ac E&^$#R       a.C"));
        assertFalse(test.palindromePermutation("abcdefgh"));
        assertTrue(test.palindromePermutation("aaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        assertTrue(test.palindromePermutation("abbcccc"));
        assertTrue(test.palindromePermutation("aabbcccc"));
        assertFalse(test.palindromePermutation("abbccc"));
    }

    @Test
    public void oneAwayTest() {
        assertTrue(test.oneAway("pale", "ple"));
        assertTrue(test.oneAway("pales", "pale"));
        assertTrue(test.oneAway("pale", "bale"));
        assertFalse(test.oneAway("pale", "bake"));
        assertFalse(test.oneAway("abc", "cba"));
        assertFalse(test.oneAway("a b c", "abc"));
        assertTrue(test.oneAway("abcdefghijkl", "abcefghijkl"));
        assertFalse(test.oneAway("abcdefghijkl", "abcefghiikl"));
    }

    @Test
    public void stringCompressionTest() {
        assertEquals("a2b1c5a3",test.stringCompression("aabcccccaaa"));
        assertEquals("abcba", test.stringCompression("abcba"));
        assertEquals("abccba", test.stringCompression("abccba"));
        assertEquals("aabaa", test.stringCompression("aabaa"));
        assertEquals("abcbabcbabb", test.stringCompression("abcbabcbabb"));
        assertEquals("", test.stringCompression(""));
    }

    @Test
    public void rotateMatrixTest() {
        int[][] actual, expected;

        actual = new int[][] {{1}};
        expected = new int[][] {{1}};
        assertArrayEquals(expected, test.rotateMatrix(actual));

        actual = new int[][] {{1,0}, {1,0}};
        expected = new int[][] {{1, 1}, {0, 0}};
        assertArrayEquals(expected, test.rotateMatrix(actual));

        actual = new int[][] {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        expected = new int[][] {{13,9,5,1}, {14,10,6,2}, {15,11,7,3}, {16,12,8,4}};
        assertArrayEquals(expected, test.rotateMatrix(actual));
    }
}