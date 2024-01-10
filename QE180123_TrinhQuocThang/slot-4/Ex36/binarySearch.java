import java.util.Scanner;

public class binarySearch {
	public static int binary(int[] arr, int x) {
		int start = 0, end = arr.length - 1;
		while (start < end) {
			int mid = (start + end) / 2;
			if (arr[mid] < x)
				start = mid + 1;
			else
				end = mid;
		}
		if (arr[start] == x)
			return start;
		else
			return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scanner.nextInt();
		int x = scanner.nextInt();
		System.out.println(binary(arr, x));
		scanner.close();
	}
}
