import java.util.Scanner;

public class Main {

    static int[] a = new int[100];
    static int[] l = new int[100];

    static void print(int[] a, int l, int r) {
        for (int i = l; i <= r; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        l[0] = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] >= a[i - 1]) {
                l[i] = l[i - 1] + 1;
            } else {
                l[i] = 1;
            }
        }
        int Max = 0;
        for (int i = 0; i < n; i++) {
            if (l[Max] < l[i]) {
                Max = i;
            }
        }
        print(a, Max - l[Max] + 1, Max);
    }
}
