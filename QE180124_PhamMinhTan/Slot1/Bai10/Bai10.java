import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.nextLine();
        int columns = sc.nextInt();
        sc.nextLine();
        int[][] matrix = new int[rows][columns];
        inputElement (matrix, sc);
        countSum (matrix);
    }

    private static void countSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }

    private static int[][] inputElement(int[][] matrix, Scanner sc) {
        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
}
