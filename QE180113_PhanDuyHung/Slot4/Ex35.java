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
public class Ex35 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Please enter the number of array elements: ");
        int k = ip.nextInt();
        int n = 1;
        int a[] = new int[k];
        for (int i = 0;i < a.length; i++){
            System.out.println("Please enter the array elements: "+i);
            a[i] = ip.nextInt();
        }
        System.out.println("Odd numbers in even positions in the array are: ");
        for (int i = 0;i < a.length;i++){
            if (i % 2 == 0 && a[i] % 2 == 1){
                n = 0;
                System.out.println(a[i]);
            }
        }
          if (n != 0) {
            System.out.println("Null");
        }
    }
}
