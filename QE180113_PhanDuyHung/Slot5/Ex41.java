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
public class Ex41 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Please enter the number of array elements: ");
        int k = ip.nextInt();
        int a[] = new int[k];
        for(int i = 0;i < a.length;i++){
            System.out.println("Please enter the array elements: "+i);
            a[i] = ip.nextInt();
        }
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
         System.out.println("the value of array after BubbleSort is: "+Arrays.toString(a));
}
}
