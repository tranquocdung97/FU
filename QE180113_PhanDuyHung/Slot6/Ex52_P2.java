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
public class Ex52_P2 {
    public static int giaiThua(int k){
	if (k == 0) return 1;
	return k * giaiThua(k-1);
}
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int k = ip.nextInt();
        giaiThua(k);
        System.out.println(giaiThua(k));
    }
}
