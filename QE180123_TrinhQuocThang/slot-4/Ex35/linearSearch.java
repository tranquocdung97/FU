import java.util.Scanner;

public class linearSearch {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scanner.nextInt();
		int count = -1;
		for (int i = 0; i < n; i += 2)
			if (arr[i] % 2 != 0) {
				count = 0;
				System.out.print(arr[i] + " ");
			}
		if (count != 0)
			System.out.print("NULL");
	}
}
