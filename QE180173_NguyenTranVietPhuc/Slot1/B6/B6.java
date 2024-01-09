/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b6;

import java.util.*;

public class B6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];

        System.out.println("Nhập vào " + n + " số nguyên dương:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Đếm tần số xuất hiện của các số trong dãy
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : a) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        // In tần số xuất hiện ra màn hình
        System.out.print("Tần số xuất hiện của các số trong dãy: ");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.print(entry.getKey() + " - " + entry.getValue() + "; ");
        }
    }
}
