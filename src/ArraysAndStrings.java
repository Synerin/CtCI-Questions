// Questions and (personal) solutions for Chapter 1: Arrays and Strings
public class ArraysAndStrings {

    public static void main(String[] args) {

    }



    // 1.1 Is Unique
    public boolean isUnique(String str) {
        boolean[] chars = new boolean[256]; // Assuming input will be derived from ASCII

        for(int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);

            if(chars[val]) return false;

            chars[val] = true;
        }

        return true;
    }



    // 1.2 Check Permutation
    public boolean checkPermutation(String str, String perm) {
        if(str.length() != perm.length()) return false; // Permutations would have equal length

        int[] chars = new int[256]; // Assuming input will be derived from ASCII
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



    // 1.3 URLify
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



    // 1.4 Palindrome Permutation
    public boolean palindromePermutation(String str) {
        int[] chars = new int[26]; // Hash of lowercase alphabet
        int odds = 0; // Keeps track of how many characters have an odd number of occurrences
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if(current > 96 && current < 123) { // Consider only lowercase ASCII characters
                chars[current - 97]++;

                if(chars[current - 97] % 2 == 1) {
                    odds++;
                } else {
                    odds--;
                }
            }
        }

        return odds < 2;
    }



    // 1.5 One Away
    public boolean oneAway(String str, String edit) {
        return false;
    }
}
