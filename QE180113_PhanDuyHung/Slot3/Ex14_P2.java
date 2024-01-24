/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot3;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Ex14_P2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Hãy nhập vào 1 số thập phân: ");
        int n = ip.nextInt();
        Integer.toBinaryString(n);
        System.out.println("Giá trị nhị phân là: " + Integer.toBinaryString(n));
    }
}
