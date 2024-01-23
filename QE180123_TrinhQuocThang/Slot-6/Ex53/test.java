import java.util.Scanner;

public class test {

	public static long pow(int n, int m) {
		return (m == 0) ? 1 : n * pow(n, m - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		System.out.println(pow(n, m));
		scanner.close();
	}
}
