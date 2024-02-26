/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b41;
import java.util.Scanner;
/**
 *
 * @author PHUC
 */
public class B41{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n; i++)
            a[i] = scanner.nextInt();
        scanner.close();
        for (int i = 0;i < a.length -1;i++){
            for(int j = 0; j < a.length - i -1; j++){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i : a)
            System.out.print(i + " ");
    }
}