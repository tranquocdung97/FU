/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b53;

/**
 *
 * @author PHUC
 */
import java.util.Scanner;
public class B53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long result = calculatePower(a, b);
        System.out.print(result);
    }
    public static long calculatePower(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b % 2 == 0) {
            long temp = calculatePower(a, b / 2);
            return temp * temp;
        } else {
            long temp = calculatePower(a, b / 2);
            return a * temp * temp;
        }
    }
}