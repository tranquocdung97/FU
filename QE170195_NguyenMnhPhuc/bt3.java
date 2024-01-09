/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd201;

/**
 *
 * @author MY PC
 */
public class bt3 {import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int currentElement = sc.nextInt();
            int squared = currentElement*currentElement;
            a[i] = squared;
        }
        for (int arraySquared : a) {
            System.out.print(arraySquared + " ");
        }
    }
}
    
}
