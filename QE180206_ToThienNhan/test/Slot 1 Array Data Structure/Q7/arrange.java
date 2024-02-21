import java.util.Scanner;

public class arrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[100001];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        for (int i = 0; i <= max; i++) {
            b[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            b[a[i]] += 1;
        }

        for (int i = 0; i <= max; i++) {
            if (b[i] > 0) {
                System.out.print(i + " - " + b[i] + "; ");
            }
        }
    }
}
