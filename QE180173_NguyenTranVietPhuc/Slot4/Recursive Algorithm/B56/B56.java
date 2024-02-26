/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b56;
import java.util.Scanner;
/**
 *
 * @author PHUC
 */
public class B56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long minGuesses = findMinGuesses(n);
        System.out.println(minGuesses);
    }
    public static long findMinGuesses(long n) {
        if (n == 1) {
            return 1;
        } else {
            long minGuesses = findMinGuesses(n / 2) + 1;
            return minGuesses;
        }
    }
}