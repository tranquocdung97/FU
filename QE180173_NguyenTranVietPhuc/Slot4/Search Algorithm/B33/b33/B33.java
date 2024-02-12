/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b33;
import java.util.Scanner;
/**
 *
 * @author PHUC
 */
public class B33 {
    private static void ChangeElement(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        int min = 0;
        int max = n-1;
        for (int i = 0; i < n; i++){
            if (a[i] > a[max])
                max = i;
            if (a[i] < a[min])
                min = i;
        }
        int temp = a[min];
            a[min] = a[max];
            a[max] = temp;
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        ChangeElement();
        
    }
}
