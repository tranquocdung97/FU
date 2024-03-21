/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b78;

import java.util.Scanner;

/**
 *
 * @author Tan Luc
 */
public class B78 {

    public static int[] longestSubsequence(int[] a, int n) {
        int[] b = new int[n];
        int[] t = new int[n];
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

        int csMax = 0;
        for (int i = 0; i < n; i++) {
            if (b[csMax] < b[i]) {
                csMax = i;
            }
        }

        int k = b[csMax];
        int[] kq = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            kq[i] = a[csMax];
            csMax = t[csMax];
        }

        return kq;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] kq = longestSubsequence(a, n);
        for (int i = 0; i < kq.length; i++) {
            System.out.print(kq[i] + " ");
        }
    }
}
