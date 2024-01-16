/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot3;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Ex18 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("hay nhap vao 1 so de kiem tra so nguyen to nho hon hoac bang chinh no: ");
        int n = ip.nextInt();
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> sieusonguyento = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            q.add(Integer.valueOf(i));
        }
        while (!q.isEmpty()) {
            int front = q.remove();
            if (front > n) {
                break;
            }
            if (isPrime(front)) {
                sieusonguyento.add(front);
                for (int i = 0; i <= 9; i++) {
                    q.add(front + i);
                }
            }
        }
        System.out.println("Cac sieu so nguyen to nho hon hoac bang n la: " + n + " là: " + sieusonguyento);
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
