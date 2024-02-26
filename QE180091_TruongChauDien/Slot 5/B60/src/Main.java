import java.util.Scanner;

public class Main {
    private static int[] a = new int[11];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        a[0] = 0;
        recursion(1, n, k);
    }

    private static void recursion(int h, int n, int k) {
        for (int i = a[h - 1] + 1; i <= n - (k - h); i++) {
            a[h] = i;
            if (h == k) printArray(a, k);
            else {
                recursion(h + 1, n, k);
            }
        }
    }

    private static void printArray(int[] a, int k){
        for (int i = 1; i <= k; i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
}
