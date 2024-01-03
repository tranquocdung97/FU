import java.util.Scanner;

public class test {
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		else {
			for (int i = 2; i <= Math.sqrt(n); i++)
				if (n % i == 0)
					return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			if (isPrime(a[i]))
				System.out.print(a[i] + " ");
		}
	}
}
