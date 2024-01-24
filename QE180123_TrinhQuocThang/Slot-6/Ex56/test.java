import java.util.Scanner;

public class test {

	public static int gameGuessNumber(long n) {
		return (n == 1) ? 1 : 1 + gameGuessNumber(n / 2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		System.out.println(gameGuessNumber(n));
		scanner.close();
	}
}