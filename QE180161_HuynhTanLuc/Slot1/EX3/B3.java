/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b3;

import java.util.Scanner;

/**
 *
 * @author Tan Luc
 */
public class B3 {

    public static void main(String[] args) {
        int n, k, x;
        int[] a = new int[101];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();      
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        k = sc.nextInt();
        x = sc.nextInt();        
        int[] result = new int[n+1];
        for (int i = 0,j = 0; i < result.length; i++) {
        if (i == k)
            result[i] = x;
        else 
            result[i] = a[j++];
        }
        for (int i : result) {
            System.out.print(i+ " ");
        }
    }     
}
