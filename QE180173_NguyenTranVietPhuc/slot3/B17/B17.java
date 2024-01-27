/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b17;

import java.util.*;

public class B17 {
    public static void transformQueue(Queue<Integer> queue, int k) {
        for (int i = 0; i < k; i++) {
            if (!queue.isEmpty()) {
                int firstElement = queue.remove();
                queue.add(firstElement);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            queue.add(element);
        }
        int k = scanner.nextInt();
        transformQueue(queue, k);
        while (!queue.isEmpty()) {
            int element = queue.remove();
            System.out.print(element + " ");
        }
    }
}