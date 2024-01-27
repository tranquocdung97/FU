import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class test {
	static List<String> list = new ArrayList<>();

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void generatePermutations(int arr[], int start) {
		if (arr.length - 1 == start) {
			String result = "";
			for (int i : arr)
				result += i;
			list.add(result);
		} else {
			for (int i = start; i < arr.length; i++) {
				swap(arr, start, i);
				generatePermutations(arr, start + 1);
				swap(arr, start, i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = i + 1;
		generatePermutations(arr, 0);
		Collections.sort(list);
		for (String string : list)
			System.out.print(string + " ");
		scanner.close();
	}
}