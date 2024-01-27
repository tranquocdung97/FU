import java.util.Scanner;

public class test {
	public static void generateCombinations(int arr[], int k, int start, String current) {
		if (k == 0) {
			System.out.print(current + " ");
		} else
			for (int i = start; i < arr.length; i++)
				generateCombinations(arr, k - 1, i + 1, current + arr[i]);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = i + 1;
		generateCombinations(arr, k, 0, "");
		scanner.close();
	}
}