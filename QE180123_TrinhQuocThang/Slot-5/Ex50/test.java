import java.util.Scanner;

public class test {
	public static int[] merge(int arr[], int brr[]) {
		int i = 0, j = 0, k = 0;
		int merge[] = new int[arr.length + brr.length];
		while (i < arr.length && j < brr.length) {
			if (arr[i] < brr[j]) {
				merge[k] = arr[i];
				i++;
				k++;
			} else {
				merge[k] = brr[j];
				j++;
				k++;
			}
		}
		if (i == arr.length) {
			while (j < brr.length) {
				merge[k] = brr[j];
				j++;
				k++;
			}
		}
		if (j == brr.length) {
			while (i < arr.length) {
				merge[k] = arr[i];
				i++;
				k++;
			}
		}
		return merge;
	}

	public static int[] sort(int arr[], int left, int right) {
		if (left == right) {
			int b[] = new int[1];
			b[0] = arr[left];
			return b;
		}
		int middle = (left + right) / 2;
		int arrL[] = sort(arr, left, middle);
		int arrR[] = sort(arr, middle + 1, right);
		int merge[] = merge(arrL, arrR);
		return merge;
	}

	public static boolean isPerfectSquare(int x) {
		return (Math.pow((int) Math.sqrt(x), 2) == x) ? true : false;
	}

	public static void countPeople(int arr[]) {
		boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++)
			if (isPerfectSquare(arr[i]) && arr[i] != arr[i + 1]) {
				System.out.print(arr[i] + " ");
				flag = true;
			}
		if (isPerfectSquare(arr[arr.length - 1]))
			System.out.println(arr[arr.length - 1]);
		if (!flag)
			System.out.println("NULL");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scanner.nextInt();
		arr = sort(arr, 0, arr.length - 1);
		countPeople(arr);
		scanner.close();
	}
}
