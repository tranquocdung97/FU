import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scanner.nextInt();
		int max = Integer.MIN_VALUE;
		for (int i : a)
			if (max < i)
				max = i;
		int b[] = new int[max+1];
		for (int i : a)
			b[i] += 1;
		for (int i = 0; i <= max; i++)
			if (b[i] > 0)
				System.out.print(i + " - " + b[i] + "; ");
	}
}
