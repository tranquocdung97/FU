import java.util.Scanner;

public class testt {

	public static int cout(int arr[], int k, int left, int right) {
		return (left == right) ? (arr[left] == k) ? 1 : 0
				: cout(arr, k, left, (right + left) / 2) + cout(arr, k, (right + left) / 2 + 1, right);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scanner.nextInt();
		int k = scanner.nextInt();
		System.out.print(cout(arr, k, 0, arr.length - 1));
		scanner.close();
	}
}