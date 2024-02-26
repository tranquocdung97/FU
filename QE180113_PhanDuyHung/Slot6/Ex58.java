/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot6;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Ex58 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        String s = " ";
        dequy(n, s);
    }

    public static void dequy(int n, String s) {
        if (n == 0) {
            System.out.print(s + " ");
        } else {
            for (int i = 0; i <= 1; i++) {
                dequy(n - 1, s + Character.toString((char) (i + '0')));
            }
        }
    }
}
