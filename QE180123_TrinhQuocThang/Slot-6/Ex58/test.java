import java.util.Scanner;

public class test {

	public static void binary(int n, String result) {
		if (result.length() == n)
			System.out.print(result + " ");
		else {
			binary(n, result + "0");
			binary(n, result + "1");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String result = "";
		binary(n, result);
		scanner.close();
	}
}