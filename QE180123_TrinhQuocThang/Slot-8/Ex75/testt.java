import java.util.Arrays;
import java.util.Scanner;

public class testt {

	public static int changeMoney(int arr[], int x) {
		int l[] = new int[x + 10];
		for (int i = 0; i < arr.length; i++)
			l[arr[i]] = 1;
		for (int i = 1; i <= x; i++)
			for (int j = 0; j < arr.length; j++)
				if (i > arr[j])
					if ((l[i] > l[i - arr[j]] + 1 && l[i - arr[j]] != 0) || (l[i] == 0 && l[i - arr[j]] != 0))
						l[i] = l[i - arr[j]] + 1;
		return l[x];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scanner.nextInt();
		int k = scanner.nextInt();
		System.out.println(changeMoney(arr, k));
		scanner.close();
	}
}