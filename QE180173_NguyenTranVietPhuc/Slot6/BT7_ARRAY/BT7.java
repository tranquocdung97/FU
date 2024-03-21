/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bt7;

/**
 *
 * @author PHUC
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.printf("%d - %d; ", entry.getKey(), entry.getValue());
        }
        scanner.close();
    }
}
