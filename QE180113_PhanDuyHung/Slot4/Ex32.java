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
public class Ex32 {
    public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);
        System.out.println("hay nhap vao so luong phan tu mang: ");
    int n = ip.nextInt();
    int arr[] = new int[n];
        System.out.println("hay nhap vao so ma ban muon tim; ");
    int k = ip.nextInt();
    for (int i = 0;i<arr.length;i++){
        System.out.println("hay nhap vao phan tu so "+(i+1)+" ");
            arr[i] = ip.nextInt();
        }
    int giatri = -1;
    for (int i = 0;i < arr.length;i++){
        if (arr[i] == k){
            giatri = i;
            System.out.println("gia tri tra ve se la: "+giatri);
            break;
        }
        }
    if (giatri == -1){
        System.out.println("vi gia tri khong co nen ket qua se tra ve: "+giatri);
    }
    }
}
    

