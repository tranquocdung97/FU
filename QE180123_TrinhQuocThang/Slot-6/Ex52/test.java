import java.util.Scanner;

public class test {

	public static long fact(int n) {
		return (n == 0 || n == 1) ? 1 : n * fact(n - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(fact(n));
		scanner.close();
	}
}