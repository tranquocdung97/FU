
package b62;

import java.util.Scanner;
import java.util.TreeMap;

public class B62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int value : arr) {
            treeMap.put(value, treeMap.getOrDefault(value, 0) + 1);
        }


        for (int key : treeMap.keySet()) {
            int frequency = treeMap.get(key);
            for (int i = 0; i < frequency; i++) {
                System.out.print(key + " ");
            }
        }
    }
}

