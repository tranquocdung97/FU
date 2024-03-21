/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b78;

/**
 *
 * @author PHUC
 */
import java.util.ArrayList;
import java.util.Scanner;
public class B78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        ArrayList<Integer> result = timDayKhongGiamDaiNhat(a);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static ArrayList<Integer> timDayKhongGiamDaiNhat(int[] a) {
        int n = a.length;
        int[] dp = new int[n];
        int[] prev = new int[n];
        int maxLen = 1;
        int lastIdx = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            prev[i] = -1;
            for (int j = 0; j < i; j++) {
                if (a[i] >= a[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                lastIdx = i;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        while (lastIdx != -1) {
            result.add(0, a[lastIdx]);
            lastIdx = prev[lastIdx];
        }
        return result;
    }
}
