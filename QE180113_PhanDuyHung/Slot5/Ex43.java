/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HUNG
 */
public class Ex43 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Please enter the number of array elements: ");
        int k = ip.nextInt();
        int a[] = new int[k];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the number of element: " + i);
            a[i] = ip.nextInt();
        }
        Sort(a, k);
        System.out.println(Arrays.toString(a));
    }

    static void Sort(int a[], int k) {
        for (int i = 0; i < a.length; i++) {
            min(a, k, i);
            int Min = min(a, k, i);
            if (i != a[i]) {
                int temp = a[i];
                a[i] = a[Min];
                a[Min] = temp;
            }
        }
    }

    public static int min(int a[], int k, int i) {
        int index = i;
        int min = a[index];
        for (int j = i + 1; j < k; j++) {
            if (min > a[j]) {
                min = a[j];
                index = j;
            }
        }
        return index;
    }
}
