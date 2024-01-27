/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_17;

/**
 *
 * @author LENOVO
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EX_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Nhap day so:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            queue.offer(num);
        }
        System.out.print("Nhap so k: ");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int firstElement = queue.poll();
            queue.offer(firstElement);
        }
        System.out.println("List:");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
