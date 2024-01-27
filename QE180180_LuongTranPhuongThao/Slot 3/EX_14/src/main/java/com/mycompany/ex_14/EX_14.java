/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_14;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class EX_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        String binaryString = convertToBinary(n);
        System.out.println("Ma nhi phan la: " + binaryString);
    }

    public static String convertToBinary(int n) {
        if (n == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            int remainder = n % 2;
            binary.insert(0, remainder);
            n /= 2;
        }

        return binary.toString();
    }
}
