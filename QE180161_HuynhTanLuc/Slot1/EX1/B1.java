/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b1;

import java.util.Scanner;

/**
 *
 * @author Tan Luc
 */
public class B1 {

    public static void main(String[] args) {
        int n;
        int[] a = new int[101];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();      
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += a[i];
        }
        System.out.println(s);
    }
    
}
