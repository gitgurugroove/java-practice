package Java_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ListManipulation {
    /**
     * A list having null values in it, remove the null values, and print the list.
     *
     * @param fruits - List of fruits with null values
     *               Example: ["Apple", null, "Banana", null, "Orange"]
     */
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", null, "Banana", null, "Orange", "Mango", null, "Papaya"));
        System.out.println("Original List: " + fruits);

        //Removing null values using lambda expression
        fruits.removeIf(Objects::isNull);

        System.out.println("List after removing null values: " + fruits);

    }
}
