import java.util.Scanner;

public class test {

	public static int fibo(int n, int memo[]) {
		return (n < 2) ? 1 : memo[n] == 0 ? fibo(n - 1, memo) + fibo(n - 2, memo) : memo[n];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int memo[] = new int[10000];
		System.out.println(fibo(n - 1, memo));
		scanner.close();
	}
}