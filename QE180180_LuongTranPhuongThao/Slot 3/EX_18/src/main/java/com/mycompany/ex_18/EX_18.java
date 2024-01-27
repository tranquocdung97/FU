/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_18;

/**
 *
 * @author LENOVO
 */
public class EX_18{
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Day so sieu nguyen to nho hon hoac bang " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isSuperPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSuperPrime(int number) {
        if (!isPrime(number)) {
            return false;
        }

        String strNum = String.valueOf(number);

        for (int i = 1; i < strNum.length(); i++) {
            int truncatedNumber = Integer.parseInt(strNum.substring(0, strNum.length() - i));
            if (!isPrime(truncatedNumber)) {
                return false;
            }
        }

        return true;
    }
}