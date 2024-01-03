/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b8;

import java.util.Scanner;

public class B8 {

    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();        
        int[] a = new int[n];       
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int i = n - 1;
        int j = m - 1;
        int k = (n + m) - 1;       
        int[] c = new int[n+m];
        while (k >= 0) {
            if (j < 0 || (i >= 0 && a[i] > b[j])) {
                c[k] = a[i];
                i--;
            } else if (i < 0 || (j >= 0 && a[i] <= b[j])) {
                c[k] = b[j];
                j--;
            }
            k--;           
        }
        for (int l : c) {
            System.out.print(l + " ");
        }
    }
    
}
