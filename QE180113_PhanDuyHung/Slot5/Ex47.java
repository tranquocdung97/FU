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
public class Ex47 {
    public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);
    System.out.println("Please enter the number of array elements: ");
    int k = ip.nextInt();
    int a[] = new int[k];
    for(int i = 0; i < a.length;i++){
        System.out.println("Please enter the number of array elements: "+i);
        a[i] = ip.nextInt();
    }
    Sort(a,k);
}
public static void Sort(int a[], int k){
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
            for(int j = 0;j < a[k-1];j++){
                if(j != a[j]){
                    System.out.println("the smallest value that not appear in the string is: "+j);
                    break;
                }
            }
    }
}
