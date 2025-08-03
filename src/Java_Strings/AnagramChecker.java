package Java_Strings;

import java.util.Arrays;

/**
 * This class checks whether two given strings are anagrams.
 * An anagram means both string contain the same characters in a different order.
 * * Example: "listen" and "silent" are anagrams.
 * Author: Sushil Yadav
 * Date: 2023-10-03
 */
public class AnagramChecker {
    /**
     * Main method to test the anagram checker.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + "  are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + "  are not anagrams.");
        }
    }

    /**
     * Checks if two strings are anagrams by comparing sorted character array.
     *
     * @param s1 First String
     * @param s2 Second String
     * @return true if both strings are anagrams, false otherwise.
     */
    public static boolean isAnagram(String s1, String s2) {
        //Remove whitespaces and convert to lower case
        String str1 = s1.replaceAll("\\s", "").toLowerCase();
        String str2 = s2.replaceAll("\\s", "").toLowerCase();
        //if length differ, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        // Convert to char arrays and sort
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        // Compare sorted arrays
        return Arrays.equals(chars1, chars2);

    }
}
