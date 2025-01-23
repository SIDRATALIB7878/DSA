import java.util.Arrays;
import java.util.Collections;

public class SortedArray {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 3, 8, 1, 2};
        Integer[] numbersDescending = Arrays.stream(numbers).boxed().toArray(Integer[]::new);

        // Sorting in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));

        // Sorting in descending order
        Arrays.sort(numbersDescending, Collections.reverseOrder());
        System.out.println("Sorted array in descending order: " + Arrays.toString(numbersDescending));
    }
}
