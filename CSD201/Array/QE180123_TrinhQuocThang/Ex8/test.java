import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scanner.nextInt();
		boolean flag = true;
		if (n > 1) {  
			for (int i = 2; i < a.length - 2 & flag; i++)
				if ((a[i - 1] - a[i - 2]) * (a[i] - a[i - 1]) < 0)
					flag = false ; 
		}
		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
