import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		int n;
		int a[] = new int[101];

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			System.out.print((int) Math.pow(a[i], 2) + " ");
		}
	}
}
