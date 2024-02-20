/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot5;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Ex48 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Please enter the number of array elements: ");
        int k = ip.nextInt();
        int a[] = new int[k];
        for(int i = 0;i < a.length;i++){
            System.out.println("Please enter the array elements: "+i);
            a[i] = ip.nextInt();
        }
        Sort(a,k);
        int sum = 1;
        for(int i = 1;i < a.length;i++){
            if(a[i] == a[i-1]){
                sum += 1;
            }
            else if (a[i] != a[i-1]){
                System.out.println(a[i-1]+" "+sum);
                sum = 1;
            }
        }
        System.out.println(a[a.length - 1] + " " + sum );
    }
    public static void Sort(int a[],int k){
                int n = 0;
        for (int i = k - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    n = 1;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
	}
    }
        if(n == 0){
            System.out.println("Error");
        }
    }
}
