import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		int n;
		int a[] = new int[101];

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt(); // Lệnh nhập giá trị của n từ bàn phím.
		int sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt(); // Nhập các phần tử trong dãy.
			sum += a[i];
		}
		System.out.print(sum);
	}
}
