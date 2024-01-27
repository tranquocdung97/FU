
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new  int[n];
        for (int i = 0; i < n; i++) {
            array[i]=input.nextInt();
        }
        selectionSort(array, n);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }

    }
    public static void selectionSort(int[] array, int n){
        for (int i = 0; i < n; i++) {
            int indexMin=i;
            for (int j = i+1; j < n; j++) {
                if(array[indexMin]>array[j]){
                    indexMin=j;
                }
            }
            if(i != indexMin){
                int hold = array[indexMin];
                array[indexMin] = array[i];
                array[i] = hold;
            }
        }
    }
}
