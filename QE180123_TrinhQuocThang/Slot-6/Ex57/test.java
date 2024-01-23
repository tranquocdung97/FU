import java.util.Scanner;

public class test {
	static int count = 0;

	public static void countWays(int n, int k) {
		if (k == 0)
			count++;
		else {
			countWays(n * 2, k - 1);
			if ((n - 1) % 3 == 0 && (n / 3) % 2 == 1)
				countWays((n - 1) / 3, k - 1);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		countWays(n, k);
		System.out.println(count);
		scanner.close();
	}
}