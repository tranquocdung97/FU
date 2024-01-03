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
public class Task3 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int sum = 0;
        System.out.println("hay nhap so phan tu cua mang: ");
        int n = ip.nextInt();
        if (n<=0){
            System.out.println("Error");
        }else{
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("hay nhap mang: " +i);
            arr[i] = ip.nextInt();}
        for(int i=0;i<n;i++){
            arr[i]*=arr[i];
        }
        for (int i=0;i<n;i++){
            System.out.println("gia tri binh phuong la: " +arr[i] ); } 
        }
    }
}