import java.util.Scanner;

public class linearSearch {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, indexMin = -1, indexmax = -1;
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i] < min) {
				min = arr[i];
				indexMin = i;
			}
			if (arr[i] >= max) {
				max = arr[i];
				indexmax = i;
			}
		}

		int temp = arr[indexMin];
		arr[indexMin] = arr[indexmax];
		arr[indexmax] = temp;
		for (int i : arr)
			System.out.print(i + " ");
		scanner.close();
	}
}
