/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot3;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Ex17 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("nhap vao so luong phan tu chuoi: ");
        int n = ip.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("hay nhap phan tu: ");
            queue.add(ip.nextInt());
        }
        System.out.println("nhap vao so lan bien doi chuoi: ");
        int k = ip.nextInt();
        for (int i = 0; i < k; i++) {
            int temp = queue.remove();
            queue.add(temp);
            System.out.println("gia tri cua chuoi lan "+(i+1)+" la: "+queue);
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + "error ");
        }
    }
}
