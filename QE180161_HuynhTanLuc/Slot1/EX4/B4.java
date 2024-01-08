/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b4;

import java.util.Scanner;

public class B4 {

    public static void main(String[] args) {
        int n, k, x;
        int[] a = new int[101];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        k = sc.nextInt();
        if (k < 0 || k > n)
            System.out.println("Input invalid index");
        else {
            int[] result = new int[n - 1];
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (i != k) {
                    result[index] = a[i];
                    index++;
                }
            }
            for (int i : result) {
                System.out.print(i + " ");
            }

        }
    }
}
