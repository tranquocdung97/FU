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
public class Ex38 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Please enter the number of array elements: ");
        int k = ip.nextInt();
        int a[] = new int[k];
        for (int i = 0;i < a.length;i++){
            System.out.println("Please enter the array elements: "+i);
            a[i] = ip.nextInt();
        }
        System.out.println("enter number that you need to find: ");
        int x = ip.nextInt();
        System.out.println(interpolationSearch(a, k, x));
        ip.close();
    }
    public static int interpolationSearch(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        while (low <= high && x >= arr[low] && x <= arr[high]) {
            if (low == high) {
                if (arr[low] == x) {
                    return low;
                }
                return -1;
            }
            int pos = low + (((high - low) / (arr[high] - arr[low])) * (x - arr[low]));
            if (arr[pos] == x) {
                return pos;
            }
            if (arr[pos] < x) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }
        return -1;
    }
}