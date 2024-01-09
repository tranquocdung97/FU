/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b22;
import java.util.*;
/**
 *
 * @author PHUC
 */

public class B22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        LinkedList<Integer> List = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            List.add(num);
        }
        int k = s.nextInt();
        int x = s.nextInt();
        if (k < 0 || k > n) {
            System.out.println("Chi so khong hop le.");
            return;
        }
        List.add(k, x);
        for (int num : List) {
            System.out.print(num + " ");
        }
    }
}