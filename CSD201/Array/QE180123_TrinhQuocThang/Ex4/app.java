import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scanner.nextInt();
		int k = scanner.nextInt();
		int x = scanner.nextInt();
		if (k >= 0 && k <= a.length) {
			int b[] = new int[a.length + 1];
			for (int i = b.length - 1; i > k; i--)
				b[i] = a[i - 1];
			b[k] = x;
			for (int i = k - 1; i >= 0; i--)
				b[i] = a[i];
			for (int i : b) {
				System.out.print(i + " ");
			}
		} else
			System.err.println("Invalid index!!!");

	}
}
