/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b36;
import java.util.Scanner;
/**
 *
 * @author PHUC
 */
public class B36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                index = i;
                break;
            }
        }
    System.out.println(index);
    }
}
