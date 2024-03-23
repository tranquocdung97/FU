import java.util.Scanner;

public class EX73{
    public static int count(int[] a, int l, int r, int x) {
        if (l == r) {
            if (a[l] == x)
                return 1;
            else
                return 0;
        } else {
            int m = (l + r) / 2;
            return count(a, l, m, x) + count(a, m + 1, r, x);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, x;
        n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        x = scanner.nextInt();

        int result = count(a, 0, n - 1, x);
        System.out.println(result);
    }
}