/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b14;

import java.util.Scanner;

public class B14 {
    public static String DecimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder binaryBuilder = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            binaryBuilder.insert(0, remainder);
            n = n / 2;
        }
        return binaryBuilder.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String binaryString = DecimalToBinary(n);
        System.out.print( binaryString);
    }
}
