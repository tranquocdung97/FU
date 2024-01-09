/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b7;
import java.util.*;
/**
 *
 * @author PHUC
 */

public class B7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = s.nextInt();
        }
        Map<Integer, Integer> d = new TreeMap<>();
        for (int num : numbers) {
            d.put(num, d.getOrDefault(num, 0) + 1);
        }
        StringBuilder kq = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : d.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();
            kq.append(k).append(" - ").append(v).append("; ");
        }

        System.out.println(kq);
    }
}

