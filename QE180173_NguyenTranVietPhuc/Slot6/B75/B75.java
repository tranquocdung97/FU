/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b75;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author PHUC
 */
public class B75 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int minBanknotes = calculateMinBanknotes(arr, x);
        System.out.println(minBanknotes);
    }
    public static int calculateMinBanknotes(int[] arr, int x) {
        int[] dp = new int[x + 1];
        Arrays.fill(dp, Integer.MAX_VALUE); 
        dp[0] = 0; 
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] <= i && dp[i - arr[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - arr[j]] + 1);
                }
            }
        }
        return dp[x] == Integer.MAX_VALUE ? 0 : dp[x];
    }
}
