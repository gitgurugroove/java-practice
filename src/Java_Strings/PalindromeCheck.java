package Java_Strings;

/**
 * This class checks whether a given string is a palindrome
 * Palindrome is a word that reads the same forward and backward
 * <p>
 * Author: Sushil Yadav
 * Date: July 29, 2025
 */
public class PalindromeCheck {
    /**
     * Main method to test the palindrome checker.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam"; //Change this to test other words
        boolean isPalindrome = isPalindrome(input);
        if (isPalindrome) {
            System.out.println("\n" + input + " is a palindrome.");

        } else {
            System.out.println("\n" + input + " is not a palindrome.");
        }
    }

    /**
     * Check if the given string is a palindrome.
     *
     * @param str The input string
     * @return true if Palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed); //case insensitive comparison
    }

}
