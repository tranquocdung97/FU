/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array;
import java.util.Scanner;
/**
 *
 * @author PHUC
 */
public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] a = new int[6][6];
        System.out.println("Nhap mang 2 chieu:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                a[i][j] = s.nextInt();
            }
        }
        
        int max = 0;
        
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                try {
                int sum = a[i][j] + a[i-1][j-1] + a[i-1][j] + a[i-1][j+1] + 
                          a[i+1][j-1] + a[i+1][j] + a[i+1][j+1];
                
                if (sum > max) {
                    max = sum;
                }
            }
            catch(Exception e){
                System.out.println("Nhap mang khong dung");
            }
        }
        System.out.println("Tong so lon nhat: " + max);
    }
}
}
