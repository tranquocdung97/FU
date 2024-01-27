/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b42;

import java.util.Scanner;

public class B42 {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1 ; i < n; i++) {
            int ai = arr[i];
            int index = i;
            while (index > 0 && arr[index - 1] > ai) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index]  = ai;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
    }
    
}
