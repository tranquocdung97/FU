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
public class Ex45 {
    static void Sort(int a[], int k){
	int interval, i, j;
	for(interval = k/2; interval > 0; interval /= 2){
		for(i = interval; i < k; i++){
			int n = a[i];
			for(j = i; j >= interval && a[j - interval] > n; j -= interval){
				a[j] = a[j - interval];				
			}
			a[j] = n;
		}
    }
}
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Please enter the number of array elements: ");
        int k = ip.nextInt();
        int a[] = new int[k];
        for(int i = 0; i < a.length;i++){
            System.out.println("enter the number of element: "+i);
            a[i] = ip.nextInt();
        }
        Sort(a,k);
        System.out.println(Arrays.toString(a));
    }
}
