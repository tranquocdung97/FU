/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b26;
import java.util.*;
/**
 *
 * @author PHUC
 */
public class B26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        LinkedList<Integer> List = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            List.add(num);
        }
        int k = s.nextInt();
        if (k < 0 || k >= n) {
            System.out.println("Chỉ số k không hợp lệ.");
            return;
        }
        int value_k = List.get(k);
        ListIterator<Integer> xoa = List.listIterator();
        while (xoa.hasNext()) {
            int v = xoa.next();
            if (v > value_k) {
                xoa.remove();
            }
        }
        for (int num : List) {
            System.out.print(num + " ");
        }
    }
}
