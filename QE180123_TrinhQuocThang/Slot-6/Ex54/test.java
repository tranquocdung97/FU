import java.util.Scanner;

public class test {

	public static int GCD(int n, int m) {
		return (m == 0) ? n : GCD(m, n % m);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		System.out.println(GCD(n, m));
		scanner.close();
	}
}