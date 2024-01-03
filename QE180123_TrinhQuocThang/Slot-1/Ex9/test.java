import java.util.Scanner;

public class test {
	public static int[] merge(int a[], int b[]) {
		int i = 0, j = 0, k = 0;
		int c[] = new int[a.length + b.length];

		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				i++;
				k++;
			} else {
				c[k] = b[j];
				j++;
				k++;
			}
		}

		if (i == a.length) {
			while (j < b.length) {
				c[k] = b[j];
				j++;
				k++;
			}
		}

		if (j == b.length) {
			while (i < a.length) {
				c[k] = a[i];
				i++;
				k++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int a[] = new int[m];
		for (int i = 0; i < m; i++)
			a[i] = scanner.nextInt();
		int n = scanner.nextInt();
		int b[] = new int[n];
		for (int i = 0; i < n; i++)
			b[i] = scanner.nextInt();
		int c[] = merge(a, b);
		for (int i : c) {
			System.out.print(i + " ");
		}
	}
}
