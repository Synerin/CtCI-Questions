// Questions and (personal) solutions for Chapter 1: Arrays and Strings
public class ArraysAndStrings {

    public static void main(String[] args) {

    }

    // 1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters.
    public boolean isUnique(String str) {
        boolean chars[] = new boolean[256]; // Assuming input will be derived from ASCII

        for(int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);

            if(chars[val]) return false;

            chars[val] = true;
        }

        return true;
    }

    // 1.2 Check Permutation: Given two strings, write a method to decide of one is a permutation of the other.
    public boolean checkPermutation(String str, String perm) {
        if(str.length() != perm.length()) return false; // Permutations would have equal length

        int chars[] = new int[256]; // Assuming input will be derived from ASCII
        int i;

        for(i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            chars[val]++;
        }

        for(i = 0; i < perm.length(); i++) {
            int val = perm.charAt(i);

            chars[val]--;

            if(chars[val] < 0) return false;
            // In this line, I would have asked, "What about situations where a str has all characters in perm,
            // plus another? But because we already checked the length of the strings, this could not be the case.
            // If str and perm are not permutations, then either str and perm are of different lengths, or perm
            // has at least one character that str does not have.
        }

        return true;
    }

    /* 1.3 URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string has
                    sufficient space at the end to hold the additional characters, and that you are given the "true"
                    length of the string. (Note: If implementing in Java, please use a character array so that you
                    can perform this operation in place.)
     */
    public char[] URLify(char[] str, int length) {
        int displace = 0;

        for(int i = 0; i < length; i++) {
            if(str[i] == ' ') {
                // Will need to displace the characters after i + 2
                str[i] = '%';
                str[i + 1] = '2';
                str[i + 2] = '0';
            }
        }

        return str;
    }
}
