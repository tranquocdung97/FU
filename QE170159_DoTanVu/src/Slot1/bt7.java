
package Slot1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class bt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }
        Map<Integer, Integer> sortedMap = new TreeMap<>(frequencyMap);
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            System.out.printf("%d - %d; ", entry.getKey(), entry.getValue());
        }
        scanner.close();
    }
}
