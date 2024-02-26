import java.util.Scanner;

public class sumArray {

	public static void indexSumArray(int arr[], int x) {
		for (int i = 0; i < arr.length - 1; i++) {
			int start = i;
			int sum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				int end = j;
				sum += arr[j];
				if (sum > x)
					break;
				if (sum == x) {
					for (int k = start; k <= end; k++)
						System.out.print(arr[k] + " ");
				}
			}
		}
		System.out.println(-1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scanner.nextInt();
		int x = scanner.nextInt();
		indexSumArray(arr, x);
		scanner.close();
	}
}
