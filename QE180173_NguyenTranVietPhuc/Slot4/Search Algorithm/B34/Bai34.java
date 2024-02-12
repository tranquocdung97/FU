/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai34;
import java.util.Scanner;
/**
 *
 * @author PHUC
 */
public class Bai34 {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }
    int x = sc.nextInt();
    int count = 0;
    for(int i = 0; i < n; i++) {
        if(a[i] == x) {
            count++;
        }
        }
    System.out.print(count);
    }
}
