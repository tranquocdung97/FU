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
public class Ex46 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Please enter the number of array elements: ");
        int k = ip.nextInt();
        int a[] = new int[k];
        for(int i = 0;i < a.length;i++){
            System.out.println("enter the number of element: "+i);
            a[i] = ip.nextInt();}
        Quicksort(a,0,k-1);
        System.out.println(Arrays.toString(a));
    }
    public static void Quicksort(int[] a, int l, int r) {
        int p = a[(l + r) / 2];
        int i = l, j = r;
        while (i < j) {
            while (a[i] < p) {
                i++;
            }
            while (a[j] > p) {
                j--;
            }
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (i < r) {
            Quicksort(a, i, r);
        }
        if (l < j) {
            Quicksort(a, l, j);
        }
    }
}

