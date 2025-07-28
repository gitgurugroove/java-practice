package Java_Strings;

/**
 * This class provides a utility method to reverse a string.
 * It demonstrates use of StringBuilder and basic Java concepts.
 *
 * Author: Sushil Yadav
 * Date: July 27, 2025
 */
public class ReverseString {

    /**
     * The main method is the entry point of the program.
     * It calls the reverseString method and prints the result.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "AI Automation will be the future of Quality Engineering"; // Original string to reverse
        String reversed = reverseString(input); // Reversed result
        System.out.println("\n" +"Reversed String is: " + reversed);
    }

    /**
     * Reverses the given string using StringBuilder.
     *
     * @param str The string to reverse
     * @return The reversed string
     */
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString(); // Using built-in reverse()
    }
}
