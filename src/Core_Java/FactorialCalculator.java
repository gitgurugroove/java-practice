package Core_Java;

/**
 * This class demonstrates how to calculate the factorial of a number.
 * using both recursion and iteration.
 * <p>
 * Author: Sushil Yadav
 * Date: September 1, 2025
 */
public class FactorialCalculator {
    /**
     * Main method to test both factorial implementations.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial (Loop) of " + number + " = " + factorialLoop(number));
        System.out.println("Factorial (Recursion) of " + number + " = " + factorialRecursion(number));

    }

    /**
     * Calculates factorial using loop.
     *
     * @param n number to find factorial
     * @return Factorial result
     */

    public static int factorialLoop(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Calculates factorial using recursion.
     *
     * @param n number to find factorial
     * @return Factorial result
     */
    public static int factorialRecursion(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }


}
