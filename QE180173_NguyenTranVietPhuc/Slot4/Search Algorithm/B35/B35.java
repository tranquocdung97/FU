/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b35;
import java.util.Scanner;
/**
 *
 * @author PHUC
 */
public class B35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(findNum(a));
    }
    public static String findNum(int[] a) {
        int n = a.length;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i+= 2) {
            if (a[i] % 2 != 0) {
                s.append(a[i] + " ");
            }
        }
        if (s.toString().equals("")) {
            return "NULL";
        }
        return s.toString();
    }
}
