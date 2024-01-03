/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b6;

import java.util.Scanner;

public class B6 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i : a) {
            if (max < i) {
                max = i;
            }
        }
        int[] b = new int[max+1];         
        for (int i : a) {
            b[i]++;
        }
        for (int i = 0; i <= max; i++) {
            if (b[i] > 0) {
                System.out.print(i + " - " + b[i] + "; ");
            }
        }
    }

}
