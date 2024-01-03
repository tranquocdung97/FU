/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskASS;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("hay nhap vao so luong phan tu");
        int n = ip.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("hay nhap vao cac phan tu");
            arr[i] = ip.nextInt();
        }
        System.out.println(" ");
        for (int i=0;i<n;i++) {
            boolean Prime = true;
            if (arr[i] < 2) {
                Prime = false;
            } else {
                for (int j = 2; j<=(i-1);j++) {
                    if (arr[i]%j == 0) {
                        Prime = false;
                        break;
                    }
                } 
            } 
            if (Prime) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}