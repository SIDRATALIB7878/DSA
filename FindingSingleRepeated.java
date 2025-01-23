public class FindingSingleRepeated {
    public static int findRepeated(int[] A) {
        int n = A.length;
        int expectedSum = (n - 1) * n / 2; // Sum of numbers from 1 to n-1
        int actualSum = 0;

        for (int num : A) {
            actualSum += num;
        }

        return actualSum - expectedSum; // The difference gives the repeated number
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 4, 2, 5, 3}; // Example array

        System.out.println("The repeated number is: " + findRepeated(A));
    }
}


