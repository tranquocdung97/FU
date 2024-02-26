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
public class Ex56 {
    public static int GuessNumber(long n) {
        if (n == 1) {
            return 1;
        }
        return 1 + GuessNumber(n - (n + 1) / 2);
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
       int  n = ip.nextInt();
        System.out.println(GuessNumber(n));
    }
}
