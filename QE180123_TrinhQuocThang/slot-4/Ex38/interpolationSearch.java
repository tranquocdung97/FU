import java.util.Scanner;

public class interpolationSearch {

	public static int interpolation(int[] arr, int x) {
		int left = 0, right = arr.length - 1;
		while (arr[left] != arr[right] && x >= arr[left] && x <= arr[right]) {
			int mid = left + (right - left) * (x - arr[left]) / (arr[right] - arr[left]);
			if (arr[mid] < x)
				left = mid + 1;
			else if (arr[mid] > x)
				right = mid - 1;
			else if (mid > 0 && arr[mid - 1] == x)
				right = mid - 1;
			else
				return mid;
		}
		if (arr[left] == x) {
			return left;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scanner.nextInt();
		int x = scanner.nextInt();
		System.out.println(interpolation(arr, x));
		scanner.close();
	}
}
