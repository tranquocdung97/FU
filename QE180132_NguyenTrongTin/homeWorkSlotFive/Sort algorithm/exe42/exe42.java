
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=input.nextInt();
        }
        insertionSort(array, n);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void insertionSort(int[] array, int n){
        int index, value;
        for (int i = 1; i < n; i++) {
            index=i;
            value=array[i];
            while(index >0 && array[index-1]>value){
                array[index]= array[index-1];
                index--;
            }
            array[index]= value;
        }
    }
}
