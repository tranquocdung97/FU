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
public class Ex37 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Please enter the number of array elements: ");
        int n = ip.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < a.length;i++){
            System.out.println("Please enter the array elements: "+i);
            a[i] = ip.nextInt();
        }
        System.out.println("Enter number: ");
        int s = ip.nextInt();
        for (int i = 0; i < a.length - 1; i++) {
	int start = i;
	int sum = a[i];
	for (int j = i + 1; j < a.length; j++) {
		int end = j;
		sum += a[j];
		if (sum > s)
		break;
		if (sum == s) {
	for (int k = start; k <= end; k++)
		System.out.print(a[k] + " ");
		return;	}
			}
		}
		System.out.println(-1);
        }
    }
