
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=input.nextInt();
        }
        BubbleSoft(array, n);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void BubbleSoft(int[] array, int n){
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if(array[j-1]>array[j]){
                    int hold = array[j];
                    array[j]=array[j-1];
                    array[j-1]=hold;
                }
            }
        }
    }
}
