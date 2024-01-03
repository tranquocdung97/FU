import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int a[][] = new int[m][n];
		int sum=0;
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				a[i][j] = scanner.nextInt();
				sum+=a[i][j];
			}
		System.out.println(sum);
	}
}
