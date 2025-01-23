//  Program to find the transpose of a 2D matrix
public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] transpose = findTranspose(matrix);

        System.out.println("Transpose of the Matrix:");
        printMatrix(transpose);

        //  Calculate diagonal sums for a square matrix
        if (isSquareMatrix(matrix)) {
            int leftDiagonalSum = calculateLeftDiagonalSum(matrix);
            int rightDiagonalSum = calculateRightDiagonalSum(matrix);

            System.out.println("Left Diagonal Sum: " + leftDiagonalSum);
            System.out.println("Right Diagonal Sum: " + rightDiagonalSum);
        } else {
            System.out.println("Matrix is not a square matrix. Diagonal sums cannot be calculated.");
        }
    }

    // Function to find the transpose of a matrix
    public static int[][] findTranspose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Function to calculate the left diagonal sum of a square matrix
    public static int calculateLeftDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    // Function to calculate the right diagonal sum of a square matrix
    public static int calculateRightDiagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][n - i - 1];
        }
        return sum;
    }

    // Helper function to check if a matrix is square
    public static boolean isSquareMatrix(int[][] matrix) {
        return matrix.length == matrix[0].length;
    }

    // Helper function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
