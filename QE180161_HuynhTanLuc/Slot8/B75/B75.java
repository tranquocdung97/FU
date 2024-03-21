package b75;

import java.util.Scanner;

public class B75 {

    static int[] l = new int[100001];

    public static int moneyChange(int[] a, int n, int x) {
        for (int i = 0; i <= x; i++) {
            l[i] = Integer.MAX_VALUE; 
        }
        for (int i = 0; i < n; i++) {
            l[a[i]] = 1;
        }

        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= a[j] && (l[i - a[j]] != Integer.MAX_VALUE)) {
                    if (l[i] > l[i - a[j]] + 1) {
                        l[i] = l[i - a[j]] + 1;
                    }
                }
            }
        }
        if (l[x] == Integer.MAX_VALUE) {
            return 0;
        }
        return l[x];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(moneyChange(arr, n, x));
    }

}
