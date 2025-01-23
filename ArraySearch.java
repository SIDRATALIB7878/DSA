import java.util.Scanner;

public class ArraySearch {
    public static void search(int[] array, int item) {
        // Search for the item in the array
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                index = i;
                break;
            }
        }

        // Check if item exists
        if (index == -1) {
            System.out.println("Item " + item + " does not exist in the array.");
            return;
        }

        System.out.println("Item " + item + " found at index " + index + ".");

        // Print two right neighbors
        if (index + 2 < array.length) {
            System.out.println("Right neighbors: " + array[index + 1] + ", " + array[index + 2]);
        } else if (index + 1 < array.length) {
            System.out.println("Right neighbor: " + array[index + 1] + ". No second right neighbor.");
        } else {
            System.out.println("No right neighbors.");
        }

        // Print two left neighbors
        if (index - 2 >= 0) {
            System.out.println("Left neighbors: " + array[index - 1] + ", " + array[index - 2]);
        } else if (index - 1 >= 0) {
            System.out.println("Left neighbor: " + array[index - 1] + ". No second left neighbor.");
        } else {
            System.out.println("No left neighbors.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array
        int[] array = {10, 20, 30, 40, 50}; // Example initial array

        // Display array
        System.out.println("Current array: ");
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println("\n");

        // Accept user input
        System.out.print("Enter the ITEM to search: ");
        int item = scanner.nextInt();

        // Perform search
        search(array, item);

        scanner.close();
    }
}
