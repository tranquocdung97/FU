/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b47;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author PHUC
 */
public class B47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n; i++)
            a[i] = scanner.nextInt();
        int smallestMissingNumber = findSmallestMissingNumber(a);
        System.out.println(smallestMissingNumber);
    }
    public static int findSmallestMissingNumber(int[] a) {
        Arrays.sort(a);
        int smallestMissingNumber = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == smallestMissingNumber) {
                smallestMissingNumber++;
            }
        }
        return smallestMissingNumber;
    }
}