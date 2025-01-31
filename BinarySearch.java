public class BinarySearch {
    
    // Iterative Binary Search
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target)
                return mid; // Target found
            
            if (arr[mid] < target)
                left = mid + 1; // Search right half
            else
                right = mid - 1; // Search left half
        }
        return -1; // Target not found
    }

    // Recursive Binary Search
    public static int binarySearchRecursive(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target)
                return mid; // Target found
            
            if (arr[mid] < target)
                return binarySearchRecursive(arr, mid + 1, right, target); // Search right half
            
            return binarySearchRecursive(arr, left, mid - 1, target); // Search left half
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 10;

        // Iterative Search
        int resultIterative = binarySearchIterative(arr, target);
        System.out.println("Iterative Search: " + (resultIterative != -1 ? "Found at index " + resultIterative : "Not found"));

        // Recursive Search
        int resultRecursive = binarySearchRecursive(arr, 0, arr.length - 1, target);
        System.out.println("Recursive Search: " + (resultRecursive != -1 ? "Found at index " + resultRecursive : "Not found"));
    }
}
