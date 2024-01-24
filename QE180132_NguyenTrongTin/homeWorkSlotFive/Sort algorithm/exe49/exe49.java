
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=input.nextInt();
        }
        quickSort(array, 0, n-1);
        int k=input.nextInt();
        int count=1;
        for (int i = 1; i < n; i++) {
            if(array[i]-array[i-1]>k)
                count++;
        }
        System.out.print(count);
    }
              public static void quickSort(int[] array, int l, int r){
       int i=l;int j=r;
       int p = array[(l+r)/2];
       while(i<j){
           while(array[i]<p){
               i++;
           }
           while(array[j]>p){
               j--;
           }
           if(i<=j){
               int hold = array[i];
               array[i] = array[j];
               array[j] = hold;
               i++;
               j--;
           }
       }
       if(i<r){
           quickSort(array, i, r);
       }
       if(l<j){
           quickSort(array, l, j);
       }
    }  
    
}  
