/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot5;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Ex42 {
    static void sort(int a[]) {
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Please enter the number of array elements: ");
        int k = ip.nextInt();
        int a[] = new int[k];
        for(int i = 0;i < a.length; i++){
            System.out.println("enter the element of array: "+i);
            a[i] = ip.nextInt();
        }
        sort(a);
        System.out.println(Arrays.toString(a));
        }
    }
