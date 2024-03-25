import java.util.Scanner;

public class Main {

    static int[] a = new int[100];
    static int[] b = new int[100];
    static int[] t = new int[100];
    static int[] result = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] >= a[j] && b[j] + 1 > b[i]) {
                    b[i] = b[j] + 1;
                    t[i] = j;
                }
            }
        }
        int Max = 0;
        for (int i = 1; i < n; i++) {
            if (b[Max] < b[i]) {
                Max = i;
            }
        }
        int k = b[Max];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = a[Max];
            Max = t[Max];
        }
        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
