
package b76;

import java.util.Scanner;


public class B76 {

    public static int chooseGifts(int[] a, int n) {
    int[][] dp = new int[2][n];
    for (int i = 0; i < n; i++)
        dp[0][i] = a[i];

    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (a[i] == a[j]) {
          dp[1][i] = Math.max(dp[1][i], dp[0][j] + a[i]);
        }
      }

      for (int j = 0; j < i; j++) {
        dp[0][i] = Math.max(dp[0][i], dp[1][j] + a[i]);
      }
    }

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < 2; i++)
      for (int j = 0; j < n; j++)
        max = Math.max(max, dp[i][j]);

    return max;
  }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(chooseGifts(arr, n));
    } 
}
