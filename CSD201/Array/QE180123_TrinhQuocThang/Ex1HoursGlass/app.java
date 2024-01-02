import java.util.Scanner;

public class app {
	public static int sum(int a[][], int i, int j) {
		return a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int a[][] = new int[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = scanner.nextInt();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < m - 2; i++)
			for (int j = 0; j < n - 2; j++)
				max = Math.max(sum(a, i, j), max);
		System.out.println(max);
		scanner.close();
	}
}
