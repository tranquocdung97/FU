/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot4;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Ex34 {
        public static void main(String[] args) {
        int sum = 0;
        Scanner ip = new Scanner(System.in);
        System.out.println("hay nhap vao so luong phan tu mang: ");
        int k = ip.nextInt();
        int a[] = new int[k];
        for (int i = 0; i < a.length; i++) {
            System.out.println("hay nhap vao phan tu so " + (i + 1) + " ");
            a[i] = ip.nextInt();
        }
            System.out.println("hãy nhập vào số mà bạn cần tìm: ");
            int n = ip.nextInt();
            for (int i = 0;i < a.length;i++){
                if(n == a[i]){
                    sum = sum + 1;
                }
            }
            System.out.println("tổng giá trị giống nhau là: "+sum);
        }
}