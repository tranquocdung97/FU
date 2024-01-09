import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int sum = calculateMatrixSum(a, m, n);

        System.out.println(sum);
    }

    private static int calculateMatrixSum(int[][] matrix, int rows, int cols) {
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }
}
