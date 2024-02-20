/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot4;

import java.util.Scanner;

/**
 *
 * @author HUNG
 */
public class Ex33 {

    public static int min(int a[], int n) {
        int index =0;
        int min = a[index];
        for (int i = 1; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
                index = i;
            }
        }
        return index;
    }
    public static int max(int a[], int n) {
         int index =0;
        int max = a[index];
        for (int i = 1; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("hay nhap vao so luong phan tu mang: ");
        int k = ip.nextInt();
        int a[] = new int[k];
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println("hay nhap vao phan tu so " + (i + 1) + " ");
            a[i] = ip.nextInt();
        }
        int min = min(a, k);
        int max = max(a, k);
        int temp = a[min];
        a[min] = a[max];
        a[max] = temp;
        for (int i = 0; i < k; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
