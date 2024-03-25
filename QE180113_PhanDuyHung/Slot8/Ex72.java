/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot8;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HUNG
 */
public class Ex72 {
    public static void quickSort(int[] a, int l, int r) {
        int p = a[(l + r) / 2];
        int i = l, j = r;
        while (i < j) {
            while (a[i] < p) {
                i++;
            }
            while (a[j] > p) {
                j--;
            }
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (i < r) {
            quickSort(a, i, r);
        }
        if (l < j) {
            quickSort(a, l, j);
        }
    }

    public static int solve(int[] a, int n) {
        int k = 1;
        quickSort(a, 0, n - 1);
        int stiffness = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            k = k + 1;
            stiffness = stiffness - 1;
            if (stiffness > a[i]) {
                stiffness = a[i];
            }
            if (stiffness == 0) {
                return k;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(solve(a, n));
    }
}

