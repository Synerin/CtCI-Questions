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
        assertArrayEquals(test.URLify(actual, 13), expected);

        actual = " ".toCharArray();
        expected = new char[] {'\0'};
        assertArrayEquals(test.URLify(actual, 0), expected);

        actual = "Hello".toCharArray();
        expected = actual;
        assertArrayEquals(test.URLify(actual, 5), expected);

        actual = "a   b      ".toCharArray();
        expected = "a%20%20%20b".toCharArray();
        assertArrayEquals(test.URLify(actual, 2), expected);
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
}