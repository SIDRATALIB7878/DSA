import java.util.Scanner;

public class ArrayInsertion {
    public static void insert(int[] array, int k, int item) {
        // Check if K is in range
        if (k < 0 || k >= array.length) {
            System.out.println("Error: Index K is out of range.");
            return;
        }

        // Check if ITEM is a positive integer
        if (item <= 0) {
            System.out.println("Error: ITEM must be a positive integer.");
            return;
        }

        // Check if ITEM at index K is greater or less
        if (array[k] > item) {
            // Insert the item at index K
            array[k] = item;
            System.out.println("Inserted ITEM at index " + k + ": " + item);
        } else {
            System.out.println("ITEM at index " + k + " (" + array[k] + ") is greater than user's entered ITEM (" + item + "). No operation performed.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array
        int[] array = {10, 20, 30, 40, 50}; // Example initial array

        // Accept user input
        System.out.println("Current array: ");
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println("\n");

        System.out.print("Enter the index K (0-based): ");
        int k = scanner.nextInt();

        System.out.print("Enter the ITEM to insert: ");
        int item = scanner.nextInt();

        // Perform insertion
        insert(array, k, item);

        // Display updated array
        System.out.println("\nUpdated array: ");
        for (int val : array) {
            System.out.print(val + " ");
        }

        scanner.close();
    }
}
