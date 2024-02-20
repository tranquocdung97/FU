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
public class Ex36 {
    public static void main(String[] args) {
         int start = 0;
        Scanner ip = new Scanner(System.in);
        System.out.println("Please enter the number of array elements: ");
        int k = ip.nextInt();
        if (k < 1){
            System.out.println("Error");
        }
        int a[] = new int[k];
        int end = a.length - 1;
        for (int i = 0;i < a.length;i++){
            System.out.println("Please enter the array elements: "+i);
            a[i] = ip.nextInt();
        }
        System.out.println("enter number: ");
        int x = ip.nextInt();
        int n = -1;
        for (int i =0; i <a.length - 1;i++){
            if (a[i] > a[i+1]){
                System.out.println("Error");
                n = 0;
                break;
            }
        }
        		while (start < end) {
			int mid = (start + end) / 2;
			if (a[mid] < x)
				start = mid + 1;
			else
				end = mid;
		}
		if (a[start] == x)
			         System.out.println(start); 
		else
			         System.out.println("-1");
	}
    }


