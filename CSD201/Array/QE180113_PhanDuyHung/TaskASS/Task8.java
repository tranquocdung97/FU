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
public class Task8 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("hay nhap so luong phan tu cua mang");
        int n = ip.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<=n;i++){
            System.out.println("hay nhap vao cac phan tu cua mang");
            arr[i] = ip.nextInt();
        }
        for(int i = 0;i<n;i++){
        if(arr[i]<arr[i-1] && arr[i]>arr[i-1]){
            System.out.println("yes");
        }
        else {System.out.println("no");
        }
    }
    }
}