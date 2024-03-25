/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot8;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Ex73 {

    public static int count(int[] a, int l, int r, int x) {
        if (l == r) {
            if (a[l] == x) return 1;
            else return 0;
        } else {
            int m = (l + r) / 2;
            return count(a, l, m, x) + count(a, m + 1, r, x);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        System.out.println(count(a, 0, n - 1, x));
    }
}

