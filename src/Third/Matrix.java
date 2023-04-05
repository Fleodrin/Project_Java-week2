package Third;

public class Matrix {
    public static void main(String[] args) {
        // Define two-dimensional arrays
        int[][] matrixA = {{1, 0, 2}, {-1, 3, 1}};
        int[][] matrixB = {{3, 1}, {2, 1}, {1, 0}};
        int[][] result = new int[matrixA.length][matrixB[0].length];

        // We use the for loop to calculate the matrix.
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Print the result of matrix A and matrix B
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
