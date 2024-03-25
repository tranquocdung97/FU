/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b73;

/**
 *
 * @author PHUC
 */
import java.util.Scanner;
public class B73 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();

        int soLanXuatHien = demSoLanXuatHien(arr, x);
        System.out.println(soLanXuatHien);
    }

    public static int demSoLanXuatHien(int[] arr, int x) {
        int dem = 0;
        for (int num : arr) {
            if (num == x) {
                dem++;
            }
        }
        return dem;
    }
}