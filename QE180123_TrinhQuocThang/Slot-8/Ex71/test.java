import java.util.Scanner;

public class test {

	public static int[] merge(int arrL[], int arrR[]) {
		int merge[] = new int[arrL.length + arrR.length];
		int i = 0, j = 0, k = 0;
		while (i < arrL.length && j < arrR.length) {
			if (arrL[i] > arrR[j]) {
				merge[k] = arrL[i];
				i++;
				k++;
			} else {
				merge[k] = arrR[j];
				j++;
				k++;
			}
		}

		if (i == arrL.length)
			while (j < arrR.length) {
				merge[k] = arrR[j];
				j++;
				k++;
			}
		if (j == arrR.length)
			while (i < arrL.length) {
				merge[k] = arrL[i];
				i++;
				k++;
			}
		return merge;
	}

	public static int[] sort(int arr[], int left, int right) {
		if (left == right) {
			int brr[] = new int[1];
			brr[0] = arr[left];
			return brr;
		}

		int middle = (left + right) / 2;
		int arrL[] = sort(arr, left, middle);
		int arrR[] = sort(arr, middle + 1, right);

		return merge(arrL, arrR);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scanner.nextInt();
		arr = sort(arr, 0, arr.length - 1);
		int k = 1;
		int max = 0;
		for (int i = n - 1; i >= 0; i--) {
			max = Math.max(max, arr[i] + k);
			k++;
		}
		System.out.println(max);
		scanner.close();
	}
}