/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot8;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Ex74 {

    public static void printArray(int[] a, int l, int r) {
        for (int i = l; i <= r; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        l[0] = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] >= a[i - 1]) {
                l[i] = l[i - 1] + 1;
            } else {
                l[i] = 1;
            }
        }
        int csMax = 0;
        for (int i = 0; i < n; i++) {
            if (l[csMax] < l[i]) {
                csMax = i;
            }
        }
        printArray(a, csMax - l[csMax] + 1, csMax);
    }
}

