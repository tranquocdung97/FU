/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot5;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Ex50 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Please enter the number of array elements: ");
        int k = ip.nextInt();
        int a[] = new int[k];
        for(int i = 0;i < a.length;i++){
            System.out.println("enter the number of element: "+i);
            a[i] = ip.nextInt();}
          int[] b = new int[k];
        int n = 0;
        for (int i = 0; i < k; i++) {
            if (check(a[i])) {
                b[n] = a[i];
                n++;
            }
            
        }
        Sort(b,n);
        printArray(b,n);
    }
        public static void printArray(int[] a, int k) {
        if (k == 0) {
            System.out.println("NULL");
        } else {
            System.out.print(a[0] + " ");
            for (int i = 1; i < k; i++) {
                if (a[i] != a[i - 1]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }

    public static boolean check(int n) {
        int k = (int) Math.sqrt(n);
        return k * k == n;
    }
    public static void Sort(int a[], int k){
    int n = 0;
    for (int i = k - 1; i >= 1; i--) {
        for (int j = 0; j < i; j++) {
            if (a[j] > a[j + 1]) {
                n = 1;
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
	}
    }
}
}
