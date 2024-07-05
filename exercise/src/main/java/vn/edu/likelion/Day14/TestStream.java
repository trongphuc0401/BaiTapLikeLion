package vn.edu.likelion.Day14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TestStream -
 *
 * @param
 * @return
 * @throws
 */
public class TestStream {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");

        // Filter the list to include only fruits that start with 'B' or 'D' and convert to an array
        String[] filteredFruitsArray = fruits.stream()
                .filter(fruit -> fruit.startsWith("B") || fruit.startsWith("D"))
                .toArray(String[]::new);

        // Print the array
        System.out.println(Arrays.toString(filteredFruitsArray));
    }
}
